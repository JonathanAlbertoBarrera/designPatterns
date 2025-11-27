
/**
 * Cliente (client).
 *
 * Representa el cliente que utilizará la interfaz objetivo.
 *
 */

class AdapterClient {

    private EmailSender sender;

    public AdapterClient(EmailSender sender) {

        this.sender = sender;

    }

    public void execute() {

        String from = "correos@utez.com";
        String to = "destino@utez.com";
        String subject = "Mensaje desde un adaptador";
        String body = "Vamos, vamos, vamos.";
        sender.send(from, to, subject, body);

    }


}
