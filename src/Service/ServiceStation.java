package Service;

public interface ServiceStation {

    default void check(Bicycle[] bicycles){
        System.out.println("Service is temporarily unavailable");
    };

    default void check(Car[] cars){
        System.out.println("Service is temporarily unavailable");
    };

    default void check(Truck[] trucks){
        System.out.println("Service is temporarily unavailable");
    };

}

