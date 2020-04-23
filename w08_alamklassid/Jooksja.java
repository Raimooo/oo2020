
class Jooksja extends Inimene{


    public int jookstud;

    public Jooksja(int liikumiskiirus, String tegevus, int distants){
        super(liikumiskiirus, tegevus);
        jookstud = distants;
    }
    public void lisaDistants(int uusDistants){
        jookstud = uusDistants;
    }
    @Override
    public String toString(){
        return(super.toString()+"\njookstud on: "+jookstud+"\n");
    }
}