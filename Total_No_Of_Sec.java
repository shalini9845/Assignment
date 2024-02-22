 import java.util.Scanner;
public class Total_No_Of_Sec {
   public static void main(String[] args)
   {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the string Represent time('4h 20m 10s')");
    String input=obj.nextLine().toLowerCase();
    int hours=0;
    int minutes=0;
    int seconds=0;
    String[] components= input.split("\\s+");
    for(String component:components)
    {
        if(component.endsWith("h"))
        {
            hours=Integer.parseInt(component.substring(0, component.length()-1));
        }
        else if(component.endsWith("m"))
        {
            minutes=Integer.parseInt(component.substring(0, component.length()-1));

        }
        else if(component.endsWith("s"))
        {
            seconds=Integer.parseInt(component.substring(0, component.length()-1));

        }
    }
    int totalseconds= hours * 3600 + minutes * 60 + seconds;
    System.out.println("total no. of seconds " + totalseconds);
    obj.close();


   }
}
 
    

