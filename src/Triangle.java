class Triangle extends Figure {
    private int b;
    private int h;

    public Triangle(int x,int y, int b, int h) {
        super(x,y);
        this.b = b;
        this.h = h;
    }

    @Override
    public double ploshad() {
        return b * h * 0.5;
    }

    @Override
    public String draw() {
        return "draw triangle";
    }

    @Override
    public String toString() {
        return  "                     Треугольник:" + "\n\n" +
                "Значение x : " + getX()  + "\n" +
                "Значение y : " + getY() + "\n" +
                "Значение b : " + b + "\n" +
                "Значение h : " + h + "\n" +
                "Площадь фигуры : " + ploshad() + "\n" +
                "Вывод : " + draw() + "\n";
    }
}
