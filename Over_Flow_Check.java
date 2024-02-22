
public class Over_Flow_Check {
    public static boolean checkAdditionOverflow(int a,int b)
    {
        int sum = a + b;
        return((a>0 && b>0 && sum<0)|| (a<0 && b<0 && sum>0));
    }
    public static boolean checkMultiplicationOverflow(int a,int b)
    {
        
        return(a != 0 && ((a * b) / a != b));
    }
    public static void main(String[] args)
    {

       int num_1=900;
       int num_2=800;
       boolean additionOverflow=checkAdditionOverflow(num_1,num_2);
       System.out.println("addition overflow " + additionOverflow);
       boolean multiplicationOverflow=checkMultiplicationOverflow(num_1,num_2);
       System.out.println("multiplication overflow " + multiplicationOverflow);


        



    }
    
}
