import java.util.*;

public class solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<=3;i++){
            String s = scan.nextLine();
            int i = scan.nextInt();
            System.out.printf("%-15s%03d %n",s,i);
        }   
        scan.close();
        System.out.println("================================");    
    }
}