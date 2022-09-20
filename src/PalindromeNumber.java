public class PalindromeNumber {
    public static  void main(String args[]){
        int numberChecked = 5545;

        int number=numberChecked,r,dev=0;
        while(numberChecked>0){
            r=(numberChecked)%10;
            numberChecked=numberChecked/10;
            dev=(dev*10)+r;
        }
        if(dev==number)


        System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

    }
}


