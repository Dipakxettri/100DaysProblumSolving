class Circle{
    public double pi = 3.14;
    public int r = 7;

    public double calcArea(){
        double area = pi * r * r;
        return area;
    }

    public double calcParamitor(){
        double paramitor = 2 * pi * r;
        return paramitor;
    }
}



public class areaAndparamitor {
    public static void main(String[] args) {
        
        Circle c = new Circle();
        System.out.println(c.calcArea());
        System.out.println(c.calcParamitor());

    }
}
