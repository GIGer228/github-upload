public class Location {

    private String locationName = "";
    private boolean isLocked = false;

    public Location(String name, boolean isLocked){
        this.locationName = name;
        this.isLocked = isLocked;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    public String getLocationName() {
        return locationName;
    }

    public void open(){
        this.isLocked = false;
    }
    public void close(){
        this.isLocked = true;
    }


}
