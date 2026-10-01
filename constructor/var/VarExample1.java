class VarExample1{
   var x;
   static void show(var z){ //compilation error -> var as argument not used
      System.out.println(z);
   }
   public staic void main(String[] args){
      show(10);
   }
}


