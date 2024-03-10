import java.util.Scanner;

public class Square extends Shape {

    double Width;


    double getWidth(){ //checks the height of the object


        return Width;
    }

    void setWidth(double width) { // get the Width of the object

        Width = width;
    }

    double getArea() {//calculates the area of the object
       return getWidth()*getWidth();

    }






}
