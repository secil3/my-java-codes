package secil1app;

import java.util.Scanner;

public class secilgamepointcalculator {

	public static void main(String[] args) {
			
			System.out.println("---POINT CALCULATOR---");
		
			int y[]= new int[4];   //an array for how many time game is playing
			int points = 200;      // default everyone has 200 points in the beggining
			
			for(int i=0; i<4; i++) {    //
			
			    Scanner scanner = new Scanner(System.in);
				System.out.printf("enter playing number of subgame challenge level #%d: ",i+1);
				y[i] = scanner.nextInt();

				int a=0;  
				int b=0;
				int c=0;
				int d=0;
			
				
				if (i+1 ==1) {
					a = y[i]*90;
					
				}

				if (i+1 ==2) {
				    b= y[i]*120;
					
				}

				if (i+1 ==3) {
					c= y[i]*250;
					
				}

				if (i+1 ==4) {
					d= y[i]*300;
				}
				points = points + (a+b+c+d); // calculate the total points
	        }
	         
		
			System.out.printf("Player's point: %d",points);   // print the points
		
			
		}

}

	
	

