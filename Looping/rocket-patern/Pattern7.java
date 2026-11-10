/*
*********
**** ****
***   ***
**     **
*       *
*       *
**     **
***   ***
**** ****
*********
*/
class Pattern7{
   public static void main(String args[]){
      int i,j,n,k,l,p,q,r,s,m;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      p=n;
      q=n;
      for(i=n;i>=1;i--){
	       for(j=1;j<=i;j++){
              System.out.printf("*");
	       }
	       for(k=p*2;k<n*2-1;k++){
              System.out.printf(" ");
	       }
	       for(l=i;l!=0;l--){
	            if(l==n){
	               continue;
	            }
              System.out.printf("*");
	       }
	       p--;
	       System.out.println();
      }
      for(i=1;i<=n;i++){
	       for(j=1;j<=i;j++){
              System.out.printf("*");
	       }
	       for(k=q*2-2;k>1;k--){
              System.out.printf(" ");
	       }
	       for(m=i;m!=0;m--){
	            if(m==n){
	               continue;
	            }
              System.out.printf("*");
	       }
	       System.out.println();
	       q--;
      }
   }
}
