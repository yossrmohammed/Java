import java.util.Random;
import java.util.Arrays;
class BinarySearching{
public static void binarySearch(int arr[], int frist ,int last, int key){
while(last>=frist){
int mid = (frist+last)/2;
if(arr[mid]==key){
System.out.println("found");
return;
}
else if(key>arr[mid]){
frist=mid+1;
}
else{
last=mid-1;
}
}
System.out.println("Not found");

}
public static void main(String [] args){
Random rand= new Random();
int [] arr =new int[1000];
for(int i=0;i<1000;i++){
arr[i]=rand.nextInt(1000);
}
Arrays.sort(arr);
int last =arr.length-1;
int frist=0;
int key=Integer.parseInt(args[0]);
double timeBefore= System.nanoTime();
binarySearch(arr,frist,last,key);

double timeAfter= System.nanoTime();
double totalTime=timeAfter-timeBefore;
System.out.println("Time for searching is " + totalTime);
}
}
