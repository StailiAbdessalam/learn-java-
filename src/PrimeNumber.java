public class PrimeNumber {
    public static void main(String args[]){
        int NumberTvhecked = 7;
        float moyen= NumberTvhecked/2;
        int i=2,flag=0;
        if(moyen==0||moyen==1){
            System.out.println(NumberTvhecked +" is not prime Number");
        }else {
            while(i<=moyen){
                if(NumberTvhecked % i==0){
                    System.out.println(NumberTvhecked +" is not prime Number");
                    flag=1;
                    break;
                }
                i++;
            }
            if(flag==0){
                System.out.println(NumberTvhecked +" is prime Number");


            }

        }

    }
}
