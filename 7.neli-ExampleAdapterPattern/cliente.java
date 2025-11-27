public class cliente {
    public static void main(String[] args) {

        //Creamos el adaptador.
        EmailSender remitente = new SparkPostAdapter();

        //Inyectamos el adaptador al cliente.
        AdapterClient client = new AdapterClient(remitente);

        //Probemos si funciona correctamente.
        client.execute();

    }

}

