class Abstract{
    public static void main(String args[]){
        Test th=new TestAbstract();
        th.method();
    }
}
abstract class Test {
    abstract void method();

     int number(){
         return 1;
     }

}
// you can extend that class a class abstract
class TestAbstract extends Test{
    @Override
    void method() {
        System.out.println("that a redifane methood abstract");
    }
    @Override
    int number(){
        return 12;
    }

    // that false because class abstract is not suport a instance object in a new class
    //        Abstract test = new Abstract();

}
