import java.util.Scanner;
public class NextD {
   


  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Double value: ");

    // reads the double value
    double value = input.nextDouble();
    System.out.println("Using nextDouble(): " + value);

    input.close();
  }
}
    

