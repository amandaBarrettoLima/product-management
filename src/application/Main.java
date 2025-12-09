package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the name of the products: ");
        String name = sc.nextLine();
        System.out.println("Enter the price of the products: ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity in stock: ");
        int quantity = sc.nextInt();

        System.out.println("----MENU----");
        System.out.println("1. Add Products");
        System.out.println("2. Remove Products");
        System.out.println("3. Look up Products");
        System.out.println("4. Exit the program");
        System.out.println("Choose one option: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Enter the number of products to be added in stock: ");
                int addQuantity = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter the number of products to be removed from stock: ");
                int removeQuantity = sc.nextInt();
                break;
            case 3:
                System.out.println("Updated data: %s, $ %f, %d units, Total: %f",name,price,quantity,totalValueInStock);

        }
    }
}