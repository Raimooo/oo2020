import java.io.BufferedReader;
import java.io.FileReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 * yl3
 */
public class yl3 {

    public static void main(String[] args) throws IOException{
        ArrayList<Float> koefitsendid = new ArrayList<>();
        FileOutputStream fos = new FileOutputStream("palgad.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        float palk1 = 1100f;
        float algpalk = 1100f;
        try (BufferedReader reader = new BufferedReader(new FileReader("fail.txt"))) {
        
    while (reader.ready()) {
        koefitsendid.add(Float.parseFloat(reader.readLine()));
    }

for(int i = 0; i < koefitsendid.size(); i++){
    float palk;
    float palgad = (koefitsendid.get(i)*algpalk);
    algpalk = palgad;
    palk = palgad;
    System.out.println((i+2)+". Aasta palk on: "+palk);
}
}

System.out.println("Viie aasta koefitsendid on:"+koefitsendid);
System.out.println("Esimese aasta palk on: "+palk1+"€");
System.out.println();
}
    
}