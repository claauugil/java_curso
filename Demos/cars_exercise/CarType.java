public class CarType {
    int     numberOfSeats;
    String  color;
    int     numberOfDoors;
    String  brand;
    boolean isAuto;
    char    type;

    CarType(int numberOfSeats, String color, int numberOfDoors, String brand, boolean isAuto, char type)
    {
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.brand = brand;
        this.isAuto = isAuto;
        this.type = type;
    }
}
