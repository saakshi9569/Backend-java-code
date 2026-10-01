class Anonymous{
  int salary;
  Anonymous(){
    salary=15000;
  }
  void show(){
     System.out.println(salary);
  }
  public static void main(String[] args){
     System.out.println(new Anonymous().salary);//15000
     new Anonymous().show();//15000
     System.out.println(new Anonymous());//Anonymous@7ad041f3
  }
}

