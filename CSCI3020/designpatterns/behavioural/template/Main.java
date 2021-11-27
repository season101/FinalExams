package designpatterns.behavioural.template;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        window.close();
        window = new CustomWindow();
        window.close();
    }
}
