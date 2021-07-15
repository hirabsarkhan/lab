package lab7;

//Bike class implements the interface
public class Bicycle implements CarbonFootprint{
	
private double milesPerYear;
private final int co2Emmision = 40;


public Bicycle( double miles )
{
    milesPerYear = miles;
}
public double getmilesPerYear(){
    return milesPerYear;
}

public void setmilesPerYear( double miles ){
    milesPerYear = miles;
}

//Override toString method
public String toString(){
    return String.format("Bicycle \n%s: %.2f\n","Yearly miles are ", getmilesPerYear() );
}
//Override the interface method for bicycle class
public double getCarbonFootprint(){
    return milesPerYear * co2Emmision;
}

}//end of Bicycle class
