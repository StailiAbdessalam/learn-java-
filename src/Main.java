import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        // we have two data tipe to create a variable
        // first is primirives same int , double , string ...
        // second is referances type or objects for store complecsse data type  { Date}
        //int age = 19;
        // byte short int long || float double
        //long thelong = 5907909067L;
        //float thefloat = 2.43F;
        //String name = "abdessalam staili";
        //String testClass = new String("abdessalam staili");
        //LocalDate now = LocalDate.now();
        //System.out.println("date local is "+now);
        //Date date= new Date();
        //System.out.println("hi my age is "+age+"yers old");
        //System.out.println("my name is "+name.toUpperCase());
       // System.out.println("today is "+date);
        //Person mohcine = new Person("mouhcine");
        //Person hom = mohcine;
        //mohcine.name="false false";
        //System.out.println(mohcine.name+"       "+hom.name);
       // int a = 1;
        //switch (a){
          //  case 1: {
            //    System.out.println("hi every one");
              ////  break;
            //}
            //default:
              //  System.out.println("hi abdo");
        //}
// the first exercice is create the fibonacci number


    }

    static class Person  {
        String name = new String("default abdessalam");

        Person(String name){
            this.name = name ;
        }
    }
}

