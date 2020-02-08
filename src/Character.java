public class Character {

    private String name = "";
    private static String[] phrases = new String[5];
    private static int reputation = 0;

    public Character(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static int getReputation() {
        return reputation;
    }
    public void changeReputation(int rep) {
        if(rep >= 0) this.reputation += rep;
        else this.reputation -= rep;
    }

    public void homeWorkCheck(boolean homeWork){
        if(homeWork == true) {
            System.out.println("Good boy, well done!");
            System.out.println("//Your rep increased");
            this.reputation++;
        }
        else {
            System.out.println("Arh, you're hopeless kid!");
            System.out.println("//Your rep decreased");
            this.reputation--;
        }
    }
    public static String talk(int index){
        return phrases[index];
    }
    public void task(){}
    public void repEvent(boolean check){
        if(check = true) this.reputation++;
        else this.reputation++;
    }


}
