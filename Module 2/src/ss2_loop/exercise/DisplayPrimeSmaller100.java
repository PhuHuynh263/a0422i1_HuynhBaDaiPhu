package ss2_loop.exercise;

public class DisplayPrimeSmaller100 {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        System.out.println("Prime Smaller 100 : ");
        while (N < 100) {
            int dem = 0;
            for (int i = 0; i <= N; i++) {
                if (N % i == 0) {
                    dem = dem + 1;
                }
            }
            if (dem == 2) {
                System.out.print(N + "\t");
                count++;
            }
            N++;
        }
    }
}
