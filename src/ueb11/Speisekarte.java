package ueb11;

public class Speisekarte {

    public static void main(String[] args) {
	final int ANZAHL_PIZZEN = 5;
	Pizza[] pizzas = new Pizza[ANZAHL_PIZZEN];
		
	int[] pizzaMargDurchm = {26,32,50};
	double[] pizzaMargPreis = {4.0, 5.5, 10.0};
	
	int[] pizzaPepDurchm = {26,32,50};
	double[] pizzaPepPreis = {5.0, 7.0, 11.0};

	int[] pizzaSchinkDurchm = {26,32,50};
	double[] pizzaSchinkPreis = {3.0, 5.0, 9.0};

	int[] pizzaSpecialeDurchm = {26,32,50};
	double[] pizzaSpecialePreis = {6.5, 8.0, 12.0};
		
	int[] pizzaVegDurchm = {26,32,50};
	double[] pizzaVegPreis = {5.0, 7.0, 11.0};

	pizzas[0] = new Pizza("Pizza Margherita", pizzaMargDurchm, pizzaMargPreis);
	pizzas[1] = new Pizza("Pizza Peperoniwurst", pizzaPepDurchm, pizzaPepPreis);
	pizzas[2] = new Pizza("Pizza Schinken", pizzaSchinkDurchm, pizzaSchinkPreis);
	pizzas[3] = new Pizza("Pizza Speciale", pizzaSpecialeDurchm, pizzaSpecialePreis);
	pizzas[4] = new Pizza("Pizza Vegetaria", pizzaVegDurchm, pizzaVegPreis);

	pizzas[0].setName("Pizza Diavolo");
	pizzas[0].setDurchmesser(26, 15);
	pizzas[0].setPreis(4.0, 5.0);
		
	for (int i = 0;i<pizzas.length;i++) {
	    System.out.println(pizzas[i].getName() + "     ");
		
	    for (int d = 0;d<pizzas[i].getDurchmesser().length;d++) {
		System.out.print(pizzas[i].getDurchmesser()[d] + "cm     ");
	    }
	    System.out.println();
	    for (int p = 0;p<pizzas[i].getPreis().length;p++) {
		System.out.print(pizzas[i].getPreis()[p] + "€     ");
	    }
	    System.out.println();
	}
    }
}

