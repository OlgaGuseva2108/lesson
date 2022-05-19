package less1;

public class Team {
    private String name;
    private int age;
    private double runningSpeed;
    private double jumpingSpeed;
    private double swimmingSpeed;

    Team (String name, int age, double runningSpeed, double jumpingSpeed, double swimmingSpeed){
        this.name=name;
        this.age=age;
        this.runningSpeed = runningSpeed;
        this. jumpingSpeed = jumpingSpeed;
        this.swimmingSpeed = swimmingSpeed;

    }

    public double run (Course lenght) {
     double timeToRunning = lenght.getLength() / runningSpeed;
     System.out.println(timeToRunning);
     return timeToRunning;
    }


    public double jump (Course height) {
        double timeToJumping = height.getHeight() / jumpingSpeed;
        System.out.println(timeToJumping);
        return timeToJumping;
    }

    public double swim (Course poolLenght) {
        double timeToSwimming = poolLenght.getPoolLength() / swimmingSpeed;
        System.out.println(timeToSwimming);
        return timeToSwimming;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public double getJumpingSpeed() {
        return jumpingSpeed;
    }

    public void setJumpingSpeed(double jumpingSpeed) {
        this.jumpingSpeed = jumpingSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
