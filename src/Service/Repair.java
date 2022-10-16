package Service;

public interface Repair {
    default void check() {
        System.out.println("This service is not available at the moment");
    }
}
