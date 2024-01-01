class WordSearching{
public static void main(String [] args){
String sentence="Hello planet earth, you are a great planet";
String s[] = sentence.split(" ");
String word="planet";
int count=0;
for(int i=0;i<s.length;i++){
if(word.equals(s[i])){
count++;
}
}
System.out.println(count);
}
}
