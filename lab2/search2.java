class WordSearching2{
public static void main(String [] args){
String sentence="Hello planet earth, you are a great planet.";
String s[] = sentence.split(" ");
String word="planet";
int count=0;
for(int i=0;i<s.length;i++){

if(s[i].indexOf(word)!=-1){
count++;
}
}
System.out.println(count);
}
}
