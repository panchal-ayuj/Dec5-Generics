public class Main {
    public static void main(String[] args) {
        Student obj = new Student("Ayuj");
        obj.show();
        Student obj2 = new Student(5);
        obj2.show();
        Student obj3 = new Student(10.5);
        obj3.show();

        Circle circle = new Circle();
        GClass obj4 = new GClass(new Square());
        obj4.draw(circle);
        obj4.shape.draw();

        SortClass list = new SortClass(new int[]{1, 3, 2});
        list.sort();
    }
}