public class Fibonacci {

   public static void  main(String args[]){
       int last = 0;
       int before = 1;
       int N;
       int i = 0;
       System.out.println(last+" "+before);
       while(i<10){
           N=last+before;
           System.out.println(N);
           last=before;
           before=N;
           i++;
       }

   }

}
