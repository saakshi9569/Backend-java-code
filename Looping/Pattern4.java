/*
       1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
*/
class Pattern4{
   public static void main(String args[])throws java.io.IOException{
      int i,space,rows,k=0,count=0,count1=0;
      System.out.printf("Enter an Integer: ");
      rows=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=rows;++i){
         for(space=1; space<=rows-i;++space){
            System.out.printf("  ");
            ++count;
         }
         while(k!=2*i-1){
            if(count<=rows-1){
              System.out.printf("%d ", i+k);
              ++count;
            }else{
               ++count1;
               System.out.printf("%d ", (i+k-2*count1));
            }
            ++k;
         }
         count1=count=k=0;
         System.out.printf("\n");
      }
   }
}
