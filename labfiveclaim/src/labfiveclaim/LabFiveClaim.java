package labfiveclaim;

public class LabFiveClaim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("Count occurences of 'a' in char array method: " );
		char[] charArray = {'a', 'b', 'c'};
		System.out.println(countOccurencesOfA(charArray));
		
		System.out.println();
		System.out.println("Remove all white space from char array method: ");
		char[] charArrayTwo = {'a', ' ', 'c'};
		char[] outputTwo = removeWhiteSpace(charArrayTwo);
		for (int i = 0; i < outputTwo.length; i++) {
			System.out.println(outputTwo[i]);
		}
		
		System.out.println();
		System.out.println("Count number of duplicate characters: ");
		char[] charArrayThree = {'a', 'b', 'a', 'b'};
		System.out.println(numberOfDuplicateCharacters(charArrayThree));
		
		System.out.println();
		System.out.println("Display words in reverse order: ");
		String input = "How are you";
		System.out.println(reverseWords(input));
		

	}
	
	public static int countOccurencesOfA(char[] charArray) {
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'a' || charArray[i] == 'A') {
				count++;
			}
		}
		return count;
	}
	
	public static char[] removeWhiteSpace(char[] charArray) {
		int numberOfWhiteSpaceCount = 0;
		// loop and count whitespace
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				numberOfWhiteSpaceCount++;
			}
		}
		int countForOutputArray = 0;
		char[] outputCharArray = new char[charArray.length - numberOfWhiteSpaceCount];
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] != ' ') {
				outputCharArray[countForOutputArray] = charArray[i];
				countForOutputArray++;
			}
			
		}
		return outputCharArray;
		
	}
	
	// method to find number of duplicate elements
	public static int numberOfDuplicateCharacters(char[] charArray) {
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	// reverse words
	public static String reverseWords(String input) {
		String[] inputArray = input.split(" ");
		String output = "";
		// loop through inputArray in reverse?
		for (int i = inputArray.length - 1; i >= 0; i--) {
			output = output + " " + inputArray[i];
		}
		return output;
	}
	

}
