package charDataType;

public class MYCharRunner {
	public static void main(String[] args) {
		MyChar myChar = new MyChar('h');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonent());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
}
}
