
public class Sum_Of_smallestno_Largestno_Inarray {
    
   public static int findMinMaxSum(int[] marks)
   {
    if(marks == null || marks.length==0)
    {
        throw new IllegalArgumentException("array is empty");
    }
    int smallest=marks[0];
    int largest=marks[0];
    for(int mark : marks)
    {
        if(mark<smallest)
        {
            smallest=mark;

        }
        if(mark>largest)
        {
            largest=mark;

        }
        


    }
    return smallest + largest;
   }
    
        public static void main(String[] args)
        {
            int[] marks={10,20,30,40,50};
            int sum=findMinMaxSum(marks);
            System.out.println("sum of smallest and largest number" + sum);

        }
   }   
    


    


