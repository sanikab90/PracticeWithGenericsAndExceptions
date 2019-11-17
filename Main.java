
public class Main {
	public static void main(String[] args) {
		//question 1
		try {
			//call convert using a valid input
			System.out.println(convert("1101"));
			//call convert using a nonvalid input
			System.out.println(convert("1121"));
		}
		catch (BinaryFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		//question 2
		Generic <Integer> i = new Generic <Integer>();
		Generic<Double> d = new Generic<Double>();
		Generic<String> s = new Generic <String>();
		
		i.insertionSort();
		i.BinarySearch(9);
		
		d.insertionSort();
		d.BinarySearch(4.5);
		
		s.insertionSort();
		s.BinarySearch("hello");
		
	}
	
	public static int convert(String binary) throws BinaryFormatException{
		//get length of string
		int binaryLength = binary.length();
		
		//make sure inputted string is actually full of 1's and 0's
		for(int i = 0; i < binaryLength; i++) {
			if(binary.charAt(i) != '1' && binary.charAt(i) != '0')
				throw new BinaryFormatException("enter a binary number");
		}
		
		int decimal = 0;
		int base = 1;
		//start at end of string and go backwards until the start
		for(int i = binaryLength-1; i >= 0; i--) {
			if(binary.charAt(i) == '1')
				decimal += base;
			base = base * 2;
		}
		
		return decimal;
	}
}
