package sausamyadesignpattern;

public class ClassAFactory extends BaseFactory
{
   public ClassA create()
   {
	   ClassA a=new ClassA();
	   a.Amethod();
	   return a;
   }
}
