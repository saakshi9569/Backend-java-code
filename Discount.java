class Discount{
   public static void main(String[] args){
     int totalPrice=0;
     System.out.println("Enter the Units:");
     int units= new java.util.Scanner(System.in).nextInt();
     int price=units*100;
     if(price>1000){
        totalPrice= (price)-(price*10)/100;
     } else {
        totalPrice=price;
     }
     System.out.printf("Total Price: %d",+ totalPrice);
   }
}
