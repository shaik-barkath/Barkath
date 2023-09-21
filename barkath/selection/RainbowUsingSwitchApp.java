package com.kn.selection;

public class RainbowUsingSwitchApp {
	
	public void findRainbowColor(char rainbow1) {
		switch(rainbow1) {
		case 'V' :
		case 'v' :
		{
			System.out.println("Violet in Rainbow");
			break;
		}
		case 'I' :
		case 'i' :
		{
			System.out.println("Indigo in Rainbow");
			break;
		}
		case 'B' :
		case 'b' :
		{
			System.out.println("Blue in Rainbow");
			break;
		}
		case 'G' :
		case 'g' :
		{
			System.out.println("Green in Rainbow");
			break;
		}
		case 'Y' :
		case 'y' :
		{
			System.out.println("Yellow in Rainbow");
			break;
		}
		case 'O' :
		case 'o' :
		{
			System.out.println("Orange in Rainbow");
			break;
		}
		case 'R' :
		case 'r' :
		{
			System.out.println("Red in Rainbow");
			break;
		}
		default :
		{
			System.out.println("Invalid Input");
		}
    		
	}

}
}

