public class Workshop01 {

    public static void main(String[] args) {
        int a, b , c =0;
        a = c++;
        b = ++a;
        c++;
        b = ++c + a++;
        a= --b + c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        Space3D space3d = new Space3D();
        Point3D startPoint =new Point3D(2, 1, 3);
        Point3D endPoint = new Point3D(0, 0, 6);
        double distance = space3d.total(startPoint, endPoint);
                System.out.println(distance);
    }

}

class Space3D{
    private static final int EXPONENT_TWO = 2;
    double total(Point3D startPoint, Point3D endPoint) {
        double x = Math.pow((startPoint.x-endPoint.x), EXPONENT_TWO);
        double y = Math.pow((startPoint.y-endPoint.y), EXPONENT_TWO);
        double z = Math.pow((startPoint.z-endPoint.z), EXPONENT_TWO);
        double xyz = x+y+z;
        double dis = Math.sqrt(xyz);
        return dis;
    }
    
}

class Point3D{
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int x;
    int y;
    int z;
}
