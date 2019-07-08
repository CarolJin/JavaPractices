package freePractice;

import java.io.File;
import java.io.IOException;

public class Bground extends Thread{
		public static void main(String args[]){
		                Bground b = new Bground();
		                b.start();
		                b.run(); // Do nothing		                

		        }
		        public void start(){
		                for (int i = 0; i <10; i++){
		                        System.out.println("Value of i = " + i);
		                }
		        }
		}
