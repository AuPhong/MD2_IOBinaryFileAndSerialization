package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSE {
    public static void main(String[] args) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1,"a",12000,null);
            oos.writeObject(product);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
