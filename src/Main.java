import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        String command = "";

        //System.out.print("Enter command: "); // на същия ред ще иска да се въведе команда
       // command = consoleInput.nextLine();

        while (!Objects.equals(command, "Exit")) {
            System.out.print("Enter command: ");
            command = consoleInput.nextLine();
        }

        System.out.println("Exiting the program..."); // печет за край
    }
}
