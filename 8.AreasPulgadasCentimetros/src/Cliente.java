public class Cliente {
    public static void main(String[] args) throws Exception {
        AreaInterface areaCuadrado = new AreaCuadrado();
        AreaInterface areaTriangulo = new AreaTriangulo();

        // se inyectan lso adaptadores al cliente
        AdapterClient client = new AdapterClient(areaCuadrado, areaTriangulo);

        client.execute();
    }
}
