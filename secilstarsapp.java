package secil1app;

import java.util.Scanner;


public class secilstarsapp {

		public static void main(String[] args) {
				
				Scanner scanner = new Scanner(System.in);
				System.out.print("please enter initial star number: ");
				String input = scanner.nextLine() ;       // enter a number or q
				int num = Integer.parseInt(input);        // if entered a string then convert to int 
				
				
				if(input.equalsIgnoreCase("q")) {         // if entered " q " then exit the system
					System.out.println("exiting the system...");
					System.exit(0);	
				}
				
				
				else {
				
				if(num%2 == 0) {                      // if entered number is equal to even number then run here
					
					for(int i=0; i<=num/2-1; i++) { 

						for(int h=0; h <= i*2; h=h+2) {
							
							System.out.print(" ");
						}
						
						for(int k=num/2-i-1; k>=0; k--) {
						
						System.out.print("*");
						}
				
			    		for(int a=num/2-i-1; a>=0; a--) {
			    			
			    			System.out.print("*");
			    		}
			    		
						for(int b=0; b<=i*2 ; b=b+2) {
							
							System.out.print(" ");
						}
						
						System.out.println();
					  }                         // -there is a upper triangular (even number)-
					
				    for(int i=1; i<=num/2; i++) {
						  
					
					
						for(int k=num/2-i; k>=0; k--) {
						
						System.out.print(" ");
						}
						
						for(int h=0; h <= i*2-1; h=h+2) {
							
							System.out.print("*");
						}
						
		                for(int b=0; b<=i*2-1 ; b=b+2) {
							
							System.out.print("*");
						}
						

			    		for(int a=num/2-i; a>=0; a--) {
			    			
			    			System.out.print(" ");
			    		}

			    		
			    		System.out.println();
						
					    }  // -there is a lower triangular (even number)-
				   }
				
				
			             
				
				else {                                 // upper triangular (odd number)
				
					for(int j=0; j<(num+1)/2; j++) {   // (num+1)/2 = row number
						
						for (int k=0; k<j ; k++) {
							
							System.out.print(" ");
						}
						
						for(int m=0; m<num-2*j; m++) {
							
							System.out.print("*");
						}
						System.out.println();
					 }
					
					for (int s=0; s<(num+1)/2; s++){       // lower triangular (odd numbers)			
						
						for (int k=0; k<(num+1)/2-s-1 ; k++) {
							
							System.out.print(" ");
						}
						
						for(int m=0; m<2*s +1; m++) {
							
							System.out.print("*");
						}
						System.out.println(); 
					
					}
							
				 }
				
			}
			

			scanner.close();
			
		}
			
	


	}


