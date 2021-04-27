import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyStack decimalStack =ReadFile.readOperations(args[0]);
        while(!decimalStack.isEmpty())
        for(int i=0;i<decimalStack.size();i++){
            MyStack octalStack = ConvertOctal.convertOctal(decimalStack.pop());
            if (i!=decimalStack.size()-1){
            WriteFile.writeLine(octalStack,"notEnd");}
            else{
                WriteFile.writeLine(octalStack,"end");
            }
        }

    }
}
