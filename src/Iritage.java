public class Iritage extends Animal {
    public static void main(String args[]){
        System.out.println("is class of check consept inheritance");
        Animal Details = new Animal();
        Details.detailsAnimal("cat",100);
        Details.callAnimal();
    }




}

class Animal{
    String name;
    int Prix;

    public void detailsAnimal(String name,int Prix){
        this.name=name;
        this.Prix=Prix;
    }
    public void callAnimal(){
        System.out.println("this animal naming "+name+" and your Prix is "+Prix);
    }


}

