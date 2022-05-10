import java.util.ArrayList;
import java.util.Scanner;

public class  HowLarge {
    

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

        System.out.println("The total amount  of items in the list  is: " + listOfStrings.size());
        scanner.close();
    }    
}
