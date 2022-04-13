package baitap;

import java.io.IOException;
import java.util.Scanner;

public class ProductMain{
    public ProductMain() throws IOException {
        ProductView productView = new ProductView();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. CREATE PRODUCT");
        System.out.println("2. SHOW LIST PRODUCT");
        int chooseMenu = sc.nextInt();
        switch (chooseMenu){
            case 1: productView.formCreateProduct();
                break;
            case 2: productView.showListProduct();
            break;
        }
    }

    public static void main(String[] args) throws IOException {
        new ProductMain();
    }
}
