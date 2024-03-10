public class Point3d {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(5, 7, 3);
        p1.setX(-5);
        // p1.setY(7);
        p1.setZ(1);
        System.out.println("p1.x=" + p1.getX());
        System.out.println("p1.y=" + p1.getY());
        System.out.println("p1.z=" + p1.getZ());
        System.out.println(p1);

        Point3D p2 = new Point3D(6, -1, 2);
        // p2.setX(6);
        // p2.setY(-1);
        // p2.setZ(2);
        System.out.println("p2.x=" + p2.getX());
        System.out.println("p2.y=" + p2.getY());
        System.out.println("p2.z=" + p2.getZ());

        p1.translate(1, 1, 1);
        System.out.println("p1.x=" + p1.getX());
        System.out.println("p1.y=" + p1.getY());
        System.out.println("p1.z=" + p1.getZ());

        p2.setLocation(-1, 6, -2);
        System.out.println("p2.x=" + p2.getX());
        System.out.println("p2.y=" + p2.getY());
        System.out.println("p2.z=" + p2.getZ());

        System.out.println("Distance of point 1 from origin:\n");
        System.out.println(p1.distanceFromOrigin());

        System.out.println("Distance between point 1 and 2 is:\n");
        System.out.println(p1.distance(p2));
    }
}

