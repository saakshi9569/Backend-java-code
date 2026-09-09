class Temp{
 int x;
 {
 //init block
   System.out.println("init Block");
   this.x=10;
 }
 Temp(){
   System.out.println("Default");
   System.out.println(x);
 }
 {
   System.out.println("Second");
 }
 Temp(int x){
   System.out.println(x);
 }
 public static void main(String[] args){
   new Temp(); //anonymous object
   new Temp(10);
   new Temp();
 }
}
