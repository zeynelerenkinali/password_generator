import java.util.Random;

public class Randomizer 
{
	static Random rnd = new Random();
	public static String BaseRandomizer(int length, char letterCase, int specialAndNumCase)
	{
		char[] chArr = new char[length];
		while(length != 0)
		{
			int rndSit = rnd.nextInt(3);
			if(rndSit == 1 && (specialAndNumCase == 0 || specialAndNumCase == 1))
				chArr[length - 1] = NumRandomizer();
			else if(rndSit == 2 && (specialAndNumCase == 0 || specialAndNumCase == 2))
				chArr[length - 1] = SpecialRandomizer();
			else
				chArr[length - 1] = LetterRandomizer(letterCase);
			length--;
		}
		String password = new String(chArr);
		return password;
	}
	
	public static char NumRandomizer() // will random numbers according to integer that sent to it 
	{	
		char[] chArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		return chArr[rnd.nextInt(chArr.length - 1)];
	}
	public static char LetterRandomizer(char letterCase)
	{
		char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'ı', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char currentLet = letter[rnd.nextInt(letter.length - 1)];
		if(letterCase == 'u')
			currentLet = Character.toUpperCase(currentLet);
		else if(letterCase == 'l')
			currentLet = Character.toLowerCase(currentLet);
		else
		{
			int a = rnd.nextInt(2);
			if(a == 0)
				currentLet = Character.toUpperCase(currentLet);
			else
				currentLet = Character.toLowerCase(currentLet);
		}
		return currentLet;
	}
	public static char SpecialRandomizer()
	{
		char[] special = {'~', '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '–', '+', '=', '{', '[', '}', ']', '|', ':', ';', '‘', '<', ',', '>', '.', '?', '/'};
		return special[rnd.nextInt(special.length - 1)];
	}
}
