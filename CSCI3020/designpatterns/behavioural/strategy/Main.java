package designpatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient(new AES());   
        chatClient.send("HellowithAES");
        chatClient = new ChatClient(new DES());
        chatClient.send("HellowithDES");
    }
}
