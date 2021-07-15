package lab7;
/*Car.java implements the interface carbonfoot print*/
public class Car implements CarbonFootprint
{  //declare variables of type double
    private double avgMilesPerYear;
    private double avgMPG;
    //number of kgs releaseds per mile
    private final int carbonPerMile = 9;

    //constructor
    public Car( double miles, double MPG )
    {   avgMilesPerYear = miles;
        avgMPG = MPG;
    }//end of constructor
    public void setavgMilesPerYear( double miles ){
        avgMilesPerYear = miles;
    }
    public void setavgMPG( double MPG ){
        avgMPG = MPG;
    }
    public double getavgMilesPerYear(){
        return avgMilesPerYear;
    }
    public double getavgMPG(){
        return avgMPG;
    }  
    public String toString(){
        return String.format( "Car \n%s: %.2f \n%s: %.2f \n",  "Average yearly miles is ", getavgMilesPerYear(),
            "Average MPG is ", getavgMPG() );
    }
    //Override the method of the interface for Car class
    public double getCarbonFootprint(){
        return (( getavgMilesPerYear() * getavgMPG() ) * carbonPerMile );
    }
}//end of Car class

