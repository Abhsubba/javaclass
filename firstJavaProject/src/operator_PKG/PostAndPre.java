package operator_PKG;

public class PostAndPre {

	public static void main(String[] args) {

		
	int m ;
	int n;
	
	 m = 10;
	 n = 10;
	 
//	 n = m+n; // 1
//	 n += m;  // 2
	 
	 ++n; // preIncrement, first increment values and assign the values
	 n++;
	 ++m;  // post increment, assign values and increment the values
	 //++m;

	
	System.out.println(m);	 

	}

}
