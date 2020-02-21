/**
 * kodutoo
 */
public class kodutoo {

    public static void main(String[] args) {
        Diary paevik1 = new Diary();
        Diary paevik = new Diary("12. Veebruar", "Vadim Kovalen", "Tahaks lihtsalt testida kas see toimib");
        Diary paevik2 = new Diary("19. Veebruar", "Raimo Pindus" , "Tundub et töötab ilusti");
        Diary[] paevikud = {paevik1, paevik, paevik2};
        int entry = 1;
        

        for(int i = 0; i < paevikud.length; i++){
            System.out.println(paevikud[i].getTime());
            System.out.println(paevikud[i].getName());
            System.out.println(paevikud[i].getDescription());
            System.out.println("Sissekandeid: " + (entry + i));
            System.out.println(" ");
        }
    }
}