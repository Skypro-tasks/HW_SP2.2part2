package Service;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 4);
        Car car2 = new Car("Audi", 4);


        Truck truck = new Truck("Kamaz", 6);
        Truck truck2 = new Truck("MAN", 8);


        Bicycle bicycle = new Bicycle("Specialized", 2);
        Bicycle bicycle2 = new Bicycle("Giant", 2);


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.service(car);
        serviceStation.service(truck);
        serviceStation.service(bicycle);
        serviceStation.service(truck2);
        serviceStation.service(bicycle2);
        serviceStation.service(car2);

    }


}