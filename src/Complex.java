public class Complex {

    private double x;
    private double y;
    private double module;
    private double f;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double getX() {
        return x;
    }

    private double getY() {
        return y;
    }

    private void computeModule() {
        module = Math.sqrt(x * x + y * y);
    }

    private void computeF() {
        f = Math.atan((y / x));
    }

    public Complex add(Complex number) {
        System.out.println("(" + this.x + "+" + number.getX() + ")" + "+" + "(" + this.y + "+" + number.getY() + ")i");
        return new Complex(this.x + number.getX(), this.y + number.getY());
    }

    public Complex sub(Complex number) {
        System.out.println("(" + this.x + "+" + number.getX() + ")" + "-" + "(" + this.y + "+" + number.getY() + ")i");
        return new Complex(this.x + number.getX(), this.y + number.getY());
    }

    public Complex mul(Complex number) {
        System.out.println("(" + this.x + "*" + number.getX() + "-" + this.y + "*" + number.getY() + ")" +
                "-" + "(" + this.x + "*" + number.getY() + "+" + this.y + "*" + number.getX() + ")i" );

        return new Complex(this.x * number.getX() - this.y * number.getY(),
                this.x * number.getY() + this.y + number.getX());
    }

    public Complex div(Complex number) {
        System.out.println("(" + this.x + "*" + number.getX() + "+" + this.y + "*" + number.getY() + ")/" +
                "(" + number.getX() + "^2" + number.getY() + "^2)" +
                "i(" + this.y + "*" + number.getX() + "-" + this.x + "*" + number.getY() + ")/" +
                "(" + number.getX() + "^2" + number.getY() + "^2)");

        return new Complex((this.x * number.getX() + this.y * number.getY())/
                (number.getX()*number.getX() + number.getY()* number.getY()),
                (this.y * number.getX() - this.x * number.getY())/
                        (number.getX()*number.getX() + number.getY()* number.getY()));
    }

    public void info() {
        //алгебраическая форма
        System.out.println("Алгебраическая форма");
        if(y > 0) System.out.println(x + "+" + y + "i");
        else System.out.println(x + y + "i");

        //тригонометрическая форма
        System.out.println("Тригонометрическая форма");
        computeModule();
        computeF();
        System.out.println("r(cosf+sinf)="+module+"*"+ "(" + Math.cos(f) + "+" + Math.sin(f) + "i)");
    }

    @Override
    public boolean equals(Object o) {
        System.out.print("Equals: ");
        if (o == this) return true;
        if (!(o instanceof Complex)) return false;
        Complex c = (Complex) o;
        return c.x == x && c.y == y;
    }

}
