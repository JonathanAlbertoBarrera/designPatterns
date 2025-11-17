public class App {
    public static void main(String[] args) throws Exception {
        Singleton objectOne=Singleton.getInstancia();
        Singleton objectTwo=Singleton.getInstancia();

        System.out.println(objectOne==objectTwo ? "Solo hay una instancia":"El singleton ha fallado");
    }
}
