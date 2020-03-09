package sausamyadesignpattern;

public class ClassBFactory extends BaseFactory
{
   public ClassB create()
   {
	   ClassB b=new ClassB();
	   b.Bmethod();
	   return b;
   }
}
