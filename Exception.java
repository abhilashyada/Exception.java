import java.util.Scanner;

public class Exception{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        
        try {
            String[] parts = value.split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            
            int result = A / B;
            System.out.println(result);
        } catch(ArithmeticException e) {
            System.out.println("Denominator can't be 0");
        } catch(NumberFormatException e){
            System.out.println("Input should be an integer");
        }
    }
}