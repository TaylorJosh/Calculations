import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        int addition = numOne + numTwo;
        int subtraction = numOne - numTwo;
        int multiply = numOne * numTwo;
        Double divide = Double.valueOf(numOne) / Double.valueOf(numTwo);
        int modulus = numOne % numTwo;
        
        System.out.println(numOne + " + " + numTwo + " = " + addition);
        System.out.println(numOne + " - " + numTwo + " = " + subtraction);
        System.out.println(numOne + " x " + numTwo + " = " + multiply);
        System.out.println(numOne + " / " + numTwo + " = " + divide);
        System.out.println(numOne + " % " + numTwo + " = " + modulus);
    }
}
