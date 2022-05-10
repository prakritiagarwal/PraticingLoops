import java.util.ArrayList;
import java.util.Scanner;

public class  IndexOfInteger {   

public static void main(String[] args)  {
   
        System.out.println("Enter a Number!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfStrings = new ArrayList<Integer>();
        int userInput;
        do {
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == 0)
                break;
            listOfStrings.add(userInput);
        } while(true);   
        System.out.println("Done entering integers to the list");
        System.out.println("What number you are looking for in the list?");
        int userInput2 = Integer.valueOf(scanner.nextLine());

        for(int i=0; i<listOfStrings.size(); i++)
        {
            if(listOfStrings.get(i) == userInput2)
                System.out.println(userInput2 + " is at index " + i);
        }


        scanner.close();
    }    
    
}