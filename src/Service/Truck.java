package Service;

public class Truck extends Vehicle implements Repair {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.updateTyre();
        super.checkEngine();
        super.checkTrailer();
        System.out.println();
    }

}