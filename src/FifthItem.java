import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args)  {
        System.out.println("Enter a Number!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<String>();
        String userInput;
        do {
            userInput = scanner.nextLine();
            if(userInput.isEmpty())
                break;
            listOfStrings.add(userInput);
        } while(true);        

        System.out.println("The fifth item in the list  is: " + listOfStrings.get(4));
        scanner.close();
    }    
}
