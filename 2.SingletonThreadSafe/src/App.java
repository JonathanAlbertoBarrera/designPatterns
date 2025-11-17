public class App {
    public static void main(String[] args) throws Exception {
        ThreadSafeSingleton threadSafeSingletonOne=ThreadSafeSingleton.getInstanciaTread();
        ThreadSafeSingleton threadSafeSingletonTwo=ThreadSafeSingleton.getInstanciaTread();
        
        System.out.println(threadSafeSingletonOne==threadSafeSingletonTwo ? "Solo hay una instancia thread safety":"El singleton ha fallado");

    }
}
