import java.util.Scanner;
public class Check_Special_Array {
    public static void main(String[] args)
    {
        int[][] arr;
        arr= new int[3][3];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the elements of 3X3 array");
        for(int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
                if(arr[i][j]%2==0)
                {
                    sumEven +=arr[i][j];
                }
                else{
                    sumOdd +=arr[i][j];
                }
            }
        }
        if(sumEven==sumOdd)
        {
            System.out.println("the array is especial");
        }
        else{
            System.out.println("the array is not especial");
        }
        obj.close();


    }
}
