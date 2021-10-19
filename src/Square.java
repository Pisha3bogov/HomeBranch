class Square extends Figure {
    private int a;
    private int b;

    public Square (int x,int y,int a,int b) {
        super(x,y);
        this.a = a;
        this.b = b;
    }

    @Override
    public double ploshad() {
        return a*b;
    }

    public String draw(){
        return "draw square";
    }

    @Override
    public String toString () {
        return "                 Квадрат:" + "\n\n" +
                "Значение x : " + getX()  + "\n" +
                "Значение y : " + getY() + "\n" +
                "Значение a : " + a + "\n" +
                "Значение b : " + b + "\n" +
                "Площадь фигуры : " + ploshad() + "\n" +
                "Вывод : " + draw() + "\n";
     }
}
