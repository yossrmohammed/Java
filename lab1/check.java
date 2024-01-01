class Example2{
	public static void main(String [] args){
	if(args.length==0){
	System.out.println("you must enter value");
	}
	else{
			int value= Integer.parseInt(args[0]);
		if(value>0){
		System.out.println("Postive");
		}
		else{
		System.out.println("Negative");
		}
	}
	

	}
}
