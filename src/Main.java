import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        //System.out.print("Enter your name: ");
        //MainCharacter hero = new MainCharacter(in.nextLine());

        //School's enter
        Location enter = new Location("Enter", false);
        Security Eugene = new Security();
        System.out.println("//You came into school");
        System.out.println("- Hello, Mr. " + Eugene.getName());
        Eugene.say();
        Eugene.repEvent();
        //

        

    }

}
