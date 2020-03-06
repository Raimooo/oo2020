import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class yl2 {
   public static void main(String args[]){
      System.out.println("Sisestage kui suur on vajalik kogum: ");
      Scanner s = new Scanner(System.in); {
      int suurus = s.nextInt();
      int myArray[] = new int [suurus];
      float aste = 1f / suurus;
      int korrutus = 1;
      System.out.println("Sisestage arvud järjest: ");
      for(int i=0; i<suurus; i++){
         myArray[i] = s.nextInt();
         korrutus = korrutus * myArray[i];
      }
      System.out.println("Kogumis olevad arvud on: " +Arrays.toString(myArray));
      System.out.println("Kokku korrutatud kogum on:" + korrutus);
      System.out.println("Juur astmes: "+suurus);
      System.out.println("Geomeetriline keskmine on: " + Math.pow(korrutus, aste));
   }s.close();
}
}