import java.util.*;

class Test {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    
    for(int i=0; i<=a;i++){
        int b=i/10;
        int digit=0;
        while(b!=0){
            b=b/10;
            digit++;
        }
        System.out.println(digit);
    }

   
   }
    
}