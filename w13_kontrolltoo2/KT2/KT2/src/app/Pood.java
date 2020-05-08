package app;

public class Pood {
    private String nimi;
    private int openTime;
    private int closeTime;
    private int visits;
    private boolean isOpened;

    public Pood(String nimi, int openTime, int closeTime){
        this.nimi = nimi;
        this.openTime = openTime;
        this.closeTime = closeTime;
        visits = 0;
    }

    public String getName(){
        return nimi;
    }

    public boolean isOpened(int time){
        if(openTime <= time && time <= closeTime){
            return true;
        } else{
            return false;
        }
    }

    public int getVisits(){
        return visits;
    }

    public void minePoodi(){
        visits++;
    }
}