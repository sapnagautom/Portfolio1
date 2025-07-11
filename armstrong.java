 public class armstrong {
public static void main(String arg[]){
int num =153 , sum=0 , temp = num ,digit;

while(temp > 0){
digit = temp % 10;
sum += digit * digit * digit;
temp /= 10;
}
System.out.println(num == sum? "armstrongnumber " : "not an armstrong number");
}
}
 