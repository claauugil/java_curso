public class CarType {
    
    static  int numCars = 0;

    private int     id;
    private int     numberOfSeats;
    private String  color;
    private int     numberOfDoors;
    private String  brand;
    private boolean isAuto;
    private char    type;

    CarType(
            int numberOfSeats,
            String color,
            int numberOfDoors,
            String brand,
            boolean isAuto,
            char type)
    {
        numCars += 1;
        this.id = numCars;
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
                El id del coche es: %d
                Número de asientos: %d
                Color: %s
                Número de puertas: %d
                Marca: %s
                Es automático: %b
                Tipo: %c
                *************************
                """;
        System.out.println(msg.formatted(id,
                                        numberOfSeats,
                                        color,
                                        numberOfDoors,
                                        brand,
                                        isAuto,
                                        type));
    }
}
