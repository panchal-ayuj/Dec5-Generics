public class GClass <T extends Shape> {
    T shape;
    GClass(T shape){
        this.shape = shape;
    }

    public void draw(T t) {
        t.draw();
    }
}