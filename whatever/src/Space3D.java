
public class Space3D {
    private static final int EXPONENT_TWO= 2;
    Double คำนวนระยะทางระหว่างจุด(Point3D startPoint,Point3D endPoint) {
        Double x =Math.pow(startPoint.x-endPoint.x, EXPONENT_TWO);
        Double y =Math.pow(startPoint.y-endPoint.x, EXPONENT_TWO);
        Double z =Math.pow(startPoint.z-endPoint.x, EXPONENT_TWO);
        Double xyzResult = x+y+z;
        Double distance =Math.sqrt(xyzResult);
        return distance;
    }
}
