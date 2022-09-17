package Service;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW", 4),
                new Car("Audi", 4)
        };

        Truck[] trucks = {
                new Truck("Kamaz", 6),
                new Truck("MAN", 8)
        };

        Bicycle[] bicycles = {
                new Bicycle("Specialized", 2),
                new Bicycle("Giant", 2)
        };

        VehicleServiceStation service = new VehicleServiceStation();
        service.check(bicycles);
        service.check(cars);
        service.check(trucks);




    }

}