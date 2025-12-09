package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

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
                int quantity = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter the number of products to be removed from stock: ");
                quantity = sc.nextInt();
                break;
            case 3:
                System.out.println(product.toString());
                break;
            case 4:
                System.out.println("Exit...");
                break;
            default:
                System.out.println("Error");
                break;


        }

        sc.close();
    }
}