/*
5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 
*/
class Pattern16{
  public static void main(String args[]){
     int i,j;
     for(i=5;i>=1;i--){
        for(j=5;j>=1;j--){
          System.out.printf("%d ",i);
        }
        System.out.println();
     }
  }
}
