import java.util.Random;
class Searching{
public static void main(String [] args){
Random rand= new Random();
int [] arr =new int[1000];
for(int i=0;i<1000;i++){
arr[i]=rand.nextInt(10000);
}
int min=arr[0];
int max=arr[0];
double timeBefore= System.nanoTime();
for(int i=1;i<1000;i++){
if(arr[i]>max){
max=arr[i];
}
if(arr[i]<min){
min=arr[i];
}
}

double timeAfter= System.nanoTime();
double totalTime=timeAfter-timeBefore;
System.out.println("maximun value = "+max+" minmum value = "+ min );
System.out.println("Time for searching is " + totalTime);

}
}
