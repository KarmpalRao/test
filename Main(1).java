import java.util.*;
import java.lang.*;

class Main {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter your string : ");
    
    String str =sc.nextLine();
    char[]strArray=str.toCharArray();
    StringBuffer temp=new StringBuffer();
    
    
    for(int i=0;i<str.length();i++){
        if(strArray[i]!=' '){
           //temp =strArray[i];
           temp.append(strArray[i]);
        }
    }
    System.out.println(temp);
 }
}