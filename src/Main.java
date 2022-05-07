import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        String command;

        System.out.print("Enter command: "); // на същия ред ще иска да се въведе команда
        command = consoleInput.nextLine();

        System.out.println("The command is: " + command); // печет на резултата
    }
}
