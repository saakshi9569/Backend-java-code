class GetBytes{
   public static void main(String args[]){
      String str= new String("welcome to tutorials of string");
      try{
         byte[] str2 = str.getBytes();
         for(int i=0;i<str2.length;i++){
            System.out.println(str2[i]);
         }
      }catch(Exception e){
         System.out.println("Unsupported charcter set");
      }
   }
}
/*
119
101
108
99
111
109
101
32
116
111
32
116
117
116
111
114
105
97
108
115
32
111
102
32
115
116
114
105
110
103
*/

