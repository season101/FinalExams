package designpatterns.behavioural.strategy;

public class ChatClient {
    private EncryptionAlgorithmInterface encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithmInterface encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
       encryptionAlgorithm.encrypt(message);
    }
}
