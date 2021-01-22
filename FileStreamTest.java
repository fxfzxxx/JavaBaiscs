import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        arrayStream();
    }

    public static void arrayStream() {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("text.txt");
            OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
            for (byte b : bWrite) {
                writer.append(String.valueOf(b)); //没法用Tostring 因为b不是对象
            writer.close();
            os.close();
            
            InputStream is = new FileInputStream("text.txt");
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append((char)reader.read());
            }
            System.out.println(sb);
            reader.close();
            is.close();
        }
        } catch (Exception e) {
            System.out.print("Exception");
        }

        
    }
}
