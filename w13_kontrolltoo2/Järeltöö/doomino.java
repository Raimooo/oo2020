import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * doomino
 */
public class doomino {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> ylemine = new ArrayList<>();
        ArrayList<Integer> alumine = new ArrayList<>();

        try (Scanner doominodyl = new Scanner(new FileReader("doominoyl.txt"))){
            while (doominodyl.hasNext()){
                ylemine.add(doominodyl.nextInt());
            }
        try (Scanner doominodal = new Scanner(new FileReader("doominoal.txt"))){
            while (doominodal.hasNext()){
                alumine.add(doominodal.nextInt());
                }
            }
        }
        for(int i = 0; i < ylemine.size();i++){
            if(ylemine.get(i)>= 3 || alumine.get(i)>=3){
                System.out.println("Ülemiste täppide arv: "+ylemine.get(i) + ". Alumiste täppide arv: " + alumine.get(i));
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Lisage 2 arvu (ülemine ja alumine täppide arv): ");
        ylemine.add(input.nextInt());
        alumine.add(input.nextInt());
        for(int i = 28;i < ylemine.size();i++){
            System.out.println("Ülemine on: "+ylemine.get(i)+" Alumine on: "+alumine.get(i));
        }
        }
    }