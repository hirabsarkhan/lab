package lab7;

import java.util.ArrayList;
public class CarbonFootprintTest
{
  public static void main( String[] args )
  {
      //creates array of type CarbonFootprint
      ArrayList< CarbonFootprint > categories
      = new ArrayList< CarbonFootprint >();
      //Add Car instance
      categories.add(new Car( 2500, 20 ));
      //Add Building instance
      categories.add( new Building( 3000 ));
      //Add Bike instance
      categories.add( new Bicycle( 5000.00 ));

      //Iterate over the categories arraylist
      for( CarbonFootprint object : categories )
      {
          System.out.printf("%s%s: %.2f pounds per year\n\n",
                  object.toString(),
                  "Carbon footprint is ",
                  object.getCarbonFootprint());
      }//end for loop
      
  }//end of main
}

