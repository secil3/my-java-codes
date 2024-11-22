package yourpackage;
import java.util.Scanner;

public class labhomework2 {

	
	static int[] firstclass = new int[5]; 
	static int[] economy = new int[5];
	
	public static boolean isPlaneFull() {

		
		for (int seat : firstclass ) {
			if(seat == 0)
			return false;
		}
	
		for (int seat : economy ) {
			if(seat == 0)
			return false;
		}
		
		return true;
	}
	
	public static void validateTicketBySeatId(int seatID) {
	 if (seatID >= 1 && seatID <= 5) {
	    if (firstclass[seatID - 1] == 1) {
             System.out.printf("ticket for seat #%d is valid (first class).\n", seatID);
         } 
	    else {
             System.out.println("invalid ticket! Seat is empty.");
         }
      } 
	
	 else if (seatID >= 6 && seatID <= 10) {
         if (economy[seatID - 6] == 1) {
             System.out.printf("ticket for seat #%d is valid (economy).\n", seatID);
         } else {
             System.out.println("invalid ticket. seat is empty.");
         }
      }
     
     else {
         System.out.println("invalid seat ID.");
      }
}

	
	
	public static void main(String[] args) {
	
	int seatnum=0 ;
    Scanner scanner = new Scanner(System.in);
		
		   while (true) {
		System.out.println("please type 1 for buying first class ticket");
		System.out.println("please type 2 for buying economy class ticket");
		System.out.println("please type 3 for ticket validation");
		System.out.println("please type 4 to exit");
		System.out.println("enter a choice: ");
	
		int choice = scanner.nextInt();
		
		if(choice == 1)
		{ // 1 2 3 4 5 numaralı koltuklar
			
			
		   if(isPlaneFull()) {

			System.out.println("the plane is now full");
			}
	    	else {
		
	      	boolean ticketBought = false;
			for(int i=0; i<5; i++) {
				 if(firstclass[i]== 0) {
					 firstclass[i]= 1;
				     seatnum = i+1;
				     System.out.printf("first class ticket is bought. #%d\n",seatnum);
				     ticketBought = true;
				     break;
				 }
		    }
			if(!ticketBought) {
				System.out.println("no avaible seats in first class. please try to economy.");
			}
	    	}
			
		}
		
		
		
		else if(choice == 2) { // 6 7 8 9 10 numaralı koltuklar
			
			if(isPlaneFull()) {
				
				System.out.println("the plane is now full ");
			}
			else {
				boolean ticketBought =false;
				for (int i=0; i<5; i++) {
					
					if(economy[i] == 0) {
						
						economy[i] = 1;
						seatnum = i+6;
					
					 System.out.printf("economy class ticket is bought. #%d\n",seatnum);
				     ticketBought = true;
				     break;
					
				}
			}

				if(!ticketBought) {
					System.out.println("no avaible seats in economy class. please try first class.");
				}
				
			}
		}
		
		else if(choice == 3) {// ticket validation
			
			System.out.println("enter your seat ID: ");
			int seatID= scanner.nextInt();
			 validateTicketBySeatId(seatID);
			
		}
		else if (choice == 4 ){  // exit
			
			System.out.println("exiting.... ");
			break;
		}
		else {     
			System.out.println("invalid choice!!");
		}
	}

}
}