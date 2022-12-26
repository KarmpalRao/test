import java.util.*;
import java.lang.*;

class Main {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of person : ");
    int person = sc.nextInt();
    int []age = new int[person];
    System.out.println("enter age :");
    int price=0;
    for(int i=0;i<person;i++){
        age[i]=sc.nextInt();
        if(age[i]>=2)
        {
            if(age[i]<=13)
            {
                price=price+100;
            }
            else
            {
                price=price+150;
            }
           
        }
    }
    System.out.println(price);
   
    }
    
 }
