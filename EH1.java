import java.util.InputMismatchException;
import java.util.Scanner;

public class EH1 {
    public static void main(String[] args) {
        String str = null;
        int[] marks = { 23, 20, 19, 17, 12 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index you want to access in the array:");

        
        
        try {
            //input Mismatch
            int ind = sc.nextInt();

            //ArrayOutOfBound
            System.out.println("The value of array at the index entered is " + marks[ind]);

            //Arithematic Error
            System.out.println("Enter the number you want to divide the value with:");
            int number = sc.nextInt();

            //Null pointer error
            int length = str.length();
            System.out.println("The length of the string is" + length);

            //IO error
            int result = 10/0;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
               System.out.println("Some arithematic exception occured !");
               System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Some error due to array out of index error occured!");
                System.out.println(e);
        }catch(NullPointerException e){
            System.out.println("The string you selected was null");
        }catch(InputMismatchException e){
            System.out.println("Input Mismatch Occured");
            System.out.println(e);
        }
        
        catch (Exception e) {
                System.out.println("Some error occured");
                System.out.println(e);
        }


    }
}