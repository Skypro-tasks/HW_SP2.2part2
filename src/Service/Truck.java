package Service;

public class Truck extends Vehicle implements Repair {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceVehicle();
        updateTyre();
        checkEngine();
        checkTrailer();
        System.out.println();
    }

    public void serviceVehicle(){
        System.out.println("Обслуживаем грузовик " + super.getModelName());
    }
    public void updateTyre() {
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку грузовика");
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

}