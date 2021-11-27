package designpatterns.behavioural.memento;
import java.util.Stack;

public class CareTaker{
    Stack<Memento> documentMementos = new Stack<>();
    public Memento getMemento(){

        return documentMementos.pop();
    }
    public void setMemento(Memento m){
        documentMementos.push(m);
    }
}
