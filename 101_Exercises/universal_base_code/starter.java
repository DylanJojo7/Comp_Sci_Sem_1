import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Ascii human = new Ascii();
	human.printArt();
	
	Ascii human1 = new Ascii("dog");
	human1.printArt();
	
	Ascii human2 = new Ascii("cactus","darkfire");
	human2.printArt();
	
	Ascii human3 = new Ascii("other",3);
	human3.setAscii("");
	human3.printArt();
	
	Ascii mine = new Ascii("line","line");
	mine.printArt();
		
	
}
}