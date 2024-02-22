import java.util.Scanner;

public class Sort_Array {
    static void sort( int marks[],int length)
 {
    for( int i=0;i<length-1;i++)
    {
        
        for(int j=0;j<length-1-i;j++)
        {
            if(marks[j]<marks[j+1])
            {
                int temp=marks[j];
                marks[j]=marks[j+1];
                marks[j+1]=temp;

            }
        }
    }
 }
    public static void main(String[] args)
    {
        int[] marks;
        marks=new int[5];
        int i=0;
        System.out.println(marks.length);
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the elements of marks " );
        for( i=0;i<5;i++)
        {
            marks[i]= obj.nextInt();
        }
        
        for( i=0;i<5;i++)
        {
           System.out.println("marks of arrays are: " + marks[i]);
        }
        
        sort(  marks, 5);
        for( int num:marks)
        {
           System.out.println("marks of arrays sorted in descending order  are: " + num + " ");
        }


        obj.close();


    }

 }