package RealVNC;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public abstract class Patient {
    private String name;
    private String description;

    protected abstract void save();

    protected Patient(String name, String description){
        setName (name);
        changeDescription(description);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String describe(){
        return this.description;
    }
    void changeDescription(String newDescription){
        this.description = newDescription;
    }

    public static void main(String[] args) {

    }
}
