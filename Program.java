//import stuff here
import java.util.Scanner;

//declare variables
public class Program7 {

    public static void main (String args[]) {
        
        //call scanner
        Scanner myScanner = new Scanner(System.in);
        
        //intialize variables
        double schruteBucks = 0.0;
        double klevins = 0.0;
        double stanleyNickels = 0.0;
        double decSchruteBuck = 0.0;
        
        //ask for user input
        System.out.println("Enter schrute-bucks: "); 
        schruteBucks = myScanner.nextDouble();
        
        System.out.println("Enter klevins: ");
        klevins = myScanner.nextDouble();
        
        System.out.println("Enter stanley-nickels ");
        stanleyNickels = myScanner.nextDouble();
        
        //perform calculations
        klevins = klevins / 20.0;
        stanleyNickels = stanleyNickels / 240;
        decSchruteBuck = (schruteBucks + klevins + stanleyNickels) + 0.005;
        
        //casting
        decSchruteBuck = (int)(decSchruteBuck * 100);
        decSchruteBuck = (double)(decSchruteBuck / 100);
        
        //output
        System.out.println ("Decimal schrute-bucks = $" + decSchruteBuck);
        
    }
}


//Paste console output below:
/*Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels 
9
Decimal schrute-bucks = $7.89

/*


*/
