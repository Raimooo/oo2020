package app;

public class Main{
    public static void main(String[] args) {
        int külastused = 0;

        Pood store1 = new Pood("Pood 1", 7, 21);
        Pood store2 = new Pood("Pood 2", 6, 18);
        Pood store3 = new Pood("Pood 3", 10, 23);
        Pood store4 = new Pood("Pood 4", 8, 21);

        Pood[] Poed = {store1, store2, store3, store4};

        for(int i = 0; i < Poed.length; i++){
            if(Poed[i].isOpened(19)){   //testib kas kell 7 õhtul on poed avatud või mitte ning kui on, siis ta läheb poodi.
                Poed[i].minePoodi();
                System.out.println(Poed[i].getName() + " on avatud");
            } else{
                System.out.println(Poed[i].getName() + " on suletud");
            }
        }

        store1.minePoodi();
        System.out.println(store1.getName() + " külastati: " + store1.getVisits()+" korda");

        for(int i = 0; i < Poed.length; i++){
            külastused += Poed[i].getVisits();
        }

        for(int i = 0; i < Poed.length; i++){
            külastused += Poed[i].getVisits();
        }
        System.out.println("Poode külastati: " + külastused+" korda");

        Weekdays storeweek = new Weekdays("Nädalaajad", 7, 22, 7, 22, 7, 22, 7 ,22, 7, 22, 10, 20, 10, 20);
        storeweek.isOpened(4, 6);
        storeweek.isOpened(2, 21);
        storeweek.isOpened(7, 20);
    }
}