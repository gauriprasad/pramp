
public class RootOfNumber {
	
	static double root(double x, int n) {
		if(x < 0) {
			System.out.println("x must be non-negative");
			return 0;
		}
		if(n <= 0) {
			System.out.println("n must be positive");
			return 0;
		}
		
		double minIndex = 0.0;
		double maxIndex = Math.max(1, x);
		
		double mid = (minIndex + maxIndex) / 2;

		while((maxIndex - minIndex) >= 0.001) {
			if(Math.pow(mid, n) > x) {
				maxIndex = mid;
			} else if(Math.pow(mid, n) < x){
				minIndex = mid;
			} else {
				break;
			}
			mid = (minIndex + maxIndex) / 2;
		}		
		return mid;
	}

	public static void main(String[] args) {
		System.out.println(root(7,3));
		System.out.println(root(9,2));
	}

}
