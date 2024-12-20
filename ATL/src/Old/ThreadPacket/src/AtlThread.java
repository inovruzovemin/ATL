public class AtlThread extends Thread{

    public void run() {
        System.out.println("This is sparta");
    }
    public static void main(String[] args) {

        var atl = new AtlThread();
        atl.run();
        System.out.println(Thread.currentThread().getName());
    }
}