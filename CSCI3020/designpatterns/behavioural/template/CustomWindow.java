package designpatterns.behavioural.template;

public class CustomWindow extends Window {

    @Override
    protected void executeTermination() {
        System.out.println("Saving the unsaved files.");
    }
    
}
