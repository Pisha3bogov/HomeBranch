class Circle extends Figure {
    private int radius;

    public Circle(int x,int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double ploshad(){
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "draw circle";
    }

    @Override
    public String toString() {
        return "                 Круг:" + "\n\n" +
                "Значение x : " + getX()  + "\n" +
                "Значение y : " + getY() + "\n" +
                "Радиус : " + radius + "\n" +
                "Площадь фигуры : " + ploshad() + "\n" +
                "Вывод : " + draw() + "\n";
    }
}
