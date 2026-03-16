package OOP;

class Mobile 
{
  String brand;
  int price;
  // the variable belongs to the class itself not the object
  // you dont need to create an object to use it
  // that is why main is also static
  static String name;

  public void show()
  {
    System.out.println(brand + " : $" + price + " : " + name);
  } 

  public static void show1()
  {
    System.out.println("in static method");
  }
}

public class Staticvariable 
{
  public static void main(String[] args) 
  {
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 699;
    Mobile.name = "Phone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 999;
    Mobile.name = "Phone";

    obj1.show();
    obj2.show();
    Mobile.show1();
  }  
}
