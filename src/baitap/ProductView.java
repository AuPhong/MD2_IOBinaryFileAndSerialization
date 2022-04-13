package baitap;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = ProductService.productList;
    ProductController productController = new ProductController();

    public void showListProduct() throws IOException {
        System.out.println(productController.showListProduct());
        System.out.println("Enter quit to come back Menu");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new ProductMain();
        }
    }

    public void formCreateProduct() throws IOException{
        while (true){
            int id;
            if(productList.size()==0){
                id = 1;
            }else {
                id = productList.get(productList.size()-1).getId()+1;
            }
            System.out.println("Enter the product's name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the product's manufacturer: ");
            String manufacturer = scanner.nextLine();
            System.out.println("Enter the product's price: ");
            double price = scanner.nextDouble();
            System.out.println("Enter the description: ");
            String description = scanner.nextLine();
            productController.createProduct(new Product(id, name,manufacturer,price,description));
            System.out.println("Enter any key to continue create product or enter QUIT to come back Menu");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")){
                new ProductMain();
            }

        }
    }
}
