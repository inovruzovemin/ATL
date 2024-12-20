public class Person <T>{
    T character;

    public Person(T character) {
        this.character = character;
    }

    public T getName() {
        return character;
    }
}
