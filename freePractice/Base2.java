package freePractice;

public class Base2 extends Base {
    public static void main(String args[]){
    Base2 a = new Base2();
    a.amethod();
    }

    public void myfunc() {
            System.out.println("My func");
            } 

    public void amethod() {
    myfunc();
    }
}