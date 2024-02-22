import java.util.Scanner;
public class Check_Num_Is_Prime_Or_Not {
    public static void main(String[] args)
    {
        int num;
        System.out.println("enter the number:");
        Scanner obj =new Scanner(System.in);
        num= obj.nextInt();
        int i=1;
        int count=0;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;

            }
        }
        if(count==2)
        {
            System.out.println(num + " " + "the number is prime");
        }
        else{
            System.out.println(num + " " + "the number is not prime");
        }
        obj.close();
        

    }
    
}
