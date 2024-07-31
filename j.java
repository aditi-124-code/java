import java.util.*;
public class j{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");

            }
            int space=2*(i-1);
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for(int c=1; c<=(n-i+1); c++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
    

