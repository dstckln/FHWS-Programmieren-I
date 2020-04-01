package ueb06;
public class Temperaturtabelle {

    public static void main(String[] args) {
	
	int fahrenheit;
	float celsius = 0.0f;

	System.out.println("Fahrenheit \t\t Celsius");
	
	for (fahrenheit = 0;fahrenheit<=300;fahrenheit++) {
		celsius = (5.0f/9.0f)*(fahrenheit -32);
		celsius = (float) (((int)(celsius*100))/100.0);
		System.out.println(fahrenheit + "\t\t\t" + celsius);
			
			/* 
			* Beispielzahl : 7,8899999
			* Mal 100 = 788,999
			* Dann runden = 788.0
			* Dann wieder durch hundert teilen = 7,88
			*/
	}
    }
}
