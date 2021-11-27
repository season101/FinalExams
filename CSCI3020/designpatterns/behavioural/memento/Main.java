package designpatterns.behavioural.memento;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        CareTaker careTaker = new CareTaker();

        document.setContent("Hello");
        careTaker.setMemento(document.createMemento());
        
        document.setFontName("Font1");
        careTaker.setMemento(document.createMemento());

        document.setFontSize(10);

        System.out.println(document);

        document.restoreMemento(careTaker.getMemento());
        System.out.println(document);

        document.restoreMemento(careTaker.getMemento());
        System.out.println(document);
    }
}
