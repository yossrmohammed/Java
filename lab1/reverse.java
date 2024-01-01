class reverseString{
	public static void main(String args[]){
	if(args.length==0){
	System.out.println("you must enter value");
	return;
	}

			String original=args[0];
	 	String reverse="";
	 	for(int i=original.length()-1 ;i>=0;i--){
	 		reverse=reverse+original.charAt(i);
	 	}
	 	System.out.println(reverse);
	
	

	}

}
