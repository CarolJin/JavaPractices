package freePractice;

public class Test2 {
		  static Integer a = new Integer(10);
		  static Integer b;
		  static Integer c = new Integer(10);
		  public static void main (String[] args){
		     if (a==c){
		       System.out.println("Fel");
		     }
		     if (a.equals(c)){
		       System.out.println("rätt");
		     }
		  }
}
