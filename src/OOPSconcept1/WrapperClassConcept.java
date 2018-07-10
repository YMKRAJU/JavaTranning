package OOPSconcept1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String str="100";
		System.out.println(str+77);
		int i=Integer.parseInt(str);
		System.out.println(i+37);
		
		 String j= "37.77";
		 System.out.println(j);
		 double d=Double.parseDouble(j);
		 System.out.println(d+33);
		 
		 String s1="fal";
		 System.out.println(s1);
		 boolean b1=Boolean.parseBoolean(s1);
		 System.out.println(b1);
		 
		 String s="true";
		 System.out.println(s);
		 boolean b=Boolean.valueOf(s);
		 System.out.println(b);

	}

}
