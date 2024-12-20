public class TripleGeneric <T extends Base1, U extends Base2, V extends Base3> {
    private T obj1;
    private U obj2;
    private V obj3;

    public void setValues(T obj1, U obj2, V obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    public void useAllBaseMethods(){
        obj1.printBase1();
        obj2.printBase2();
        obj3.printBase3();
    }
}
