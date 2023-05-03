
package LabExer;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;


public class LabExer5A {
    static int stc=1;
			 public static void main(String[] args) {
 			 Random randomize = new Random();
 			 int no = randomize.nextInt(50)+1;
			 LabExer5A GuesstheGame = new LabExer5A(no);
 	}
 	public LabExer5A(int no) {
 		Scanner s = new Scanner(System.in);
		System.out.println("Guess a number from 1 to 50!: ");
	    int guess_thevalue;
	    
 try{
 	do{
 	guess_thevalue = s.nextInt();
 	if((guess_thevalue> 50) || (guess_thevalue < 1)) {
 	throw new OutOfRange();
  }
 	if(guess_thevalue == no) {
 	System.out.println("You got it in " + stc + " 3attempts(s)!");

  }     else if(no > guess_thevalue) {
       System.out.println("Too low. Try again. ");
       stc++;
  }     else if (no < guess_thevalue) {
       System.out.println("Too high. Try again.");
       stc++;
  }
    }
    while(guess_thevalue!=no);
    }
     catch(InputMismatchException ex) {
       System.out.println("Invalid input.");
        LabExer5A GuesstheGame = new LabExer5A(no);
    }       
 	catch(OutOfRange eg) {
           System.out.println(eg.getMessage());
            LabExer5A GuesstheGame = new LabExer5A(no);
    }
  }
    
    
    
    
}
