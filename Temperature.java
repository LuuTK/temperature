package real;

// Tuan-Kiet Luu                                                                    
//260479318
                                                                     
                                                                     
                                             
/**
 * We want to use the Java collections library to sort 
 * a collection of temperatures. Therefore, the {@code Temperature} 
 * class implements the {@code Comparable} interface by overriding 
 * {@code compareTo} method.
 */

public class Temperature implements Comparable<Temperature> {

  /** Enumerator for different temperature units */
  public static enum Units { FAHRENHEIT, CELCIUS, KELVIN }

 
private double value;
private Units units;

private float fahrenheitTofahrenheit = 0 ;
private float kelvinToKelvin = 0;
private float celciusToCelcius = 0;
private float celciusToKelvin = 0;
private float celciusToFahrenheit = 0;
private float kelvinToCelcius = 0;
private float kelvinToFahrenheit = 0;
private float fahrenheitToCelcius =0;
private float fahrenheitToKelvin =0;
private Units liveTemp = Temperature.this.units;
private Units newTemp;
private boolean caseCelciusToFahrenheit;
private boolean caseCelciusToKelvin;
private boolean caseKelvinToCelcius;
private boolean caseKelvinToFahrenheit;
private boolean caseFahrenheitToCelcius;
private boolean caseFahrenheitToKelvin;
public Temperature.Units liveUnits;
public double liveValue;

  /**
   * Create a new {@code Temperature} with given attributes
   * @param value numerical value of {@code Temperature}
   * @param units {@code Units} of {@code Temperature}
   */
//constructor
  public Temperature (double value, Temperature.Units units) {
       // ...
	  this.value = value;
	  this.units = units;
  }

  /**
    * Get the value of the {@code Temperature}
    * @return numerical value of the {@code Temperature} in the current {@code Units}
    */
  //getter  - value
  public double getValue() { 
    // ...
	  return value;
  }

  /**
   * Get the current {@code Units} of the {@code Temperature}
   * @return current {@code Units} of {@code Temperature}
   */
  // getter - units
  public Units getUnits() {
    // ...
	  return units;
  }

