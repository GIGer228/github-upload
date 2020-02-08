import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Security extends Character{

    Scanner in = new Scanner(System.in);
    Random random = new Random();
    private String[] phrases = new String[] {"- Hey kid", "- How are you?", "- Don't be late", "- Nice shoes", "- ..."};
    private String[] hours = new String[] {"14:00", "22:00", "10:00", "9:00", "8:30"};
    private static int reputation = 0;

    public Security(){
        super("Eugene");
    }
    public static int getReputation() {
        return reputation;
    }
    public void changeReputation(int rep) {
        this.reputation += rep;
    }

    public void say(){
        System.out.println(this.phrases[random.nextInt(5)]);
    }
    public void repEvent(){
        System.out.println("Hey kid, what's time now?");
        System.out.println(Arrays.toString(hours));
        if(in.nextLine().equals(hours[random.nextInt(5)])){
            System.out.println("Oh, thanks");
            this.reputation += 5;
            System.out.println("//Your rep increased " + "(" + getReputation() + ")");
        }else {
            System.out.println("Look better on your watch >:(");
            this.reputation -= 5;
            System.out.println("Your rep decreased " + "(" + getReputation() + ")");
        }
    }

}
