class ViaMethod{
   int x=this.getX();
   int getX(){
     System.out.println(x);//0
     return 20;
   }
   ViaMethod(){
     //x=0; this line is inserted by compiler
     //x=this.getX() after compilation;
     System.out.println(x);//20
   }
   public static void main(String[] args){
      new ViaMethod();
   }
}
