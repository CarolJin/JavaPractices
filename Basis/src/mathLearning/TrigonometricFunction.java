package mathLearning;

public class TrigonometricFunction {

	public static void main(String[] args) {
		
		System.out.println("90度的正玄值是：" + Math.sin(Math.PI/2));
		System.out.println("0度的余玄值是：" + Math.cos(0));
		System.out.println("60度的正切值是：" + Math.tan(Math.PI/3));
		System.out.println("2的平方根与2的商的反玄值是：" + Math.asin(Math.sqrt(2)/2));
		System.out.println("2的平方根与2的商的反余玄值是：" + Math.acos(Math.sqrt(2)/2));
		System.out.println("1的反正切值是：" + Math.atan(1));
		System.out.println("e是：" + Math.E);
		System.out.println("e的2次方是：" + Math.exp(2));
		System.out.println("以e为底的2的对数是：" + Math.log(2));
		System.out.println("8的立方根是：" + Math.cbrt(8));
		System.out.println("2的2次方是：" + Math.pow(2,2));
		System.out.println("大于等于1.5的最小整数是：" + Math.ceil(1.5));
		System.out.println("小于等于1.5的最大整数是：" + Math.floor(1.5));
		System.out.println("最接近1.5的偶数是：" + Math.rint(1.6));
		System.out.println("参数加0.5后返回最接近的整数是：" + Math.round(1.3));
		System.out.println("绝对值是：" + Math.abs(-1.5));
		System.out.println("取小是：" + Math.min(1,3));
		System.out.println("获取随机数1是：" + Math.random() +"  随机数2是:"+ Math.random()*10);
		System.out.println("获取随机数的偶数值" + getRandomValue(2,32));
		System.out.println("获取随机字符是：" + (char)('a'+Math.random()*('Z'-'a')));
		  
		        double a = 30; 	          
		        // converting values to radians 
		        double b = Math.toRadians(a); 		  
		        System.out.println(Math.sin(b)); 
		  
		        a = 45; 		          
		        // converting values to radians 
		        b = Math.toRadians(a); 		  
		        System.out.println(Math.sin(b)); 
		  
		        a = 60; 		          
		        // converting values to radians 
		        b = Math.toRadians(a); 	  
		        System.out.println(Math.sin(b)); 
		  
		        a = 90; 		          
		        // converting values to radians 
		        b = Math.toRadians(a); 		  
		        System.out.println(Math.sin(b)); 
		        
		//when argument is NaN or infinity
		         double positiveInfinity =  
		                Double.POSITIVE_INFINITY; 
		         double negativeInfinity =  
		                Double.NEGATIVE_INFINITY; 
		         double nan = Double.NaN; 
		         double result; 
		   
		         // Here argument is negative infinity, 
		         // output will be NaN 
		         result = Math.sin(negativeInfinity); 
		         System.out.println("The sin of negativeInfinity is " + result); 
		   
		         // Here argument is positive infinity, 
		         // output will also be NaN 
		         result = Math.sin(positiveInfinity); 
		         System.out.println("The sin of positiveInfinity is " + result); 
		   
		         // Here argument is NaN, output will be NaN 
		         result = Math.sin(nan); 
		         System.out.println("The sin of NaN is " + result); 
	}
	
	public static int getRandomValue(int num1, int num2){
		int s = (int)(num1 + Math.random()*(num2-num1));
		if(s%2==0) return s;
			return s+1;		
	}

}
