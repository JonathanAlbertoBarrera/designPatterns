/**
 * Objetivo (target).
 *
 * Esta interfaz debe ser implementada por cada uno de los adaptadores, y debe ser utilizada por el cliente.
 *
 * */


interface EmailSender {

    void send(String from, String to, String subject, String body);

}
