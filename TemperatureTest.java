//Tuan-Kiet Luu
// 260479318

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import real.Temperature;
import real.Temperature.Units;

public class TemperatureTest {

	
	
	
  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

	
  // This test verifies if the getUnits really outputs what we input.
  @Test
   public void test_getUnits  (){
	  System.out.println("getUnits() Test : Test if getUnits() returns the correct units...");
      Temperature temperature = new Temperature(0, Units.KELVIN);
      assertTrue(temperature.getUnits().equals(Units.KELVIN));
   }
  
  // This test verifies if the getValue really outputs what we input as a value.
  @Test
  public void test_getValue  (){
	  System.out.println("getValue() Test : Test if getValue() returns the correct value...");
     Temperature temperature = new Temperature(31, Units.CELCIUS);
     assertTrue(temperature.getValue() == 31);
  }
  //Tested compareTo method
  @Test
  public void test_compareToCelciusCelcius  (){
	  System.out.println("Test if CompareTo Celcius to Celcius works. If true, returns 0 ...");
     Temperature temperature = new Temperature(31, Units.CELCIUS);
     Temperature temperature2 = new Temperature(31, Units.CELCIUS);
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.CELCIUS) );
  }
  @Test
  public void test_compareToCelciusKelvin  (){
	  System.out.println("Test if CompareTo Celcius to Kelvin works. If true, returns 0 ...");
     Temperature temperature = new Temperature(0, Units.CELCIUS);
     Temperature temperature2 = new Temperature(273.15, Units.KELVIN );
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.KELVIN) );
  }
  
  @Test
  public void test_compareToCelciusFahrenheit  (){
	  System.out.println("Test if CompareTo Celcius to FAHRENHEIT works. If true, returns 0 ...");
     Temperature temperature = new Temperature(0, Units.CELCIUS);
     Temperature temperature2 = new Temperature(32, Units.FAHRENHEIT);
     
     assertTrue(temperature.compareTo(temperature2) == 0&& temperature2.getUnits().equals(Units.FAHRENHEIT));
  }
  @Test
  public void test_compareToKelvinKelvin  (){
	  System.out.println("Test if CompareTo KELVIN to KELVIN works. If true, returns 0 ...");
     Temperature temperature = new Temperature(0, Units.KELVIN);
     Temperature temperature2 = new Temperature(0, Units.KELVIN);
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.KELVIN));
  }
  @Test
  public void test_compareToKelvinCelcius  (){
	  System.out.println("Test if CompareTo KELVIN to Celcius works. If true, returns 0 ...");
     Temperature temperature = new Temperature(273.15, Units.KELVIN);
     Temperature temperature2 = new Temperature(0, Units.CELCIUS);
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.CELCIUS));
  }
  
  @Test
  public void test_compareToKelvinFahrenheit  (){
	  System.out.println("Test if CompareTo KELVIN to Fahrenheit works. If true, returns 0 ...");
     Temperature temperature = new Temperature(273.15, Units.KELVIN);
     Temperature temperature2 = new Temperature(32, Units.FAHRENHEIT);
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.FAHRENHEIT));
  }
  @Test
  public void test_compareToFahrenheitFahrenheit  (){
	  System.out.println("Test if CompareTo Fahrenheit to Fahrenheit works. If true, returns 0 ...");
     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
     Temperature temperature2 = new Temperature(32, Units.FAHRENHEIT);
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.FAHRENHEIT));
  }
  @Test
  public void test_compareToFahrenheitCelcius  (){
	  System.out.println("Test if CompareTo FAHRENHEIT to CELCIUS works. If true, returns 0 ...");
     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
     Temperature temperature2 = new Temperature(0, Units.CELCIUS);
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.CELCIUS));
  }
  @Test
  public void test_compareToFahrenheitKelvin  (){
	  System.out.println("Test if CompareTo FAHRENHEIT to KELVIN works. If true, returns 0 ...");
     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
     Temperature temperature2 = new Temperature(273.15, Units.KELVIN);
     
     assertTrue(temperature.compareTo(temperature2) == 0 && temperature2.getUnits().equals(Units.KELVIN));
  }
  
  
  // This series of changeUnits have the same goal : it should output a known result depending on an input.
  // I have tested the 9 cases, including when the user asks to change to its same unit type. (that is, celcius to celcius for example)
  // By doing so, we verify that the formulas are correct.
  
  //Here converts Celcius to Kelvin
  @Test
  public void test_changeUnitsCelciusKelvin  (){
	  System.out.println("changeUnits Test : Test if changeUnits CELCIUS to KELVIN works...");
     Temperature temperature = new Temperature(0, Units.CELCIUS);
     temperature.changeUnits(Units.KELVIN);
     assertTrue(temperature.liveUnits.equals(Units.KELVIN) &&  temperature.liveValue == 273.15f);
  }
  //changes celcius to fahrenheit
  @Test
  public void test_changeUnitsCelciusFahrenheit  (){
	  System.out.println("changeUnits Test : Test if changeUnits CELCIUS to Fahrenheit works...");
     Temperature temperature = new Temperature(0, Units.CELCIUS);
     temperature.changeUnits(Units.FAHRENHEIT);
     assertTrue(temperature.liveUnits.equals(Units.FAHRENHEIT) &&  temperature.liveValue == 32f);
  }
  //changes kelvin to celcius
  @Test
  public void test_changeUnitsKelvinCelcius  (){
	  System.out.println("changeUnits Test : Test if changeUnits kelvin to celcius works...");
     Temperature temperature = new Temperature(273.15, Units.KELVIN);
     temperature.changeUnits(Units.CELCIUS);
     assertTrue(temperature.liveUnits.equals(Units.CELCIUS) &&  temperature.liveValue == 0f);
  }
  // changes kelvin to fahrenheit
  @Test
  public void test_changeUnitsKelvinFahrenheit  (){
	  System.out.println("changeUnits Test : Test if changeUnits kelvin to Fahrenheit works...");
     Temperature temperature = new Temperature(273.15, Units.KELVIN);
     temperature.changeUnits(Units.FAHRENHEIT);
     assertTrue(temperature.liveUnits.equals(Units.FAHRENHEIT) &&  temperature.liveValue == 32f);
  }
  // changes fahrenheit to celcius
  @Test
  public void test_changeUnitsFahrenheitCelcius  (){
	  System.out.println("changeUnits Test : Test if changeUnits fahrenheit to celcius works...");
     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
     temperature.changeUnits(Units.CELCIUS);
     assertTrue(temperature.liveUnits.equals(Units.CELCIUS) &&  temperature.liveValue == 0);
  }
  //Changes fahrenheit to kelvin
  @Test
  public void test_changeUnitsFahrenheitKelvin  (){
	  System.out.println("changeUnits Test : Test if changeUnits fahrenheit to kelvin works...");
     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
     temperature.changeUnits(Units.KELVIN);
     assertTrue(temperature.liveUnits.equals(Units.KELVIN) &&  temperature.liveValue == 273.15f);
  }
  // Changes Celcius to Celcius
  @Test
  public void test_changeUnitsCelciusCelcius  (){
	  System.out.println("changeUnits Test : Test if changeUnits fahrenheit to celcius works...");
     Temperature temperature = new Temperature(0, Units.CELCIUS);
     temperature.changeUnits(Units.CELCIUS);
     assertTrue(temperature.liveUnits.equals(Units.CELCIUS) &&  temperature.liveValue == 0);
  }
  //Changes Kelvin to Kelvin
  @Test
  public void test_changeUnitsKelvinKelvin  (){
	  System.out.println("changeUnits Test : Test if changeUnits celcius to celcius works...");
     Temperature temperature = new Temperature(0, Units.KELVIN);
     temperature.changeUnits(Units.KELVIN);
     assertTrue(temperature.liveUnits.equals(Units.KELVIN) &&  temperature.liveValue == 0);
  }
  //Changes Fahrenheit to Fahrenheit
  @Test
  public void test_changeUnitsFahrenheitToFahrenheit  (){
	  System.out.println("changeUnits Test : Test if changeUnits celcius to celcius works...");
     Temperature temperature = new Temperature(0, Units.FAHRENHEIT);
     temperature.changeUnits(Units.FAHRENHEIT);
     assertTrue(temperature.liveUnits.equals(Units.FAHRENHEIT) &&  temperature.liveValue == 0);
  }

  //the equals method is tested by the same way as the change units method.
  // We compare 2 temperatures that should be equaled with known outputs.
  // If it does not equal, it shall output an error.
  
  //Tests the trivial case if two same temperature in same units are equal
  @Test
  
  public void test_equalsCelciusCelcius  (){
	  System.out.println("equals Test : Test if the equals method works: Celcius and Celcius...");
     Temperature temperature = new Temperature(32, Units.CELCIUS);
     Temperature temperature2 = new Temperature(32, Units.CELCIUS);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.CELCIUS));
  }
  
  //tests if the temperature in kelvin is the same in celcius. if not, outputs error.
  @Test
  
  public void test_equalsCelciusKelvin  (){
	  System.out.println("equals Test : Test if the equals method works: Celcius and Kelvin...");
     Temperature temperature = new Temperature(32, Units.CELCIUS);
     Temperature temperature2 = new Temperature(305.15, Units.KELVIN);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.CELCIUS));
  }
  //tests if the temperature in celcius is the same in fahrenheit. if not, outputs error.

  @Test
  
  public void test_equalsCelciusFahrenheit  (){
	  System.out.println("equals Test : Test if the equals method works: Celcius and Fahrenheit...");
     Temperature temperature = new Temperature(0, Units.CELCIUS);
     Temperature temperature2 = new Temperature(32, Units.FAHRENHEIT);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.CELCIUS));
  }
  
    //tests if the temperature in kelvin is the same in kelvin. if not, outputs error.

  @Test
  
  public void test_equalsKelvinKelvin  (){
	  System.out.println("equals Test : Test if the equals method works: Kelvin and Kelvin...");
     Temperature temperature = new Temperature(32, Units.KELVIN);
     Temperature temperature2 = new Temperature(32, Units.KELVIN);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.KELVIN));
  }
  @Test
  //tests if the temperature in kelvin is the same in celcius. if not, outputs error.

  public void test_equalsKelvinCelcius  (){
	  System.out.println("equals Test : Test if the equals method works: Kelvin and Celcius...");
     Temperature temperature = new Temperature(274.15, Units.KELVIN);
     Temperature temperature2 = new Temperature(1, Units.CELCIUS);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.KELVIN));
  }
  //tests if the temperature in kelvin is the same in fahrenheit. if not, outputs error.

  @Test
  
  public void test_equalsKelvinFahrenheit  (){
	  System.out.println("equals Test : Test if the equals method works: Kelvin and Fahrenheit...");
     Temperature temperature = new Temperature(273.15, Units.KELVIN);
     Temperature temperature2 = new Temperature(32, Units.FAHRENHEIT);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.KELVIN));
  }
  
  //tests if the temperature in fahrenheit is the same in fahrenheit. if not, outputs error.
  @Test
  
  public void test_equalsFahrenheitFahrenheit  (){
	  System.out.println("equals Test : Test if the equals method works: Fahrenheit and Fahrenheit...");
     Temperature temperature = new Temperature(322, Units.FAHRENHEIT);
     Temperature temperature2 = new Temperature(322, Units.FAHRENHEIT);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.FAHRENHEIT));
  }
  //tests if the temperature in Fahrenheit is the same in celcius. if not, outputs error.
  @Test
  
  public void test_equalsFahrenheitCelcius  (){
	  System.out.println("equals Test : Test if the equals method works: Fahrenheit and Celcius...");
     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
     Temperature temperature2 = new Temperature(0, Units.CELCIUS);
     
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.FAHRENHEIT));
  }
  
  //tests if the temperature in fahrenheit is the same in kelvin. if not, outputs error.

  @Test
  
  public void test_equalsFahrenheitKelvin  (){
	  System.out.println("equals Test : Test if the equals method works: Fahrenheit and Kelvin...");
     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
     Temperature temperature2 = new Temperature(273.15, Units.KELVIN);
     
 //    System.out.println(temperature.getUnits());
     assertTrue(temperature.equals(temperature2)==true && temperature.getUnits().equals(Units.FAHRENHEIT));
  }
  
  //tests if after the equals method, the getUnits change or not.
  @Test
  public void test_getUnitsChangeEquals(){
	  System.out.println("getUnits change Test : Test if the equals method changes the getUnits...");
	     Temperature temperature = new Temperature(32, Units.FAHRENHEIT);
	     Temperature temperature2 = new Temperature(273.15, Units.KELVIN);

	 temperature.equals(temperature2);
	//  System.out.println(temperature.getUnits());
	  assertTrue(temperature.getUnits().equals(Units.FAHRENHEIT));
  }
  
  
  
  
  
  
  
  
  
  
  
  // @Test
  // public void .... (){
  //    ...
  // }
}