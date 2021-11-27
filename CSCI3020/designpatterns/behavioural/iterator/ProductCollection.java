package designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public ProductIterator getIterator(){
    return new ProductIterator(this);
  }
  public class ProductIterator implements IteratorInterface{
    private ProductCollection pc;
    private int index;

    public ProductIterator(ProductCollection productCollection) {
      this.pc = productCollection;
    }

    @Override
    public boolean hasNext() {
      return (index < pc.products.size());
    }

    @Override
    public void next() {
      index++;
      
    }

    @Override
    public Product current() {
      return pc.products.get(index);
    }

  }

}
