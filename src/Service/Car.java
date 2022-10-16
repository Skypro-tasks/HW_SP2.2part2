package Service;

public class Car extends Vehicle implements Repair {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceVehicle();
        updateTyre();
        checkEngine();
        System.out.println();
    }

    public void serviceVehicle(){
        System.out.println("Обслуживаем автомобиль " + super.getModelName());
    }

    public void updateTyre() {
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку автомобиля");
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }


}

