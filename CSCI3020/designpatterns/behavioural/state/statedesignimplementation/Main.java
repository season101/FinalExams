package designpatterns.behavioural.state.statedesignimplementation;

public class Main {
    public static void main(String[] args) {
        DirectionService ds = new DirectionService(new Driving());
        System.out.println(ds.getDirection());
        ds.setTravelMode(new Bicycling());
        System.out.println(ds.getEta());      
        ds.setTravelMode(new Walking());
        System.out.println(ds.getEta());  
    }
}
