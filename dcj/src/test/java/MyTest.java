import java.io.*;

public class MyTest {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Administrator\\Desktop\\myTest1.txt");

        InputStream is = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(is);

        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[200];

        int len;
        while (-1 != (len = isr.read(buffer))) {

            //调用append(char[] str, int offset, int len) 方法，注意第三个参数len是流真正读取的长度
            //另外注意该方法与append(char[] str)方法的区别
            sb.append(buffer, 0, len);
        }

        String result = sb.toString();

        System.out.println(result);

        isr.close();
        is.close();

    }
}
