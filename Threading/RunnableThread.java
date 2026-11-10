class Thread3 implements Runnable{
    int x;
    public void run(){
       for(int i=1;i<=5;i++){
          System.out.println(Thread.currentThread().getName()+" "+x);
          try{
             Thread.sleep(1000);
          }catch(Exception e){
          }
       }
    }
}
class RunnableThread{
   public static void main(String args[]){
       Thread3 t1=new Thread3();
       t1.x=50;
       Thread tt1=new Thread(t1,"thread1");
       tt1.start();
       Thread3 t2=new Thread3();
       t2.x=100;
       Thread tt2=new Thread(t1,"Thread2");
       tt2.start();
       Thread3 t3=new Thread3();
       t3.x=150;
       Thread tt3=new Thread(t1,"Thread");
       tt3.start();
       for(int i=1;i<=5;i++){
          System.out.println(Thread.currentThread().getName());
          try{
             Thread.sleep(1000);
          }catch(Exception e){
          }
       }
   }
}
/*
main
Thread 50
thread1 50
Thread2 50
main
Thread 50
thread1 50
Thread2 50
main
thread1 50
Thread 50
Thread2 50
main
thread1 50
Thread 50
Thread2 50
main
thread1 50
Thread 50
Thread2 50
*/
