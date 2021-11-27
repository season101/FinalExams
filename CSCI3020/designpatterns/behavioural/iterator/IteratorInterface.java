package designpatterns.behavioural.iterator;

public interface IteratorInterface {
    boolean hasNext();
    void next();
    Product current();
}
