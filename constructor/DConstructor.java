class DConstructor{
  int x;
  int y;
  DConstructor(){
    x=10;
    y=20;
  }
  void show(){
    System.out.println(x);//10
    System.out.println(y);//20
  }
  public static void main(String[] args){
     DConstructor d1=new DConstructor();
     d1.show();//10 20
     DConstructor d2=new DConstructor();
     d2.show();//10 20
  }
}
