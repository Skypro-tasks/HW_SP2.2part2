package Service;

public class VehicleServiceStation implements ServiceStation{

    public void check(Bicycle[] bicycles){
        for (int i = 0; i < bicycles.length; i++) {
            serviceVehicle(bicycles[i]);
            serviceWheels(bicycles[i]);
            System.out.println();
        }
        System.out.println("______________________________________");
    };

    public void check(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            serviceVehicle(cars[i]);
            serviceWheels(cars[i]);
            checkEngine();
            System.out.println();
        }
        System.out.println("______________________________________");
    };

    public void check(Truck[] trucks){
        for (int i = 0; i < trucks.length; i++) {
            serviceVehicle(trucks[i]);
            serviceWheels(trucks[i]);
            checkEngine();
            checkTrailer();
            System.out.println();
        }
        System.out.println("______________________________________");

    };

    private void serviceVehicle(Vehicle vehicle){
        System.out.println("Service " + vehicle.getModelName());
    }

    private void serviceWheels(Vehicle vehicle){
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            updateTyre();
        }
    }

    private void updateTyre() {
        System.out.println("Update tyre");
    }

    public void checkEngine() {
        System.out.println("Check engine");
    }

    public void checkTrailer() {
        System.out.println("Check trailer");
    }
}

