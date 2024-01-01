class Example3{
	public static void main(String [] args){
		 	if(args.length==1 || args.length==0){
	System.out.println("you must enter 2 values");
	return;
	
	}
			boolean valid=false;
		for(int i=0;i<args[0].length();i++){
			if(Character.isDigit(args[0].charAt(i))){
				valid=true;
				}
			else{
				valid=false;
				}
		}
		if(valid){
		
			int value= Integer.parseInt(args[0]);
			if(value<=0){
				System.out.println("you mast enter postive value");
				return;
			}
			for(int j=0;j<value;j++){
				System.out.println(args[1]);
				}
		}
		else{
			System.out.println("Frist input must be integer");
		}
	

	
	
}
}
