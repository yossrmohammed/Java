class PalindromeExample{
	 public static void main(String args[]){
	 	if(args.length==0){
	System.out.println("you must enter value");
	
	}
	else{
		 	String original=args[0];
	 	String reverse="";
	 	for(int i=original.length()-1 ;i>=0;i--){
	 		reverse=reverse+original.charAt(i);
	 	}
	 	
	 	if(reverse.equals(original)){
   		System.out.println("palindrome number");    
   		}
   		else{    
   		System.out.println("not palindrome");    
   		}
	}

}  
	 		
	 	}
	 	

