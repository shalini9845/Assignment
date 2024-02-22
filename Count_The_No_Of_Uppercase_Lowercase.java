import java.util.Scanner;
public class Count_The_No_Of_Uppercase_Lowercase {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        String input=obj.nextLine();
        int uppercaseCount=0;
        int lowercaseCount=0;
        for(char c: input.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                uppercaseCount++;

            }
            else if(Character.isLowerCase(c))
            {
                lowercaseCount++;
            }
            
            
            
        }
        System.out.println("no.of uppercase letters is  " + uppercaseCount);
        System.out.println("no.of lowercase letters  is  " + lowercaseCount);
        if(uppercaseCount==lowercaseCount)
        {
            System.out.println("the string  contain an equal no. of uppercase and lowercase letters ");

        }
        else
        {
            System.out.println("the string  doesnot contain an equal no. of uppercase and lowercase letters ");

        }
        obj.close();
        
        

    }
    
}
