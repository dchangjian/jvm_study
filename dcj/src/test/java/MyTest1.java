import java.io.*;

public class MyTest1 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Administrator\\Desktop\\myTest1.txt");

        InputStream is = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        String line;
        StringBuilder sb = new StringBuilder();

        while(null != (line = bf.readLine())) {
            sb.append(line).append("\n"); //注意readline时会把换行符弄没了
        }
        System.out.println(sb.toString());

    }
}
