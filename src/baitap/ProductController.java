package baitap;

import thuchanh.thuchanh2.Student;

import java.io.IOException;
import java.util.List;

public class ProductController {
    ProductService productService = new ProductService();

    public List<Product> showListProduct() throws IOException{
        return productService.findAll();
    }

    public void createProduct(Product product){
        productService.save(product);
    }
}
