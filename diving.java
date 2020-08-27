

import java.io.*;
import java.util.*;
class arrays
{
static double []arr=new double[7];
public static void calculate(double [] arr)
{
    double temp;
    double sum=0.0;
for(int i=0;i<7;i++)
  {
   for(int j=i+1;j<7;j++)
   {
   if(arr[i]>arr[j])
    {
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    }
   }
  }
}
}

class diving
 {
 public static void main(String args[]) 
 {
    int i=0;
    
    double sum=0.0;
    double []arr=new double[7];
 Scanner scan=new Scanner(System.in);
for(int k=0;k<5;k++)
{
System.out.println("enter contest number "+(k+1));
arrays a=new arrays();
 for(i=0;i<7;i++)
 {
  System.out.println("enter the score by judge"+(i+1));
  arr[i]=scan.nextDouble();
 }
 a.calculate(arr);

for( i=1;i<6;i++)
{
 sum=sum+arr[i];
}
System.out.println("sum:"+sum);
 }
 }
 }