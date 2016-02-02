package annotations;

import java.lang.reflect.Method;

/**
 * @author effessio
 */
public class AnnotationAnalyser {
    public static void main(String[] args) throws Exception {
        for (Method method : AnnotationConsumer.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                method.invoke(AnnotationConsumer.class);
                if (annotation.avalable()) {
                    for (int i = 0; i < annotation.times(); i++) {
                        System.out.println(annotation.value());
                    }
                    System.out.println();
                }
            }
        }
    }
}
