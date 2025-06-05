public class Cars {
    public static void main(String[] args) {
        CarType car1;
        CarType car2;
        CarType car3;

        car1 = new CarType(5, "Blue", 4, "Fiat", true, 'F');
        car2 = new CarType(2, "White", 2, "Renault", true, 'N');
        car3 = new CarType(5, "Green", 2, "Chevrolet", false, 'D');
        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
    }
}
