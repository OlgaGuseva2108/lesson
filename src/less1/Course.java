package less1;

public class Course {
    private double length;
    private double height;
    private double poolLength;

    Course(double length, double height, double poolLength){
        this.length=length;
        this.height = height;
        this.poolLength =poolLength;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPoolLength() {
        return poolLength;
    }

    public void setPoolLength(double poolLength) {
        this.poolLength = poolLength;
    }
}
