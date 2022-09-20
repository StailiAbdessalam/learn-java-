public class Encapsulation {
     public  static void main(String args[]){
         Student student = new Student("abdessalam");
         System.out.println(student.getname());
     }
}

class Student implements Cloneable{
    Student(String name){
        this.name=name;
    }
    // we have a name privite so you can't access a value with another class
    private String name;
    // i use getters to access a
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}


