/*
Enter the value
56
It is not an Armstrong no
Press 1 for continue and 0 for break
1
Enter the value
111
It is not an Armstrong no
Press 1 for continue and 0 for break
0

*/
class Armstrong{
  public static void main(String args[]){
     int rev=0;
     int z;
     int x2;
     while(true){
        System.out.println("Enter the value");
        x2=new java.util.Scanner(System.in).nextInt();
        int x1=x2;
        while(x1>0){
          z=x1%10;
          x1=x1/10;
          rev=rev+(z*z*z);
        }
        if(rev==x2){
           System.out.println("It is an Armstrong no");
        }else {
           System.out.println("It is not an Armstrong no");
        }
        rev=0;
        System.out.println("Press 1 for continue and 0 for break");
        int x3=new java.util.Scanner(System.in).nextInt();
        if(x3==1){
          continue;
        }else{
          break;
        }
     }
  }
}
