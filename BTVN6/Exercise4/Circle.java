package truongvietbinh_4831.Lec10_Abstract.Exercise4;

public class Circle implements Drawable, Colorable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling circle with color");
    }
}
