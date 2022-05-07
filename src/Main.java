import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        String command = "";

        //System.out.print("Enter command: "); // на същия ред ще иска да се въведе команда
       // command = consoleInput.nextLine();

        while (!Objects.equals(command, "exit")) {
            String commandInfo[] = command.split(" ");
            String action = commandInfo[0];

            if (action.contains("open")) {
                System.out.println("Function Open File");
                System.out.println(Arrays.toString(commandInfo));
            }

            System.out.print("Enter command: ");
            command = consoleInput.nextLine().toLowerCase(Locale.ROOT);// команди с малки букви ще се разчитат
        }

        System.out.println("Exiting the program..."); // печет за край
    }
}
