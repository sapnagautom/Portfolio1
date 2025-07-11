public class PNZCountArray {
public static void main(String arg[]){

int number[] = {0 ,-20 ,94, 0,-67,87,-87,69};

int  positiveCount = 0 , negativeCount = 0 , zeroCount =0;

for(int num :number){
if(num>0){
positiveCount++;
}
else if(num< negativeCount){
negativeCount++;
}
else {
zeroCount++;
}
}
System.out.println("positive number : " + positiveCount);
System.out.println("negative number : " + negativeCount);
System.out.println("zero number : " + zeroCount);
}
}