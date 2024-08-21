package extendthread;

public class NewThread extends Thread{

    NewThread(){
         start();// starts the thread  - starts run method
    }

    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println("child thread : "+i);
                 Thread.sleep(500);
            }
        } catch (Exception e){
            System.out.println("exception occured : "+e.getMessage());
        }
        System.out.println("child thread completed");
    }
}
