package secil1app;

import java.util.Random;
import java.util.Scanner;

public class secilrandomnumbergame {

	public static void main(String[] args) {
		
		System.out.println("----RANDOM NUMBER GAME----"); // name of the game
		
		
		    Scanner scanner = new Scanner(System.in);
		 
			System.out.println("please enter a number: ");
			
			int enterednumber = scanner.nextInt();	
			int t=0 ;
			
			Random random = new Random();
			int num = random.nextInt(200) + 1 ;
			
			
			while(true) {    
				t++;
				if(num < enterednumber) {
					
					System.out.println("please enter a lower number ");	
				
				}
				
				else if (num > enterednumber) {
					
					System.out.println("please enter a higher number: ");
					
				}

				 else {
						System.out.printf("CONGRATS!! you guessed the number after %d attempts. \n", t); 
						break;                   
				 }
			System.out.println("TRY AGAIN: ");
			
			enterednumber = scanner.nextInt();			
			
			scanner.close();
			}	
		}	
	
}

