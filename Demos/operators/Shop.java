package Demos.operators;

import java.util.Scanner;


public class Shop {

    static int getNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero de paquetes");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    public static void main(String[] args) {
        
        int     numPacks = getNumber();
        double  discount = 0.0;
        double  shipCost = 0.0;
        double  pricePerPack = 5.0; 

        if (numPacks < 5)
        {
            System.out.println("No se puede realizar la venta");
            return;
        }
        else if (numPacks < 10)
        {
            discount = 0.05;
            shipCost = 10.0;
        }
        else if (numPacks < 20)
        {
            discount = 0.10;
            shipCost = 5.0;
        }
        else
        {
            discount = 0.15;
            shipCost = 0.0;
        }
        double subtotal = pricePerPack * numPacks;
        double descuentoAplicado = subtotal * discount;
        double precioConDescuento = subtotal - descuentoAplicado;
        double costoEnvio = shipCost * numPacks;
        double total = precioConDescuento + costoEnvio;
        
        System.out.printf("El total a pagar es %.2f", total);
    }
}
