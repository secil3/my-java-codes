package mymypackage;
import java.util.Scanner;


public class BmiTest {


	public static String[] seperateInputValues(String input) {
		
		return input.split(" ");	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		int size=3;
		
		Bmi[] arrayOfBmi = 	new Bmi[size];
		
		
		for(int i=0; i<size; i++) {
			
			System.out.println("-----ENTER PERSON "+(i+1) +"'S VALUES-----");
			System.out.println("enter name, age, weight, height: (as space separated)");
			String  input = scanner.nextLine();
			
			String[] values = seperateInputValues(input);
			
			// string to int and double converting
			 String name = values[0];
			 int age = Integer.parseInt(values[1]);
	         double weight = Double.parseDouble(values[2]);
	         double height = Double.parseDouble(values[3]);
			
	         arrayOfBmi[i] = new Bmi(name,age,weight,height);
	   
	         
		}
		
		// print the values and result 
        for(int j=0; j<size; j++) {
         	System.out.println("** The BMI result for "+ arrayOfBmi[j].getName()+
     			" (Age: "+arrayOfBmi[j].getAge() +" Weight: "+arrayOfBmi[j].getWeight()+
     			" Height: "+ arrayOfBmi[j].getHeight()+") is \n"+ arrayOfBmi[j].getStatus());
    	
}

}

}


	
