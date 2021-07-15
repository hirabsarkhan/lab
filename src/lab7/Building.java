package lab7;


public class Building implements CarbonFootprint
{
    private double avgKWH;
    private final int MONTHS = 12;
    
    public Building( double monthlyConsumption ){
        setavgKWH(monthlyConsumption);
    }
  
    public void setavgKWH( double monthlyConsumption ){
        avgKWH = monthlyConsumption;
    }

    public double getavgKWH(){
        return avgKWH;
    }
    //Override the toString method
    public String toString(){
        return String.format("Building\n%s: %.2f\n",
        "the monthly consumption is ", getavgKWH() );
    }

    //Override the interface method
    public double getCarbonFootprint(){
        return getavgKWH() * MONTHS;
    }

}//end of Building class


