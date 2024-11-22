package yourpackage ;
import java.util.Scanner;

class Node {
    int quantity;     
    Node next;    
    String name;
    String category;
    double price;

    public Node(int quantity,String name, String category, double price) {
        this.quantity = quantity;
        this.name =name;
        this.category=category; 
        this.price=price;
        this.next = null; // beggining next null
    }
}


public class secillinkedlist {
    private Node head; 

    // a function that add a new data in list
    public void add(int quantity, String name, String category, double price) {
       
  
    	Node newNode = new Node(quantity, name, category, price);
  
        if (head == null || head.quantity >= newNode.quantity) {
            head = newNode; // if the list is empty then new node is head
        } else {
            Node current = head;
            while (current.next != null && current.next.quantity < newNode.quantity) {
                current = current.next;
            }
           newNode.next = current.next;  // update the new node next
            current.next = newNode; // add a new node
        }
    }

    // a method for display the list
    public void printList() {
    	System.out.println(" -------menu------- ");
        Node current = head;
        while (current != null) {
            System.out.print("{" + current.quantity + ", " + current.name +  ", " + current.category + ", " + current.price + "} -> ");
            current = current.next;

        }
        System.out.println("null");
    }

    // a method that delete a data
    public void delete(String deletename) { //////////////////////////////////////////////////////
        if (head == null) return; // if the list is empty then do nothing

        if (head.name.equalsIgnoreCase(deletename)) {
            head = head.next;
            System.out.println("product removed: " + deletename);
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.name == deletename) {
                current.next = current.next.next; //delete the node
                System.out.println("product removed: " + deletename);
                return;
            }
            current = current.next;
        }
        
        System.out.println("product not found: "+ deletename);
    }


    public static void main(String[] args) {

secillinkedlist  list = new secillinkedlist();

Scanner scanner = new Scanner(System.in);
int choice =0;

while (choice != 4) {
	
	
	System.out.println(" -------options------- ");
    System.out.println("1. add a product");
    System.out.println("2. remove a product");
    System.out.println("3. list all products");
    System.out.println("4. exit");
    System.out.print("please enter a number (1-4): ");
    choice = scanner.nextInt();
    scanner.nextLine();
	
  if(choice==1) {    // // add a new product


         System.out.println("enter the number of product to add: ");
         int n= scanner.nextInt();
         scanner.nextLine();  // 

          for (int i=0; i<n; i++) {
	  
	      System.out.println("enter quantity: ");
	      int quantity =scanner.nextInt();
	      scanner.nextLine();  // 

	      System.out.println("enter product name: ");
	      String name =scanner.nextLine();
	    

	      System.out.println("enter product category: ");
	      String category =scanner.nextLine();
	
	  
	      System.out.println("enter product price: ");
	      double price =scanner.nextDouble();
	      scanner.nextLine();  // 
	  
	  
	      list.add(quantity,name,category,price ); 
	   

     }
     System.out.println("products added!");

  
     }
     
  else if(choice==2) {  // // delete the product
    	 
    	 System.out.println("please enter name of product to remove: ");
         String deletename = scanner.nextLine();
         
         list.delete(deletename);
         
 
   	
        }
  else if(choice==3) {   // // display the list
       System.out.println("LIST: ");
       list.printList(); 
  }
  else {
	  System.out.println("invalid number!!");
  }
  
  
}

if(choice==4) {
	System.out.println("logging out of system...");}

}
}
