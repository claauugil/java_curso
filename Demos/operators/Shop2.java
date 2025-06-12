package Demos.operators;

import java.util.Scanner;

public class Shop2 {

    static final double  TSHIRT_PRICE = 16;
    static final double  PANTS_PRICE = 22;

    static int[] getNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Venta de paquetes de pantalones a: %s EU\n", PANTS_PRICE);
        System.out.printf("Venta de paquetes de camisetas a: %s EU\n",  TSHIRT_PRICE);
        System.out.printf("Ingresa el número de paquetes pantalones a comprar:\n");
        int pantsPackets = scanner.nextInt();
        System.out.printf("Ingresa el número de paquetes camisetas a comprar:\n");
        int tshirtPackets = scanner.nextInt();
        scanner.close();
        int result[] = {pantsPackets, tshirtPackets};
        return result;
    }
    public static void main(String[] args) {
        
        int     numPacks[] = getNumber();
        int     pantsPackets = numPacks[0];
        int     tshirtPackets = numPacks[1];
        int     numPacktsTotal = pantsPackets + tshirtPackets;
        double  discount = 0.15;
        int     shipCost = 0;
        double  promo = 0;

        if (numPacktsTotal < 5)
        {
            System.out.println("No se puede realizar la venta");
            return;
        }
        else if (numPacktsTotal < 10)
        {
            discount = 0.05;
            shipCost = 10;
        }
        else if (numPacktsTotal < 20)
        {
            discount = 0.10;
            shipCost = 5;
        }
        double total = tshirtPackets * TSHIRT_PRICE + pantsPackets * PANTS_PRICE;
        double finalDiscount = total * discount;
        double totalShipping = numPacktsTotal* shipCost;
        double finalPrice = total - finalDiscount + totalShipping;
        if (total >= 1000)
        {
            promo = total * 0.10;
            finalPrice -= promo;

            System.out.println("""
                Paquetes de pantalones:     %s
                Paquetes de camisetas:      %s
                Número de paquetes total:   %s
                -------------------------------
                Precio total de producto: %s EU
                Descuento aplicado:       %s EU
                Gastos de envío           %s EU
                --------------------------------
                PROMO:                  %.2f EU
                --------------------------------
                Total:                    %s EU
                """.formatted(pantsPackets, tshirtPackets, numPacktsTotal, total, finalDiscount,
                            totalShipping, promo, finalPrice)); 
        }
        else 
        {
            double leftForPromo = 1000 - total;
             System.out.println("""
                Paquetes de pantalones:     %s
                Paquetes de camisetas:      %s
                Número de paquetes total:   %s
                -------------------------------
                Precio total de producto: %s EU
                Descuento aplicado:       %s EU
                Gastos de envío           %s EU
                --------------------------------
                PROMO NO APLICADA        
                Faltante para promo:      %s EU
                --------------------------------
                Total:                    %s EU
                """.formatted(pantsPackets, tshirtPackets, numPacktsTotal, total, finalDiscount,
                                totalShipping, leftForPromo, finalPrice)); 
        }
    }
}
