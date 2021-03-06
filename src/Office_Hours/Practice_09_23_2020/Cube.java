package Office_Hours.Practice_09_23_2020;

public class Cube extends Shape implements Volume   {

    public double side;

    public Cube(double side) {
        if(side<=0){
            throw new RuntimeException("Side of the Cube cannot be negative or zero");
        }
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2)*6;
    }

    @Override
    public double calculatePerimeter() {
        return side*4*6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side,3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
