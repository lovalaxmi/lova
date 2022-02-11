package polomrprisham;

public class Overridingtest {
public class UseLaptop {
  public static void main(String args[]) {

    
    
  public class UseLaptop {
  public static void main(String args[]) {
    Laptop laptop =new Laptop ();
    String a=args[0];
    String b=args[1];
    String c=args[2];
    String d=a.toUpperCase();
    String e=b.toUpperCase();
    int f=Integer.parseInt(c);
    laptop.price=f;
    int g=laptop.price+((laptop.price*10)/100);
    System.out.println("Brand="+d+",Model="+e+",Price="+g);
    
  }
}
class Laptop {
  String brand;
  String model;
  int price;
}