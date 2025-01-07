public class Calculator{

  public static int add(int a, int b)
  {
    return a+b;
  }

  public static int div(int a, int b)
{
  return a/b;
}
  
  public static int sub(int a, int b)
  {
    return a-b;
  }
  public static int mul(int a, int b)
  {
    return a*b;
  }
  
  
  
  public static void main(String [] args)
  {
            System.out.println("welcome to calculator !");
            System.out.println("added two number 5 and 7" + " : "+add(5,7));
            System.out.println("subtract 5 from 7" + " : "+sub(7,5));
             System.out.println("multiplied two number 5 and 7" + " : "+mul(5,7));
             System.out.println("divided two number 5 and 7" + " : "+div(5,7));
  
  
  
  
  
     
  }
  }