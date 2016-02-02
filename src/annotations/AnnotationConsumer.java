package annotations;

/**
 * @author effessio
 */
public class AnnotationConsumer {
    @MyAnnotation()
    public static void method1() {
        System.out.println("method 1");
    }

    @MyAnnotation("goodbye")
    public static void method2() {
        System.out.println("method 2");
    }

    @MyAnnotation(value = "hey", times = 3)
    public static void method3() {
        System.out.println("method 3");
    }

    @MyAnnotation (avalable = false)
    public static void method4() {
        System.out.println("method 4");
    }
}
