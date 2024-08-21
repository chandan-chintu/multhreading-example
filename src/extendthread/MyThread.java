package extendthread;

public class MyThread {
    public static void main(String[] args) {

       NewThread newThread = new NewThread();
     //  newThread.run();

        try {
            for(int i=1;i<=5;i++){
                System.out.println("main thread : "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println("exception occured : "+e.getMessage());
        }
        System.out.println("main thread completed");
    }
}
