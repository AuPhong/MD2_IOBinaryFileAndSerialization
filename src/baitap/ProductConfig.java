package baitap;

import thuchanh.thuchanh2.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductConfig {


    public static List<Product> readFromFile(String path){
        List<Product> productList = new ArrayList<>();
        try{
            FileInputStream fileInputStream  = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return productList;
    }

    public static void writeToFile(String path, List<Product> productList){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
