import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;

public class giveRandom {
public static int provideaRandomnum(int num) {
Random r = new Random();
int v = 0;

v = r.nextInt(num);
while (v==0) {
v = r.nextInt(num);
}
return v;
}

public static int verifyElements(int A, int B, int C) {
B = provideaRandomnum(C);
while(A == B) {
B = provideaRandomnum(C);
}
return B;
}

public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
int i = 0;
ArrayList<Integer> autQ = new ArrayList<Integer>();
autQ.add(6);
autQ.add(600);
Iterator<Integer> it = autQ.iterator();
//System.out.println(it.next());
//ArrayList<Integer> selQ = provideaRandomnum(51);
Boolean YesOrNo = true;
//String val = (YesOrNo)  ? "y" : "n";
String val = String.valueOf(YesOrNo);
System.out.println(it.next());
  while(val.equalsIgnoreCase("true")) {
  //int B = provideaRandomnum(51);
  System.out.println(val);

      while(it.hasNext()) {
      int AA = 0;

      int elem = it.next();
      int interval = verifyElements(elem, AA, 40);
      autQ.add(interval);
      System.out.println("Get the question number : "+autQ.get(i)+ " from automation interview question");

      i++;
      if(i==1){break;
      }
     }

//selQ.add(B);


//System.out.println("Get the question number : "+selQ.get(i)+ " from Selenium interview question");
 
   val = myObj.nextLine();  // Read user input
   if (!val.equalsIgnoreCase("true")) {
    myObj.close();
   }
   i++;
}

}

}
