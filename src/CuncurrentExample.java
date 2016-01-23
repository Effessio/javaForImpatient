import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * @author effessio
 */
public class CuncurrentExample {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        ExecutorCompletionService service = new ExecutorCompletionService(executor);

        Path dir = Paths.get("/Users/effessio/study_java/src/c_files");
        List<Callable<Integer>> tasks = Files.walk(dir).map(path -> wordCount(path, "slow")).collect(Collectors.toList());
        List<Future<Integer>> results = executor.invokeAll(tasks);
        Integer total = 0;
        for(Future<Integer> i: results) {
             total += i.get();
        }
        System.out.println(total);
    }

    public static Callable<Integer> wordCount(Path p, String word) {
        return new Callable() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                if (Files.isDirectory(p)) return 0;
                for (String line : Files.readAllLines(p, StandardCharsets.US_ASCII)) {
                    for (String w : line.split(" ")) {
                        if (w.toLowerCase().contains(word)) {
                            result++;
                        }
                    }
                }
                System.out.println(p.getFileName()+" finished");
                return new Integer(result);
            }
        };
    }
}
