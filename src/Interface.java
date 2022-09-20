public class Interface implements note{
    public static void main(String arg[]){
        note test = new Interface();
        test.somme();
        test.multiple();
    }
    @Override
    public void somme() {
        System.out.println("is the samme method");
    }
    @Override
    public void multiple() {
        System.out.println("is the multiple method");
    }
}
// we can implement (multer iritage) exemple :
class TesMI implements note,name{
    public static void main(String args[]){
        TesMI stock = new TesMI();
        stock.getName();
    }
    @Override
    public void somme() {
        System.out.println("is the samme method");
    }
    @Override
    public void multiple() {
        System.out.println("is the multiple method");
    }
    public void getName(){
        System.out.println("is the multipte impliments");
    }
}
//all the interface
interface note{
    //first id relation between classes and interfaces
    // between class and class ----relations extends----
    // between interface and class ---relation implements---
    // between interface and interface ----relations extends----
    void somme();
    void multiple();
}
interface name{
    default void getName(){
        System.out.println("idhfiodhsi");
    };
}

// for more information we have
// nested class  and nested interface and class nested interface and convert