import java.util.Scanner;

public class getMethods
{
	Scanner sc = new Scanner(System.in);
	void Presentation()
	{
		System.out.println("||Password Generator||\n*Welcome to password generator, according to your preferences, it will produce random password!\nLet's Start");
	}
	int Length()
	{
		System.out.print("Length(1-50): ");
		int length = sc.nextInt();
		while(length < 1 || length > 50)
		{
			System.err.print("Please enter an appropriate length(1-50): ");
			length = sc.nextInt();
		}
		return length;
	}
	char LetterCase()
	{
		System.out.print("\nABC(u), abc(l), AbC(b)\nPlease enter case preference(enter a character): ");
		char answ = sc.next().charAt(0);
		while(Character.toLowerCase(answ) != 'u' && Character.toLowerCase(answ) != 'l' && Character.toLowerCase(answ) != 'b')
		{
			System.out.print("Please enter an appropriate choice: ");
			answ = sc.next().charAt(0);
		}
		return Character.toLowerCase(answ);
	}
	int SpecialAndNumCase()
	{
		System.out.print("\n#$&\nPlease enter special character preference(y, n): ");
		char answ = sc.next().charAt(0);
		while(Character.toLowerCase(answ) != 'y' && Character.toLowerCase(answ) != 'n')
		{
			System.out.print("Plese enter an appropriate answer(y, n): ");
			answ = sc.next().charAt(0);
		}
		System.out.print("\n123\nPlease enter numerical character preference(y, n): ");
		char answNum = sc.next().charAt(0);
		while(Character.toLowerCase(answNum) != 'y' && Character.toLowerCase(answNum) != 'n')
		{
			System.out.print("Plese enter an appropriate answer(y, n): ");
			answNum = sc.next().charAt(0);
		}
		if(answNum == 'y' && answ == 'y')
			return 0;
		else if(answNum == 'y' && answ == 'n')
			return 1;
		else if(answNum == 'n' && answ == 'y')
			return 2;
		else 
			return 3;
	}
	void print(int length, char letterCase, int specialChar)
	{
		System.out.print("\nPassword generated! \n\n");
		System.out.print(Randomizer.BaseRandomizer(length, letterCase, specialChar));
        System.out.println();
	}
}
