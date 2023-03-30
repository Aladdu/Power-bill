import java.util.Scanner;
public class Units {
 public double unit(float u)
 {
 if(u>=0&&u<=74)
 return u*2.6;
 else if(u>=75&&u<=224) 
 return u*6.9;
 else if(u>=225&&u<=500)
 return u*8.5;  
  else
 return u*9.95;
  }
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter unit:");
		float units=sc.nextFloat();
		System.out.println("enter month:");
		String month=sc.next();
		Units Obj=new Units();
		System.out.println("E bill for the month of: "+month);
		System.out.println("units consumed: "+units);
		System.out.println("E bill amount :Rs ="+Obj.unit(units)+"/-");
		System.out.println("Bill due date:10 "+month+" 2023");
		sc.close();

}
}
