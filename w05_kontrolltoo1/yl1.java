import java.lang.Math;
import java.util.Scanner;
/**
 * yl1
 */
public class yl1 {

    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in); {
        System.out.println("Sisestage esimene arv: ");
        int a = number1.nextInt();
        Scanner number2 = new Scanner(System.in);{
        System.out.println("Sisestage teine arv: ");
        int b = number2.nextInt();
        int c = a * b;
        System.out.println("Geomeetriline keskmine on: " + Math.sqrt(c));
    }number2.close();
}number1.close();
}
}