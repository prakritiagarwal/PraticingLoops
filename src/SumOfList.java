import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {   

public static void main(String[] args)  {
    System.out.println("Enter a number!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
        int userInput;
        do {
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == 0)
                break;
                listOfIntegers.add(userInput);
        } while(true);   
        System.out.println("Done entering integers to the list");      
        sumOfList(listOfIntegers);
        scanner.close();
    }

    public static void sumOfList(ArrayList<Integer> listOfIntegers)
    {
        int sum = 0;
        for(int i=0; i<listOfIntegers.size(); i++)
        {
            System.out.print(listOfIntegers.get(i) + " ");
            sum = sum + listOfIntegers.get(i);
        }
        System.out.println(" were the items on the list. The sum is " + sum);
    }
}