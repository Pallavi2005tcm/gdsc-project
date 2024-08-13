import java.util.Scanner;
class calculator {
public static void main(String[] args){
int a,b ;
int ch,result;
System.out.print("Enter the value of two number:");
Scanner r= new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
System.out.print("Enter the value of operation:");
ch=r.nextInt();
if(ch==1){
result=a+b;
System.out.print("ADDITION"+ " " +  result);
}
else if(ch==2){
result=a+b;
System.out.print("SUBTRACTION"+ " " +  result);
}
else if(ch==3){
    result=a+b;
System.out.print("MULTIPLICATION"+ " " +  result);
}
else if(ch==4){
    result=a+b;
System.out.print( "DIVI" + " " + result);
}
else if(ch==5){
    result=a+b;
System.out.print("MODULUS" + " "  + result);
}
}
}