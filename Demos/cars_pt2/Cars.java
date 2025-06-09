public class Cars {
    public static void main(String[] args) {
        CarType car1;
        CarType car2;

        car1 = new CarType(5, "Blue", 4, "Fiat", true, 'F');
        car2 = new CarType(2, "White", 2, "Renault", true, 'N');
        car1.printInfo();
        car2.printInfo();
    }
}
