package mymypackage;


public class Bmi {


	private String name;
	private int age;
	private double weight;
	private double height ;

	public static final double KILOGRAMS_PER_POUND= 0.45359237;   // constant value (1 pound)
	public static final double METERS_PER_INCH = 0.02554;      // constant value  (1 inch)


public Bmi() {
		

	name="john black";
	age = 25;
	weight= 100.0;
	height= 50;
	}
	
public Bmi(String mName,double mWeight, double mHeight) {

	name=mName;
	age=20;
	weight=mWeight;
	height=mHeight;
}


public Bmi(String mName,int mAge, double mWeight, double mHeight) {
	

	name=mName;
	age=mAge;
	weight= mWeight;
	height=mHeight;
	
}


public String getName() {

return name;
}
public  void setName(String name) {

   this.name=name;
}

public int getAge() {
	
		return age;
		
	}
public void setAge(int age) {
	
	this.age=age;
}

public double getWeight() {
		return weight;
		
	}
public void setWeight(double weight) {
	this.weight=weight;
	
}

public double getHeight() {
		return height;
		
	}
public void setHeight(double height) {
	
	this.height = height;
}



public String getStatus() {

	
	if (getBMI() <18.5) {
		 return "--Underweight--";
		
	}
	else if (18.5 <= getBMI() && getBMI()< 25.5) {
		return "--Normal--";

	}
	else if (25.0 <= getBMI() && getBMI()< 30.0) {
		return "--Overweight--";

	}

	else if(30.0 <= getBMI()) {
		
	return "--Obese--";

	}
	else {
	return null;
	}
}

private double getBMI() {
	double weight1 = weight*KILOGRAMS_PER_POUND;
	double height1 = height*METERS_PER_INCH;
	
	
	double result = weight1 / ( height1 * height1 );
	return  Math.round(result); 
    }


}


	
