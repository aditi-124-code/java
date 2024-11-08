public class PatternA {
    public static void main(String[] args) {
        int n = 3; 

        int num = 1;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                    
                }
                System.out.println();
            }
            
        
        }
    }
}

