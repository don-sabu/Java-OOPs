import java.util.Scanner;

class Area{

double area;

void calculateArea(int r)

{

area=(float)3.14*r*r;

System.out.println("Area of circle="+area);

}

void calculateArea(int l,int b)

{

area=l*b;

System.out.println("Area of rectangle="+area);

}

void calculateArea(float b,float h )

{

area=(float).5*b*h;

System.out.println("Area of triangle="+area);

}

}

public class Area_of_Shapes {

public static void main(String[] args) {

int r,l,b,bs,h;

Area a=new Area();

Scanner s=new Scanner(System.in);

System.out.println("Enter the radius of circle");

r=s.nextInt();

a.calculateArea(r);

System.out.println("Enter lengh");

l=s.nextInt();

System.out.println("Enter bredth");

b=s.nextInt();

a.calculateArea(l,b);

System.out.println("Enter base");

bs=s.nextInt();

System.out.println("Enter height");

h=s.nextInt();

a.calculateArea((float)bs,(float) h);

}

}
