package sausamyadesignpattern;

import  org.junit.Test;

public class FactoryTest 
{
public void Test()
{
	BaseFactory f=new ClassAFactory();
	Base c=f.get();
	c.display();
	
}
}
