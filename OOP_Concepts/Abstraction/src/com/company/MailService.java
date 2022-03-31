package src.com.company;

public class MailService {
    public void sendMail(){
        // connect to the mail server
        connect();
        // authenticate the connection
        authenticate();

        // send the mail

        //disconnect
        disconnect();
    }

    private void connect(){
        System.out.println("Connect");
    }

    private void authenticate(){
        System.out.println("");
    }

    private void disconnect(){
        System.out.println("disconnect");
    }
}
