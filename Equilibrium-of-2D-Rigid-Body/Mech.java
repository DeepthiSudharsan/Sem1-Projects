package Mechpro;


import java.util.Scanner;
import java.util.*;

public class Mech 
{
  static Supportrxns[] pin = new Supportrxns[5];
  static int count = 0;
  public static void register(Supportrxns r)
  {
    pin [count ++] = r;
  }
  public  Mech() 
  {
    for(int i = 0; i < count ; i++)
      { 
        pin[i].compute();
      }
  }
  public double pi=java.lang.Math.PI;

  public double theta(double n)
  {
    double z;

    z=180/pi*java.lang.Math.atan(3*java.lang.Math.sin(pi/180*n)/(3*java.lang.Math.cos(pi/180*n)-2));
    return z;
  }
  public double P(double w,double a,double th)
  {
    double x;
    x=5*java.lang.Math.cos(pi/180*a)*w/(3*java.lang.Math.sin(pi/180*(th-a)));
    return x;
  }

  public double calpha(double w,double P)
  {
    double z,res = 0;
    double th;

    for( double a=0.0;a<=90;a+=0.1)
    {
       th=180/pi*java.lang.Math.atan(3*java.lang.Math.sin(pi/180*a)/(3*java.lang.Math.cos(pi/180*a)-2));
       z=3*java.lang.Math.cos(pi/180*a)*P*java.lang.Math.sin(pi/180*th)-3*java.lang.Math.sin(pi/180*a)*P*java.lang.Math.cos(pi/180*th)-5*java.lang.Math.cos(pi/180*a)*w;
       if (z>-1000 && z<1000)
       {
          res=a;
          break;
       }

    }
    return res;

  }


  public static void main(String[] args) 
  {
    Mech T1=new Mech();
    Mech T2=new Mech();  
    double theta,P;

    //case 1
    Scanner sc=new Scanner(System.in);
    System.out.print("Give value of alpha:");
    double alpha=sc.nextDouble();// geting alpha from user
    theta=T1.theta(alpha);
    System.out.println("Calculated theta:"+theta);//finding theta using alpha given
    System.out.println();
    System.out.print("Give value of weight of block:");
    double w=sc.nextDouble();//getting weight from user
    P=T1.P(w*9.81, alpha, theta);// calculating P
    System.out.println("P:"+P);
    System.out.println();
    double alpha2=T1.calpha(w*9.81,P);
    System.out.println("Calculated alpha:"+alpha2);
    //check if the obtained alpha is equal to alpha given
    System.out.println();
    Ax a1 = new Ax(P, theta); //finding Ax
    Ay a2 = new Ay(P, w*9.81, theta);// finding Ay
    Mech.register (a1);
    Mech.register (a2);
    Mech T3=new Mech();

    //case 2
    System.out.println();
    System.out.print("give value of P:");
    double P1=sc.nextDouble();//getting P from user
    System.out.print("give value of weight of block:");
    double w1=sc.nextDouble();//getting weight from user
    double alpha1=T2.calpha(w1*9.81, P1);
    System.out.println("alpha1="+alpha1);
    Ax a3 = new Ax(P1, theta); //finding Ax
    Ay a4 = new Ay(P, w*9.81, theta);// finding Ay
    Mech.register (a3);
    Mech.register (a4);
    Mech T4=new Mech();
  }
}
interface Supportrxns
{
  public double compute();
}

class Ax implements Supportrxns
{
   double pi=java.lang.Math.PI;
   double p;
   double th;
   double Ax;
   public Ax(double n,double t) 
   {
    p=n;
    th=t;
   }
  @Override
  public double compute() 
  {
    Ax=-p*java.lang.Math.cos(pi/180*th);
    System.out.println("Ax= "+ Ax);
    return Ax;
  }
}

class Ay implements Supportrxns
{
  double pi=java.lang.Math.PI;
  double p;
  double th;
  double Ay;
  double w;

  public Ay(double n,double m,double t) 
  {
    p=n;
    th=t;
    w=m;
  }
  @Override
  public double compute() 
  {
    Ay=w-p*java.lang.Math.sin(pi/180*th);
    System.out.println("Ay= "+Ay);
    return Ay;
  }
}
