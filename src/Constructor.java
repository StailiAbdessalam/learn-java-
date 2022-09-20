public class Constructor {
    String name, city;
     static int age;
    // you can called a constructor in another constractor
    public Constructor() {
        this("Amine","Casa");
    }
    public Constructor(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public static void main (String args[]){
        System.out.println("dlhfjdshoi");
        // if variable static you can called a name of class and .name of variable
        Constructor.age = 10;
    }
    // @ you can use the privite contructor for exemple to securise the api
    /*
    private Constructor Constructor(){
    return new Constructor();
     }
     */




}