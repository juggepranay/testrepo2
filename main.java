import java .io.*;
import java .util.*;

class shape
{
void getinput();
void Area();
void volume();
float pi=3.146;
Scanner scan=new Scanner(System.in);
}


class twodimensionalshape extends shape
{
void display();
}



class circle extends twodimensionalshape
{
void getinput()
{
int r=scan.nextInt();
}
void area()
{
float areaofcircle=pi*r*r;
}
void display()
{
System.out.println("area of circle is:" + areofcircle);
}
}


class square extends twodimensionalshape 
{
void getinput()
{
int s=scan.nextInt();
}
void area()
{
int areaofsquare=s*s;
}
void display()
{
System.out.println("area of square is:" + areofsquare);
}
}


class threedimensionalshape extends shape
{
void display();
}


class sphere extends threedimensionalshape
{
void getinput()
{
int r=scan.nextInt;
}
void area()
{
int areaofsphere=4*pi*r*r;
}
void volume()
{
int volumeofsphere=(4/3)*pi*r*r*r;
}
void display()
{
System.out.println("volume of sphere is:" + volumeofsphere);
System.out.println("area of sphere is:" + areaofsphere);
}
}

class cube extends threedimensionalshape
{
void getinput()
{
int s=scan.nextInt;
}
void area()
{
int areaofcube=6*s*s;
}
void volume()
{
int volumeofcube=s*s*s;
}
void display()
{
System.out.println("volume of cube is:" + volumeofcube);
System.out.println("area of cube is:" + areaofcube);
}
}
   


class main
{
public static void main(string[] args){
circle c=new circle();
square s=new square();
sphere sp=new sphere();
cube cu=new cube();

c.getinput();
c.area();
c.display();
}
}



