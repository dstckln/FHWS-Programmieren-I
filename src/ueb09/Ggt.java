package ueb09;
public class Ggt {

    public static void main(String[] args) {
	double x = 24531;
	double y = 10893;
	double rest = 1;
		
	while (rest != 0) {
	    rest = x%y;
	    x = y;
	    y = rest;
	    System.out.println(rest);
	}	
    }
}
