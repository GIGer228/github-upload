public class MainCharacter {

    private String name = "";
    private boolean homeWork = false;

    public MainCharacter(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isHomeWork() {
        return homeWork;
    }
    public void setHomeWork(boolean homeWork) {
        this.homeWork = homeWork;
    }

    public void doHomeWork(boolean homeWork){
        if(homeWork != true){
            this.homeWork = true;
            System.out.println("Homework was done");
        }else{
            System.out.println("I've already done my homework");
        }
    }



}