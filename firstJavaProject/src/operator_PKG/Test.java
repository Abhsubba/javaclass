package operator_PKG;

public class Test {

	public static void main(String[] args) {
		
     int creditscore = 1000;
     
     if(creditscore <= 10) {
    	 
    	 System.out.println("Your credit is wrost..");
     }
     
     else if (creditscore > 10 && creditscore < 30) {
    	 
    	 System.out.println("Your credit score is average..");
     }
     else if(creditscore >31 && creditscore <=80){
    	 System.out.println("your scre is good..");
     }
     else if(creditscore >81 && creditscore <=100){
    	 System.out.println("Best...");
     }
     else {
    	 System.out.println("None...");
     }
}
}