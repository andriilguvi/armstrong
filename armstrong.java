import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
int a=0,i,temp;
int n=153;
temp=n;
while(n>0)
{
i=n%10;
n=n/10;
a=a+(i*i*i);
}
if(temp==a)
{
System.out.print("armstrong");
}
else
{
System.out.print("not a armstrong");
}
}
}
