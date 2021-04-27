public class ConvertOctal {
    public static  MyStack convertOctal(int decimalNumber) {
        MyStack storeStack = new MyStack();
        while (8 <= decimalNumber) {
            storeStack.push(decimalNumber % 8);
            decimalNumber = decimalNumber / 8;
        }
        storeStack.push(decimalNumber);
        return storeStack;
    }
}
