public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            int val = 1, dum = 0;
            for(int j = 1; j <= i; j++){
                 val = val +  dum;
                System.out.print(val + " ");
                dum++;

            }
            System.out.println();
        }
    }
}