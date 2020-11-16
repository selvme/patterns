import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        int c;
        try {
            InputStream in =
                    new MyReader(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\Admin\\Desktop\\java.education\\pattern-decorator-io\\src\\text.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
