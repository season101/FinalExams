package designpatterns.behavioural.strategy;

public class DES implements EncryptionAlgorithmInterface {

    @Override
    public void encrypt(String message) {
        System.out.println(message);
        System.out.println("Encrypting message using DES");        
    }
    
}
