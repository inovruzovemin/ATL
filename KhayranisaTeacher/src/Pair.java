public class Pair <T1,T2>{
    private T1 value1;
    private T2 value2;

    public void setValues(T1 value1, T2 value2){
        this.value1 = value1;
        this.value2= value2;
    }
    public void printValues(){
        System.out.println("A: " + value1+ ", B : " + value2);
    }
}
