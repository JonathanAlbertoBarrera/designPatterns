import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

class SparkPostAdapter implements EmailSender {

    @Override
    public void send(String from, String to, String subject, String body) {

        final String API_KEY = "SPARKPOST_API_KEY";

        //En este caso, el adaptee es la clase Client en la libreria de SparkPost.
        Client client = new Client(API_KEY);

        try {

            client.sendMessage(from, to, subject, body, null);
            System.out.println("Mensaje enviado con el adaptador de SparkPost");
        } catch (SparkPostException e) {
            e.printStackTrace();
            System.out.println("No se pudo enviar mensaje con el adaptador de SparkPost");
        }

    }
}
