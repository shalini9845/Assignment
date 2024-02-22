import java.util.Scanner;
public class Integer{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("enter the value of n");
        Scanner obj=new Scanner(System.in);
         n=obj.nextInt();
        
        for( int i=1 ; i<=n ; i++)
        {
            for( int j=1 ; j<=i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        obj.close();





    }
}
    