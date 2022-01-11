class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	String [] arr = new String[10];
	  arr[0] = "Sure it's a calming notion, perpetual in motion";
	    arr[1] = "But I don't need the comfort of any lies";
	    arr[2] = "For I have seen the ending and there is no ascending";
	    arr[3] = "Rise";
	    arr[4] = "Oh, back when I was younger, was told by other youngsters";
	    arr[5] = "That my end will be torture beneath the earth";
	    arr[6] = "'Cause I don't see what they see, when death is staring at me";
	    arr[7] = "I see a window, a limit, to live it, or not at all";
	    arr[8] = "If you could pull the lever to carry on forever";
	    arr[9] = "Would your life even matter anymore?";
	for(String a : arr) {
		for(char b : a.toCharArray()){
			System.out.println(b);
		}
	}
	
	
		
		
	}
}
