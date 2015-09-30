package popup.model;


/**
 * Contains code for thing class
 * @author jelm9149
 *
 */
public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	public Thing()
	{
		age= -99;
		weight= -.0000005;
		name = "";
	}
	
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void seetAge(int age)
	{
		this.age = age;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	
}
