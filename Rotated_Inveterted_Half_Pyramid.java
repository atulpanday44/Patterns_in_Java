package FirstHalf;

public class Rotated_Inveterted_Half_Pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // for inner loop space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for inner loop star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}

