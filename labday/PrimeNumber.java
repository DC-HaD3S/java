public class PrimeNumber{
public static void main(String args[]){
int counter=0;
int number=9;
for(int i=2; i<=5;i++)
{
if(number%i==0)
{
counter=1;
break;
}
if(counter==1)
System.out.println("Its not a prime number ");
else
System.out.println("Its a prime number");
}
}
}