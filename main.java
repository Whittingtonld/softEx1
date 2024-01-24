import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
public static Animal user;
private static boolean check;
private static int k;
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Chose any number this will decide your animal!");
	check = false;
	while(!check){
	try {
             k = in.nextInt();
            check = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            in.next(); // consume the invalid input
        }
	}
	if(k < 100 && k > 0){
		user = new dog();
	}
	if(k > 99){
		user = new cat();
	}
	
	user.animalSound();
	user.drive();



}


}
