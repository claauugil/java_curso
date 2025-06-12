package Demos.operators;

import java.util.Scanner;

public class Shop {

    static final double  PRICE_PER_PACK = 20;

    static int getNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Venta de paquetes de ropa, cada uno cuesta: %s EU\n", PRICE_PER_PACK);
        System.out.printf("Ingresa el número de paquetes a comprar:\n");
        int numOfPackts = scanner.nextInt();
        scanner.close();
        return numOfPackts;
    }
    public static void main(String[] args) {
        
        int     numPacks = getNumber();
        double  discount = 0.15;
        int     shipCost = 0;

        if (numPacks < 5)
        {
            System.out.println("No se puede realizar la venta");
            return;
        }
        else if (numPacks < 10)
        {
            discount = 0.05;
            shipCost = 10;
        }
        else if (numPacks < 20)
        {
            discount = 0.10;
            shipCost = 5;
        }
        double total = numPacks * PRICE_PER_PACK;
        double finalDiscount = total * discount;
        double totalShipping = numPacks * shipCost;
        double finalPrice = total - finalDiscount + totalShipping;
        System.out.println("""
                Número de paquetes:       %s
                Precio total de producto: %s EU
                Descuento aplicado:       %s EU
                Gastos de envío:          %s EU
                --------------------------------
                TOTAL:                    %s EU
                --------------------------------
                """.formatted(numPacks, total, finalDiscount, totalShipping, finalPrice)); 
    }
}
