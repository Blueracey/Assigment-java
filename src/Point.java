
import java.lang.Math;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

class Point3D extends Point {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        this.z += dz;
    }

    public void setLocation(double x, double y, double z) {
        super.setLocation(x, y);
        this.z = z;
    }

    public double distanceFromOrigin() {
        double d2D = super.distanceFromOrigin();
        return Math.sqrt(d2D * d2D + this.z * this.z);
    }

    public double distance(Point3D p2) {
        double d2D = super.distance(p2);
        double dz = this.z - p2.getZ();
        return Math.sqrt(d2D * d2D + dz * dz);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getPoint() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}



