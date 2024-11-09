import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //No1 a.
        System.out.print("Input value N = ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(i > 0 && i < N-1 && j > 0 && j < N-1 && N > 9){
                    System.out.print("    "); //untuk input angka dua digit contoh:10
                }else if(i > 0 && i < N-1 && j > 0 && j < N-1){
                    System.out.print("   "); //untukk input angka 1 digit dibawah 10
                }else{
                    System.out.print(" " + N + " ");
                }
            }
           System.out.println();
        }

    }
}