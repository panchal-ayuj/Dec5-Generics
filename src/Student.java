public class Student <T> {
    T name;
    Student(T name){
        this.name = name;
    }
    public void show(){
        System.out.println(name);
    }
}