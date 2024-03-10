public class Circle extends Shape
{


        double Radius;


        double getRadius(){ //gets the radius


            return Radius;
        }

        void setRadius(double radius) { //sets the radius of the object

            Radius = radius;
        }

        double getArea() { //calculates the area of the object
            return Math.pow(getRadius(),2)*3.1415;

        }

}