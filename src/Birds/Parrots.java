package PACKAGE_NAME.Birds;

public class Parrots extends Birds {
    private String favWords;
    public Parrots(String name, int age, String favWords) {
        super(name, age);
        this.favWords= favWords;
    }

    public String getFavWords() {
        return favWords;
    }

    public void setFavWords(String favWords) {
        this.favWords = favWords;
    }
    public void speak(){
        System.out.println(getName()+ " speak");
    }
}
