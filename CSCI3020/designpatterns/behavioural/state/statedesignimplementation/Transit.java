package designpatterns.behavioural.state.statedesignimplementation;

public class Transit implements TravelMode {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
    
}
