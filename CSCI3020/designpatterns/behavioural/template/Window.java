package designpatterns.behavioural.template;

public class Window {
    public void close() {

        executeTermination();

        System.out.println("Removing the window from the screen.");
        
    }

    protected  void executeTermination(){
    }
}
