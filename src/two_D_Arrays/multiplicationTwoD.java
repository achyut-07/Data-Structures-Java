package two_D_Arrays;

public class multiplicationTwoD {
    public static void main(String[] args) {
        int[][] a={{1,2,1},{2,1,2}};
        int[][] b={{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        int m=a.length,n=a[0].length;
        int p=b.length,q=b[0].length;
        if(n!=p) {
            System.out.println("Multiplication not possible");

        }
        else
        {
            int[][] c = new int[m][q];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
