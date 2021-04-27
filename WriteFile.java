import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeLine(MyStack octalStack,String end) throws IOException {
        File file = new File("octal.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        while (!octalStack.isEmpty()) {
            String number=Integer.toString(octalStack.pop());
            bWriter.write(number);
        }
        if(!end.equals("end")){
            bWriter.write("\n");
        }
        bWriter.close();
    }
}
