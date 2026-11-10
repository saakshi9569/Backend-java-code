import java.util.Date;
class RunnableJob implements Runnable{
    public void run(){
        Thread thread=Thread.currentThread();
        System.out.println("Runnable Job is being run by "+ thread.getName() + " at " + newDate());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
           e.printStackTrace();
        }
    }
}
public class ThreadJoinExample1{
    public static void main(String args[])throws InterruptedException{
        
    }
}

