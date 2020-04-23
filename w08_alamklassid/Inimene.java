/**
 * Inimene
 */
public class Inimene {

    public int liikumiskiirus;
    public String tegevus;

    public Inimene(int liikumiskiirus, String tegevus){
        this.liikumiskiirus = liikumiskiirus;
        this.tegevus = tegevus;
    }
    public void Aeglustamine(int aeglustamine){
        liikumiskiirus -= aeglustamine;
    }
    public void Kiirustamine(int kiirustamine){
        liikumiskiirus += kiirustamine;
    }
    public String toString(){
        return("Liikumiskiirus on hetkel: "+liikumiskiirus+"\n"+"tegevus on hetkel: "+tegevus+"");
    }
}