  /**
   * Change the current {@code Units} of the {@code Temperature}. 
   * Changing the {@code Units} also changes the numerical value 
   * in a consistent manner.
   * @param units the new {@code Units} 
   */
  public void changeUnits(Units units) {

	  
	  //if Celcius to Celcius, return same thing
		if(units.equals(units.CELCIUS) && Temperature.this.getUnits().equals(units.CELCIUS)){  

			  celciusToCelcius = (float) Temperature.this.getValue();
			  caseCelciusToFahrenheit = true;
			  liveUnits = units.CELCIUS; //sets the new units
			  liveValue = celciusToCelcius; // sets the new value
		  }
		// same for kelvin
		if(units.equals(units.KELVIN) && Temperature.this.getUnits().equals(units.KELVIN)){  

			  kelvinToKelvin = (float) Temperature.this.getValue();
			  caseCelciusToFahrenheit = true;
			  liveUnits = units.KELVIN; //sets the new units
			  liveValue = kelvinToKelvin; // sets the new value
		  }
		// same for fahrenheit
		if(units.equals(units.FAHRENHEIT) && Temperature.this.getUnits().equals(units.FAHRENHEIT)){  

			  fahrenheitTofahrenheit = (float) Temperature.this.getValue();
			  caseCelciusToFahrenheit = true;
			  liveUnits = units.FAHRENHEIT; //sets the new units
			  liveValue = fahrenheitTofahrenheit; // sets the new value
		  }
	  
	  
	  
	  
	  
	  
	  //Converts Celcius to Fahrenheit
	if(units.equals(units.FAHRENHEIT) && Temperature.this.getUnits().equals(units.CELCIUS)){  

		  celciusToFahrenheit = (float) (Temperature.this.getValue() * 9/5) + 32;
		  caseCelciusToFahrenheit = true;
		  liveUnits = units.FAHRENHEIT; //sets the new units
		  liveValue = celciusToFahrenheit; // sets the new value
	  }
	  
	  //Converts Celcius to Kelvin
  if(units.equals(units.KELVIN) && Temperature.this.getUnits().equals(units.CELCIUS)){
		  
	  celciusToKelvin = (float) (Temperature.this.getValue() + 273.15);
	  caseCelciusToKelvin = true;
	  liveUnits = Units.KELVIN; //sets the new units
	  liveValue = celciusToKelvin; // sets the new value
	  }
  
  //Converts Kelvin to Celcius
  if(units.equals(units.CELCIUS) && Temperature.this.getUnits().equals(units.KELVIN)){
	  
	  kelvinToCelcius = (float) (Temperature.this.getValue() - 273.15);
	  caseKelvinToCelcius = true;
	  liveUnits = units.CELCIUS; //sets the new units
	  liveValue = kelvinToCelcius; // sets the new value
		  
	  }
  // Converts Kelvin to Fahrenheit
  if(units.equals(units.FAHRENHEIT) && Temperature.this.getUnits().equals(units.KELVIN)){
	  
	  kelvinToFahrenheit = (float) (((Temperature.this.getValue() - 273.15 )*(9/5) ) +32 );
	  caseKelvinToFahrenheit = true;
	  liveUnits = units.FAHRENHEIT; //sets the new units
	  liveValue =  kelvinToFahrenheit; // sets the new value
		  
	  }
  //Converts Fahrenheit to Celcius
  if(units.equals(units.CELCIUS) && Temperature.this.getUnits().equals(units.FAHRENHEIT)){
	  fahrenheitToCelcius = (float) ((Temperature.this.getValue()-32)* 5/9);
	  caseFahrenheitToCelcius =true;
	  liveUnits = units.CELCIUS; //sets the new units
	  liveValue =  fahrenheitToCelcius; // sets the new value
		  
	  } 
  //Converts Fahrenheit to Kelvin
if(units.equals(units.KELVIN) && Temperature.this.getUnits().equals(units.FAHRENHEIT)){
	  
	fahrenheitToKelvin = (float) (5/9 * (Temperature.this.getValue() - 32) + 273.15 );
	caseFahrenheitToKelvin = true;
	liveUnits = units.KELVIN; //sets the new units
	liveValue =  fahrenheitToKelvin;  // sets the new value
	  } 
	  
	  return;
	 
	  
  }

  /** 
   * Convert the {@code Temperature} to {@code String}. The output is
   * as follows
   * <pre><code>
   *    Temperature temperature = new Temperature(0, Units.CELCIUS);
   *    System.out.println(temperature.toString()); // prints "0 °C"
   *    
   *    
   *    temperature.changeUnits(Units.FAHRENHEIT);
   *    System.out.println(temperature.toString()); // prints "32 °F"
   *    
   *    
   *    
   *    temperature.changeUnits(Units.KELVIN);
   *    System.out.println(temperature.toString()); // prints "273.15 K"
   * </code></pre>
   */
  public String toString() {

	  String theStringOutput = "error";
	  
// if the new value is in Celcius, print the value + °C

		  if(caseKelvinToCelcius == true || caseFahrenheitToCelcius ==true || getUnits().equals(Units.CELCIUS)){
		  theStringOutput = (int) liveValue + " " + "°C";
		  caseKelvinToCelcius = false;
		  caseFahrenheitToCelcius = false;

	  }
	// if the new value is in Celcius, print the value + K

		if(caseCelciusToKelvin == true || caseFahrenheitToKelvin == true){
		  theStringOutput =  (int) liveValue + " " + "K";
		  caseCelciusToKelvin = false;
		  caseFahrenheitToKelvin = false;

	  }
	// if the new value is in Celcius, print the value + F

		if(caseCelciusToFahrenheit == true || caseKelvinToFahrenheit==true){
		  
		  theStringOutput = (int) liveValue + " " + "F";
		  caseFahrenheitToKelvin = true;
		  caseCelciusToFahrenheit = false; 
		  caseKelvinToFahrenheit=false;
				  
	  }


	return theStringOutput;

  }

