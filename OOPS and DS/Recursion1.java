package labAssignment;

public class Recursion1 {

	public static void main(String[] args) {
		System.out.println(pow(3,5));
		
	}
		static int pow(int a, int b) {
			if(b==0) {
				return 1;
			}
			return a*pow(a,b-1);
		}

	}


