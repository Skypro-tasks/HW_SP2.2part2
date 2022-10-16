package Service;

public class Bicycle extends Vehicle implements Repair {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceVehicle();
        updateTyre();
        System.out.println();
    }

    public void serviceVehicle(){
        System.out.println("Обслуживаем велосипед " + super.getModelName());
    }

    public void updateTyre() {
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку велосипеда");
        }
    }

}

