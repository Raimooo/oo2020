/**
 * klass
 */
public class Diary {

    private String time;
    private String name;
    private String description;
    public int entry;
    public Diary(String time, String name, String description) {
        this.time = time;
        this.name = name;
        this.description = description;
    }
    public Diary() {
        time = "11. Jaanuar";
        name = "Toomas Tamm";
        description = "Lihtsalt testin";
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
}