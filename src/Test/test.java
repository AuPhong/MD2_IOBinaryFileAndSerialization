package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream inputStreamReader = new ObjectInputStream(new FileInputStream("C:\\Users\\Sang\\IntelliJ IDEA\\MD2_IOBinaryFileAndSerialization\\product.txt"));
        int i = -1;
        System.out.println(inputStreamReader.readObject());
        inputStreamReader.close();
    }
}
