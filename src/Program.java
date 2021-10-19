import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Figure res1 = new Square(1,2,3,4);
        Figure res2 = new Circle(1,2,5);
        Figure res3 = new Triangle(1,2,3,15);

        List<Figure> result = new ArrayList<>();
        result.add(res1);
        result.add(res2);
        result.add(res3);

        for(Figure el: result) System.out.println(el);
    }
}
