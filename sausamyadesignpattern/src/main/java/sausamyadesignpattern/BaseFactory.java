package sausamyadesignpattern;

public abstract class BaseFactory
{
public Base get()
{
	Base c=this.create();
	return c;
	
}
protected abstract Base create();
}
 