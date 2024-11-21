package PACKAGE_NAME.Human;

public class Family {
    private Human mother;
    private Human father;
    private Human children;
    private Pet pet;

    public Family() {
    }

    public Family(Human mother, Human father, Human children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getChildren() {
        return children;
    }

}
