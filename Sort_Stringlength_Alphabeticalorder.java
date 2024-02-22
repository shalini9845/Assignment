import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_Stringlength_Alphabeticalorder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        
        System.out.println("Enter the number of strings:");
        int n = obj.nextInt();
        obj.nextLine(); 
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = obj.nextLine();
        }

        
        Arrays.sort(strings, new Comparator<String>() {
            
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length(); 
                } else {
                    return s1.compareTo(s2); 
                }
            }
          });

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        obj.close();
    }
}
