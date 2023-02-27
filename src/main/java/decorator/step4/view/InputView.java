package decorator.step4.view;

import java.io.InputStream;
import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(InputStream inputStream){
        this.scanner = new Scanner(inputStream);
    }

    public int getAdditionalOrderConfirmation() {
        return readInt();
    }

    public int getOrderNumber() {
        return readInt();
    }
    public int readInt(){
        try {
            return Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            throw new RuntimeException("Please enter an integer.");
        }
    }

    public int getAddCondimentCount() {
        return readInt();
    }
}
