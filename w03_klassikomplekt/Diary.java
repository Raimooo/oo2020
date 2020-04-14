  
/**
 * klass
 */
public class Diary {

    private String time;
    private String name;
    private String description;
    private Sugu sugu;
    public int entry;
    public Diary(String time, String name, String description, Sugu sugu) {
        this.time = time;
        this.name = name;
        this.description = description;
        this.sugu = sugu;
    }
    public Diary() {
        time = "11. Jaanuar";
        name = "Toomas Tamm";
        description = "Lihtsalt testin";
        sugu = sugu.Mees;
    }
	public String getTime(){
        return time;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getEntry(){
        return entry;
    }
    public Sugu getSugu(){
        return sugu;
    }
}