package charDataType;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (this.ch == 'a' || this.ch == 'e' || this.ch == 'i' || this.ch == 'o' || this.ch == 'u' || this.ch == 'A'
				|| this.ch == 'E' || this.ch == 'I' || this.ch == 'O' || this.ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isNumber() {
		if (this.ch == '0' || this.ch == '1' || this.ch == '2' || this.ch == '3' || this.ch == '4' || this.ch == '5'
				|| this.ch == '6' || this.ch == '7' || this.ch == '8' || this.ch == '9') {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if ((this.ch >= 65 && this.ch <= 90) || (this.ch >= 97 && this.ch <= 122)) {
			return true;
		}
		return false;
	}

	public boolean isConsonent() {
		return (!isVowel() && isAlphabet());
	}

	public static void printLowerCaseAlphabets() {
		for (int i = 97; i <= 122; i++) {
			System.out.printf("%c\t", i).println();
		}
	}

	public static void printUpperCaseAlphabets() {
		for (int i = 65; i <= 90; i++) {
			System.out.printf("%c ", i).println();
		}
	}
}
