package baitap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static String PATH = "C:\\Users\\Sang\\IntelliJ IDEA\\MD2_IOBinaryFileAndSerialization\\src\\baitap\\data.txt";
    public static List<Product> productList = ProductConfig.readFromFile(PATH);

    public List<Product> findAll() throws IOException{
        ProductConfig.writeToFile(PATH, productList);
        return productList;
    }

    public void save(Product product){
        productList.add(product);
    }




}
