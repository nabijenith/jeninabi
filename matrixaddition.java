public class matrixaddition {
    public static void main(String args[]){
        int a[][]={{1,0},{1,3}};
        int b[][]={{1,2},{0,1}};

        int c[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {

                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] + "");
            }
            System.out.println();

            }
        }
    }

