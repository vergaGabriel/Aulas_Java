import java.util.Scanner;
import java.util.Arrays;

class ex02 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] C = new int[5][5];
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Informe os valores do vetor A:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                A[i][j] = scannerObj.nextInt();
            }
        }

        System.out.println("Informe os valores do vetor B:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                B[i][j] = scannerObj.nextInt();
            }
        }

        System.out.println("Vetor A: "); 
        for(int i=0;i<5;i++){
           System.out.println(Arrays.toString(A[i])); 
        }

        System.out.println("Vetor B: "); 
        for(int i=0;i<5;i++){
           System.out.println(Arrays.toString(B[i])); 
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                C[i][j] = B[i][j]+A[i][j];
            }
        }

        System.out.println("Vetor C: "); 
        for(int i=0;i<5;i++){
           System.out.println(Arrays.toString(C[i])); 
        }
    }
}
