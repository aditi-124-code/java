package Assignment_2;

class Distance {
    protected double miles;

    public Distance(double miles) {
        this.miles = miles;
    }
    public void travelTime() {
        double speed = 60.0; 
        double time = miles / speed;
        System.out.printf("Time taken to cover %.2f miles at %.2f mph: %.2f hours%n", miles, speed, time);
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double kilometers) {
        super(kilometers / 1.60934);
    }
    @Override
    public void travelTime() {
        double kilometers = miles * 1.60934; 
        double speed = 100.0; 
        double time = kilometers / speed;
        System.out.printf("Time taken to cover %.2f kilometers