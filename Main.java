public class Main 
{	
	public static void main(String[] args) 
	{
		getMethods get = new getMethods();
		get.Presentation();
		int length = get.Length();
		char letterCase = get.LetterCase(); // if preference is upper will turn u, if lower will turn l, if both will turn b.
		int specialAndNumCase = get.SpecialAndNumCase();
		get.print(length, letterCase, specialAndNumCase); //print the password
	}
}
