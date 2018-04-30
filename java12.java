import java.util.Scanner;


abstract class Shape
{

	 double dim1,dim2;

        Shape(double a,double b)
	{

	dim1 = a;
	dim2 = b;

	}
	 
	abstract double AREA();

	}

class Rectangle extends Shape
{

        Rectangle(double a ,double b)
	{
	 super(a,b);
	}

	 double AREA()
	{
	return dim1*dim2;
	}

}

class Circle extends Shape
{

        Circle(double a)
	{
	super(a,0);

	}

	double AREA()
	{

	return 3.14*dim1*dim1;

	}
}


class java12
{

 public static void main(String args[])
 {

  Scanner input = new Scanner(System.in);
  
  String shapeName;
  System.out.println("ENTER THE TYPE OF SHAPE ");
  shapeName = input.next();
  
  Shape S;

  switch(shapeName)
  {
  
   case "rectangle" :  System.out.println("ENTER THE LENGTH OF THE RECTANGLE ");
                       double length = input.nextDouble();
                       System.out.println("ENTER THE BREDTH OF THE RECTANGLE ");
                       double bredth = input.nextDouble();
                       Rectangle R = new Rectangle(length,bredth);
                       
                       S = R;
                       System.out.println("AREA OF THE GIVEN RECTANGLE IS = " +S.AREA());

                       break;

  case "circle"    :   System.out.println("ENTER THE RADIUS OF THE CIRCLE ");
                       double radius = input.nextDouble();
                       Circle C = new Circle(radius);

                       S = C;
                       System.out.println("AREA OF THE GIVEN CIRCLE IS  = " + S.AREA());
                       break;
  default          :   System.out.println("WRONG INPUT!!!!!!!");
                       


  }


}

} 
  