  /**
   * In order to implement {@code Comparable}, we need to override
   * the {@code compareTo} method. 
   * @param temperature The {@code Temperature} to compare against
   * @return -1 if current object is less than {@code temperature}
   *          0 if both are equal
   *          1 if current object is greater than {@code temperature}
   */
  @Override
  public int compareTo (Temperature temperature) {
    // ...
	  

	  
	  if(Temperature.this.getUnits().equals(temperature.getUnits())){			//compares if both temperature are in same units
		 
		 
	  if(Temperature.this.getValue() == temperature.getValue()){
//		  System.out.println("0");
		  return 0;
		 
	  }
	  if(Temperature.this.getValue() > temperature.getValue()){
		  System.out.println("1");
		  return 1;
		  
	  }
	  if(Temperature.this.getValue() < temperature.getValue()){
		  System.out.println("-1");
		  return -1;
		  
	  }
	  }
	  // change units from celcius to kelvin, then compares (for same units)
	  if(Temperature.this.getUnits().equals(units.CELCIUS) && temperature.getUnits().equals(units.KELVIN)){
		
		  if(Temperature.this.getValue() + 273.15 == temperature.getValue()){
	//		  System.out.println("0");
			  return 0;
		  }
		  if(Temperature.this.getValue() + 273.15 > temperature.getValue()){
			  System.out.println("1");
			  return 1;
		  }
		  if(Temperature.this.getValue() + 273.15 < temperature.getValue()){
			  System.out.println("-1");
			  return -1;
		  }

	  }
	  // change units from celcius to fahrenheit, then compares (for same units)
	  if(Temperature.this.getUnits().equals(units.CELCIUS) && temperature.getUnits().equals(units.FAHRENHEIT)){
		  if(Temperature.this.getValue()  *  9/5 + 32  == temperature.getValue()){
	//		  System.out.println("0");
			  return 0;
		  }
		  if(Temperature.this.getValue()  *  9/5 + 32  > temperature.getValue()){
			  System.out.println("1");
			  return 1;
		  }
		  if(Temperature.this.getValue()  *  9/5 + 32  < temperature.getValue()){
			  System.out.println("-1");
			  return -1;
		  }
	  }
	  // change units from kelvin to celcius, then compares (for same units)
	  if(Temperature.this.getUnits().equals(units.KELVIN) && temperature.getUnits().equals(units.CELCIUS)){
		  if(Temperature.this.getValue() - 273.15  == temperature.getValue()){
	//		  System.out.println("0");
			  return 0;
		  }
		  if(Temperature.this.getValue() - 273.15  > temperature.getValue()){
			  System.out.println("1");
			  return 1;
		  }
		  if(Temperature.this.getValue() - 273.15 < temperature.getValue()){
			  System.out.println("-1");
			  return -1;
		  }
	  }
 	  // change units from kelvin to fahrenheit, then compares (for same units)
	  if(Temperature.this.getUnits().equals(units.KELVIN) && temperature.getUnits().equals(units.FAHRENHEIT)){
		  if(((9/5)*(Temperature.this.getValue() - 273.15 )+32) == temperature.getValue()){
	//		  System.out.println("0");
			  return 0;
		  }
		  if(((9/5)*(Temperature.this.getValue() - 273.15 )+32)  > temperature.getValue()){
			  System.out.println("1");
			  return 1;
		  }
		  if(((9/5)*(Temperature.this.getValue() - 273.15 )+32) < temperature.getValue()){
			  System.out.println("-1");
			  return -1;
		  }
	  }
	  // change units from fahrenheit to celcius, then compares (for same units)
	  if(Temperature.this.getUnits().equals(units.FAHRENHEIT) && temperature.getUnits().equals(units.CELCIUS)){
		  if(((9/5)*(Temperature.this.getValue()  - 32) == temperature.getValue())){
	//		  System.out.println("0");
			  return 0;
		  }
		  if(((9/5)*(Temperature.this.getValue()  - 32)  > temperature.getValue())){
			  System.out.println("1");
			  return 1;
		  }
		  if(((9/5)*(Temperature.this.getValue()  - 32) < temperature.getValue())){
			  System.out.println("-1");
			  return -1;
		  }
	  }
	  // change units from fahrenheit to kelvin, then compares (for same units)
	  if(Temperature.this.getUnits().equals(units.FAHRENHEIT) && temperature.getUnits().equals(units.KELVIN)){
		  if((((5/9)*(Temperature.this.getValue()-32)+273.15)) == temperature.getValue()){
	//		  System.out.println("0");
			  return 0;
		  }
		  if((((5/9)*(Temperature.this.getValue()-32)+273.15))   > temperature.getValue()){
			  System.out.println("1");
			  return 1;
		  }
		  if((((5/9)*(Temperature.this.getValue()-32)+273.15))  < temperature.getValue()){
			  System.out.println("-1");
			  return -1;
		  }
	  }
	  
	  
	  
	return 0;
	  
	  
	  
	  
	  
  }

