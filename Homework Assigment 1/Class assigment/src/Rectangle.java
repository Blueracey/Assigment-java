public class Rectangle extends Square{

    double Width ;
    double Height;


    public double getHeight() { //checks the height of the object
        return Height;
    }

    void setHeight(double height ) //sets the height of the object to the given value
    {
        Height = height;
    }




    double getArea() {  //gets the area of the rectangle
        System.out.println(getHeight());
        System.out.println((getWidth()));
        return getHeight()*getWidth();
    }
}
