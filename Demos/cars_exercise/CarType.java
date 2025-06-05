public class CarType {
    int     numberOfSeats;
    String  color;
    int     numberOfDoors;
    String  brand;
    boolean isAuto;
    char    type;

    CarType(
            int numberOfSeats,
            String color,
            int numberOfDoors,
            String brand,
            boolean isAuto,
            char type)
    {
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.brand = brand;
        this.isAuto = isAuto;
        this.type = type;
    }
    void printInfo()
    {
        String msg;
        msg = """
                *************************
                Número de asientos: %d
                Color: %s
                Número de puertas: %d
                Marca: %s
                Es automático: %b
                Tipo: %c
                *************************
                """;
        System.out.println(msg.formatted(numberOfSeats,
                                        color,
                                        numberOfDoors,
                                        brand,
                                        isAuto,
                                        type));
    }
}
