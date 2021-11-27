package designpatterns.behavioural.strategy;

public class AES implements EncryptionAlgorithmInterface {

    @Override
    public void encrypt(String message) {
        System.out.println(message);
        System.out.println("Encrypting message using AES");        
    }
    
}
