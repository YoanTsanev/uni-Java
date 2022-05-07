import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
                String fileName = commandInfo[1];
               // System.out.println("Function Open File");

                try {
                    File myFile = new File(fileName);
                    if (myFile.createNewFile()) {
                        System.out.println("File created: " + myFile.getName());
                        System.out.println("");
                    } else {
                        System.out.println("File already exists with the following context:");
                        System.out.println("↓");
                        Scanner myReader = new Scanner(myFile);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                        System.out.println("↑");
                        System.out.println("");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

               // System.out.println(Arrays.toString(commandInfo)); // ПРОВЕРКА!
               // System.out.println(fileName);// file path!!!
            }

            if (action.contains("help")){
//                System.out.println("---------");
//                System.out.println("HELP MENU");
//                System.out.println("---------");
                System.out.println("The following commands are supported:");
                System.out.println("Open <file> \t\t opens <file>");
                System.out.println("Close \t\t\t     closes the currently open file");
                System.out.println("Save \t\t\t     saves the currently open file");
                System.out.println("SaveAs <file> \t\t saves the currently open file in <file>");
                System.out.println("Help \t\t\t     prints this information");
                System.out.println("Exit \t\t\t     exists the program");
            }

            System.out.print("Enter command: ");
            command = consoleInput.nextLine().toLowerCase(Locale.ROOT);// команди с малки букви ще се разчитат
        }

        System.out.println("Exiting the program..."); // печет за край
    }
}
