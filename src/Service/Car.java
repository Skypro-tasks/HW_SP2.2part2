package Service;

public class Car extends Vehicle implements Repair {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.updateTyre();
        super.checkEngine();
        System.out.println();
    }

}

