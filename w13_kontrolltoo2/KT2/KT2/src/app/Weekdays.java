package app;

public class Weekdays {

    String name;
    int monOpenTime;
    int monCloseTime;
    int tueOpenTime;
    int tueCloseTime;
    int wedOpenTime;
    int wedCloseTime;
    int thuOpenTime;
    int thuCloseTime;
    int friOpenTime;
    int friCloseTime;
    int satOpenTime;
    int satCloseTime;
    int sunOpenTime;
    int sunCloseTime;

    public Weekdays (String name, int monOpenTime, int monCloseTime, int tueOpenTime, int tueCloseTime, int wedOpenTime, int wedCloseTime, int thuOpenTime, int thuCloseTime, int friOpenTime, int friCloseTime, int satOpenTime, int satCloseTime, int sunOpenTime, int sunCloseTime){
        this.name = name;
        this.monOpenTime = monOpenTime;
        this.monCloseTime = monCloseTime;
        this.tueOpenTime = tueOpenTime;
        this.tueCloseTime = tueCloseTime;
        this.wedOpenTime = wedOpenTime;
        this.wedCloseTime = wedCloseTime;
        this.thuOpenTime = thuOpenTime;
        this.thuCloseTime = thuCloseTime;
        this.friOpenTime = friOpenTime;
        this.friCloseTime = friCloseTime;
        this.satOpenTime = satOpenTime;
        this.satCloseTime = satCloseTime;
        this.sunOpenTime = sunOpenTime;
        this.sunCloseTime = sunCloseTime;
    }
    public void isOpened(int dayOfWeek, int time){
        switch (dayOfWeek){
            case 1:
                if (monOpenTime <= time && monCloseTime > time){
                    System.out.println(name + " on avatud");
                } else {
                    System.out.println(name + " on suletud");
                }
                break;
            case 2:
                if (tueOpenTime <= time && tueCloseTime > time){
                    System.out.println(name + " on avatud");
                } else {
                    System.out.println(name + " on suletud");
                }
                break;
            case 3:
                if (wedOpenTime <= time && wedCloseTime > time){
                    System.out.println(name + " on avatud");
                } else {
                    System.out.println(name + " on suletud");
                }
                break;
            case 4:
                if (thuOpenTime <= time && thuCloseTime > time){
                    System.out.println(name + " on avatud");
                } else {
                    System.out.println(name + " on suletud");
                }
                break;
            case 5:
                if (friOpenTime <= time && friCloseTime > time){
                    System.out.println(name + " on avatud");
                } else {
                    System.out.println(name + " on suletud");
                }
                break;
            case 6:
                if (satOpenTime <= time && satCloseTime > time){
                    System.out.println(name + " on avatud");
                } else {
                    System.out.println(name + " on suletud");
                }
                break;
            case 7:
                if (sunOpenTime <= time && sunCloseTime > time){
                    System.out.println(name + " on avatud");
                } else {
                    System.out.println(name + " on suletud");
                }
                break;
        }
    }
}