  /**
   * Indicates whether some object is "equal" to this one.
   * To maintain consistency, whenever a class overrdes 
   * {@code compareTo}, it must override {@code equals} so 
   * that
   * <pre>
   *   <code>o1.compareTo(o2) == 0</code> implies <code>o1.equals(o2) == true</code>
   * </pre>
   * See the API documentation of {@code Object} class for more details.
   */
  @Override
  public boolean equals (Object o) {
    // ...
	  Temperature currentTemperature = new Temperature(Temperature.this.getValue(), Temperature.this.getUnits());
	  
	  //if the input temperature is equal to our current temperature, return true
	  if(((Temperature) o).compareTo(currentTemperature)== 0){
		  return true;
		  
	  }
	  else{
		  return false;
	  }


	  }
 

  /**
   * Return a hash code of the object. To maintain consistency,
   * whenever a class overrides {@code equals} it mush also override
   * {@code hashCode} in such a manner that 
   * <pre>
   *   <code>o1.equals(o2) == true</code> implies <code>o1.hashCode() == o2.hashCode()</code>
   * </pre>
   * See the API documentation of {@code Object} class for more details.
   */
  @Override
  
  //note : I did not really understand the hashCode Concept =(
  public int hashCode() {
    // ...
	  
	  //store arbitrary constant, here let's pick 7
	  int hash = 7;
	  int intT2= 0;
	  int var_code = 0;
	  Temperature t1 = new Temperature(value,units);
	  Temperature t2 = new Temperature(value,units);
	  
	   //if with the equal method, they are equal, then they must have the same integer value
	  if(t1.equals(t2)==true){
		  intT2 = hash;
	  }
	  else{
		  // if not equal, recall hashcode()
		  hashCode();
	  }
	  
	  //combine individual hashcodes
	  if(Temperature.this.getUnits() == null){
		  var_code = 0;
	  }
	  hash = 31 *  hash + var_code;
	  
	  //return int hash
	  return hash;
	  
  }
  
  public static void main(String[] args){
	  
	

	       Temperature temperature = new Temperature(0, Units.CELCIUS);
	       Temperature temperatureCompared = new Temperature(273.15, Units.KELVIN);
	       Temperature temperatureCompared2 = new Temperature(0, Units.CELCIUS);
	       Temperature temperatureCompared3 = new Temperature(31, Units.FAHRENHEIT);
	       Temperature temperatureCompared4 = new Temperature(32, Units.FAHRENHEIT);
	       
	       System.out.println(temperature.toString()); // prints "0 °C"
	       
	       
	       temperature.changeUnits(Units.FAHRENHEIT);
	       System.out.println(temperature.toString()); // prints "32 °F"
	       
	       
	       
	       temperature.changeUnits(Units.KELVIN);
	       System.out.println(temperature.toString()); // prints "273.15 K"
	       
	       temperatureCompared3.compareTo(temperatureCompared4);
	       

	  
  }
  
}