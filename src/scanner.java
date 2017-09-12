//import
//challenge 1&3
import java.util.Scanner;

public class scanner{
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	
	//ask for name 
	System.out.println("Please enter your name?");
	String name=scanner.next();
	//System.out.println("is");
	System.out.println("What is your age?");
	int age=scanner.nextInt();
	System.out.println("What is your favorite TV program?");
	String tv=scanner.next();
	
	System.out.println(name + " " + age + " "+ "Likes watching "  + tv  );
 }
}
