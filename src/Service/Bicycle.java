package Service;

public class Bicycle extends Vehicle implements Repair {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.updateTyre();
        System.out.println();
    }

}

