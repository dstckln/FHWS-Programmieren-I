package various;
import java.util.Scanner;

public class Converter {
    
    public static void binToDec(String bin) {
        int output = 0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i) == '1')
                output += Math.pow(2,bin.length()-1-i);
        }
        System.out.println(output);
    }

    public static void decToBin(int dec) {
        int index = 0;
        int[] output = new int[16];
         while (dec>0) {
            output[index] = dec%2;
            dec = dec/2;
            index++;
        }
        for (int i=output.length-1;i>=0;i--) {
            System.out.print(output[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Binärzahl eingeben: ");
        //String input = scanner.nextLine();
        int input = scanner.nextInt();
        decToBin(input);
        scanner.close();
    }
}