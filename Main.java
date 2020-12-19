import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main { 

//int s;

public static int provideaRandomnum(int num) {
Random r = new Random();
int v = 0;

v = r.nextInt(num);
/*while (v==0) {
v = r.nextInt(num);
}*/
return v;
}

public static ArrayList<Integer> createArray(ArrayList<Integer> myArray) {
Scanner sz = new Scanner(System.in);
   System.out.print("Please, provide the size of the list : ");
   int sizeOfList = sz.nextInt();
   for(int n=1; n<=sizeOfList; n++)
     { myArray.add(n);}
      
        return myArray;
    }
    
  public static void main(String[] args) { 
    Scanner myObj = new Scanner(System.in);
     
    //Boolean YesOrNo = true;
	//String r = (YesOrNo)  ? "y" : "n";
    //String r = String.valueOf(YesOrNo);
    
    
    Boolean YesOrNo = true;
    String resp = String.valueOf(YesOrNo);
    int q = 0;
    if (resp.equalsIgnoreCase("true"))
    {resp = "y";}
    System.out.println("Test");
    ArrayList<Integer> car = new ArrayList<Integer>();
    System.out.println(createArray(car));
    Iterator<Integer> it = car.iterator();
    
    while(!resp.equalsIgnoreCase(null)){
           q = provideaRandomnum((car.size()));
       System.out.println("The size is :"+car.size()+ " and "+q);
       System.out.println("Please, get the question number : " +car.get(q));
       car.remove(q);
       if(!it.hasNext()){
    break;
  
    }

   System.out.print("Please, type any key : ");            
   resp = myObj.nextLine();
}
  } 
}
