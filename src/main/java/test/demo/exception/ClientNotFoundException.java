package test.demo.exception;
 import test.demo.model.Client;

public class ClientNotFoundException extends Exception {
    private long client_id;

    public ClientNotFoundException(long client_id) {
        super(String.format("Client is not found with id : '%s'", client_id));
    }
}