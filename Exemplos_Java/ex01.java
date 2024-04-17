import java.util.Scanner;
import java.util.Arrays;

class ex01 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int x;
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Informe os valores do vetor A:");
        for(int i=0;i<10;i++){
            A[i] = scannerObj.nextInt();
        }
        System.out.println("Vetor A: " + Arrays.toString(A));

        System.out.println("Informe o valor a ser somado: ");
        x = scannerObj.nextInt();

        for(int i=0;i<10;i++){
            B[i] = A[i]+x;
        }

        System.out.println("Vetor B: " + Arrays.toString(B));
    }
}
