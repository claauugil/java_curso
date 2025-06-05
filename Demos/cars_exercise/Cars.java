public class Cars {
    public static void main(String[] args) {
        CarType car1;
        CarType car2;
        CarType car3;

        car1 = new CarType(5, "Blue", 4, "Fiat", true, 'F');
        car2 = new CarType(2, "White", 2, "Renault", true, 'N');
        car3 = new CarType(5, "Green", 2, "Chevrolet", false, 'D');
        System.out.printf("The fist car's brand is: %s, its color is %s and it has %d seats\n", car1.brand, car1.color, car1.numberOfSeats);
        System.out.printf("The second car's brand is: %s, its color is %s and it has %d seats\n", car2.brand, car2.color, car2.numberOfSeats);
        System.out.printf("The third car's brand is: %s, its color is %s and it has %d seats\n", car3.brand, car3.color, car3.numberOfSeats);
    }
}
