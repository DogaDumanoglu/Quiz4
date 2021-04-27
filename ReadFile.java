import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;


public class ReadFile {
    public static List<String> readFile(String path) {
        try {
            return Files.readAllLines(Paths.get(path));

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static MyStack readOperations(String path) {
        MyStack decimalStack=new MyStack();
        MyStack reverseDecimalStack=new MyStack();
        List<String> lines = readFile(path);
        for (int i = 0; i < Objects.requireNonNull(lines).size(); i++) {
            decimalStack.push(Integer.parseInt(lines.get(i)));
        }
        while (!decimalStack.isEmpty()){
            reverseDecimalStack.push(decimalStack.pop());
        }

        return reverseDecimalStack;}

}
