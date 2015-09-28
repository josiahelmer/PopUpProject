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
		String tempAge = myPopUps.getAnswer("Type in your age");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopUps.getAnswer("Type in an integer value");
		}
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -12345678;
		}
	
		myPopUps.displayResponse("you typed in " + age);
		
		double weight;
		String tempWeight = myPopUps.getAnswer("Type in your weight");
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopUps.getAnswer("Give me a valid double value!");
		}
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = -.9999990000001;
		}
		myPopUps.displayResponse("You typed in " + weight); 
		
		myThing = new Thing(name, age, weight);
	}
	
	private boolean isInteger(String input)
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
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopUps.displayResponse ("You did not type in a vaid double");
		}
		return isDouble;
	}}