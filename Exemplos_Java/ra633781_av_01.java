import java.util.Scanner;
import java.util.Arrays;

class ra633781_av_01 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int X, x_par, x_impar;
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Informe o valor de X:");
        X = scannerObj.nextInt();

        if(X%2==0){
            x_par = 0;
            x_impar = 1;
        } else {
            x_impar = 0;
            x_par = 1;
        }

        System.out.println("Informe os valores do vetor A:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                A[i][j] = scannerObj.nextInt();
            }
        }

        System.out.println("Vetor A:");
        for(int i=0; i<5; i++){
            System.out.println("Linha "+ (i+1)+": " + Arrays.toString(A[i]));
        }

        System.out.println("");

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(A[i][j]%2==0 && x_par==0){
                    B[i][j] = A[i][j]*X;
                } else {
                    if(A[i][j]%2!=0 && x_impar==0){
                        B[i][j] = A[i][j]*X;
                    } else {
                        B[i][j] = A[i][j];
                    }
                }
            }
        }   

        System.out.println("Vetor B:");
        for(int i=0; i<5; i++){
            System.out.println("Linha "+ (i+1)+": " + Arrays.toString(B[i]));
        }
        
    }
}