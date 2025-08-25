import java.util.*;
public class Main{
	public static void main(String[] args){
	   Scanner uv=new Scanner(System.in);
	   System.out.print("welcome to CMR restaurant");
	   System.out.print("HI,Plz enter ur name:");
	   String name=uv.nextLine();
	   System.out.println("hey" +name+" what do u like to have");
	   System.out.println("1.dal fry - 40"+"\n2.paneer butter masala - 100"+"\n3.chicken curry - 120"+"\n4.fish fry - 100"+"tomato curry - 30");
	   System.out.println("select from the menu:");
	   int m=uv.nextInt();
	   switch(m)
	   {
	       case 1:System.out.println("Plz enter the quantity:");
	              int a=uv.nextInt();
	              System.out.print("you choose "+m+"menu pay "+(40*a)+"rs");
	              int b=uv.nextInt();
	              if((40*a)==b)
	              {
	                  System.out.print("order placed..");
	              }
	              else
	              System.out.print("reorder");
	              break;
	       case 2:System.out.println("Plz enter the quantity:");
	              int c=uv.nextInt();
	              System.out.print("you choose "+m+"menu pay "+(100*c)+"rs");
	              int d=uv.nextInt();
	              if((100*c)==d)
	              {
	                  System.out.print("order placed..");
	              }
	              else
	              System.out.print("reorder");
	              break;
	       case 3:System.out.println("Plz enter the quantity:");
	              int e=uv.nextInt();
	              System.out.print("you choose "+m+"menu pay "+(120*e)+"rs");
	              int f=uv.nextInt();
	              if((120*e)==f)
	              {
	                  System.out.print("order placed..");
	              }
	              else
	              System.out.print("reorder");
	              break;    
	       case 4:System.out.println("Plz enter the quantity:");
	              int g=uv.nextInt();
	              System.out.print("you choose "+m+"menu pay "+(100*g)+"rs");
	              int h=uv.nextInt();
	              if((100*g)==h)
	              {
	                  System.out.print("order placed..");
	              }
	              else
	              System.out.print("reorder");
	              break; 
	       case 5:System.out.println("Plz enter the quantity:");
	              int i=uv.nextInt();
	              System.out.print("you choose "+m+"menu pay "+(30*i)+"rs");
	              int j=uv.nextInt();
	              if((30*i)==j)
	              {
	                  System.out.print("order placed..");
	              }
	              else
	              System.out.print("reorder");
	              break; 
	   }
	}
}
