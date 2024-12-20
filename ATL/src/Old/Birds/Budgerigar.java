package PACKAGE_NAME.Birds;

public class Budgerigar extends Birds{
    private  boolean canTalk;
    public Budgerigar(String name,int age,boolean canTalk){
        super(name,age);
        this.canTalk = canTalk;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }
    public void sing(){
        System.out.println(getName()+ " can sing");
    }
    public void fly(){
        System.out.println(getName()+ " can fly for short distance");
    }
}
