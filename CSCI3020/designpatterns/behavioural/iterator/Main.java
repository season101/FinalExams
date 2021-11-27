package designpatterns.behavioural.iterator;

import designpatterns.behavioural.iterator.ProductCollection.ProductIterator;

public class Main {
    public static void main(String[] args) {
        ProductCollection store = new ProductCollection();
        store.add(new Product(1,"Apple"));
        store.add(new Product(2, "Orange"));
        store.add(new Product(3, "Mango"));

        ProductIterator it = store.getIterator();
        while(it.hasNext()){
            System.out.println(it.current().toString());
            it.next();
        }

    }
}
