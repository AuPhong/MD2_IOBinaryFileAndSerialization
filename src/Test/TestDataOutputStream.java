package Test;

import java.io.*;

public class TestDataOutputStream {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;
//        while (true) {
//            System.out.print("Nhập 1 ký tự: ");
//            int ch = is.read();
//            if (ch == 'q') {
//                System.out.println("Finished!");
//                break;
//            }
//            is.skip(2); // Loại bỏ 2 ký tự \r và \n
//            System.out.println("Ký tự nhận được: " + (char) ch);
//        }

        InputStream is = new FileInputStream("CodeGym.txt");

        int i = -1;

        // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
        // Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
        while ((i = is.read()) != -1) {
            System.out.println(i);
        }
        is.close();
    }
    }

