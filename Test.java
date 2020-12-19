import java.util.*;

public class Test { 

   public static void main(String[] args) {
     
     for (int i = 1; i<=10;i++){ 
      Random r = new Random();
int v = 0;

v = r.nextInt(10);
while (v==0) {
v = r.nextInt(10); 
}
       System.out.println("The number is :"+v+ " and "+i);
       
       }
         }

}