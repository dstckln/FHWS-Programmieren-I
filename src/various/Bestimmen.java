package various;

public class Bestimmen {

    public static void main(String[] args) {
        int[] arr = {2, 17, 10, 9, 16, 3, 9, 16, 5, 1, 17, 14};
        for (int i=0;i<arr.length;i++) {
            if (arr[i]%3==0) {
                System.out.println(arr[i]);
            }
        } 
    }
}