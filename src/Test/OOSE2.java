package Test;

import java.io.*;

public class OOSE2 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(2, "b", 13000, "description");
            oos.writeObject(product);

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.txt"));
            int i = -1;
            while ((i = ois.read()) != -1) {
                System.out.println( i);
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
