package matrixaddandmultiply;


public class MatrixAddAndMultiply {

    
    public static void main(String[] args) {
        int a[][]={{1,3,12},
                   {3,4,8},
                   {5,17,90}};
        int b[][]={{2,4,6},
                   {3,5,6},
                   {56,34,0}};
        int c[][]=new int[3][3];
        int m[][]=new int[3][3];
        int i,j,k;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                m[i][j]=0;
                for(k=0;k<3;k++)
                {
                    m[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
