package popup.controller;

import popup.view.PopUpDisplay;
import popup.model.Thing;

public class PopUpController
{
	private PopUpDisplay myPopUps;
	private Thing myThing;
	
	public PopUpController()
	{
		myPopUps = new PopUpDisplay();
	}
	
	public void start()
	{
		String name = myPopUps.getAnswer("Type in your name");
		
		myPopUps.displayResponse("Your name is " + name);
		
		int age;
		String tempage = myPopUps.getAnswer("Type in your age");
		if(isInteger(tempAge))
		{
			age = Integer.parseInt9(tempAge);
		}
		else
		{
			age= -12345678
		}
	
		int age = myPopUps.getAnswer("Type in your age");
		myPopUps.displayResponse("You typed in " + age);
		
		double weight = myPopups.getAnswer("Type in your weight");
		myPopUps.displayResponse("You typed in" + weight); 
		
		myThing = new Thing(name, age, weight);
	}
	
	private boolean isInterger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopUps.displayResponse("You did not type in a valid integer");
		}
	
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			doube validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopUps
		}
		return isDouble;
	}