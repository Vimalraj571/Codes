
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        float d = scan.nextFloat();
        String s = scan.nextLine();

        if(s.isEmpty() || scan.hasNextLine()){
            s = scan.nextLine();
        }
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}