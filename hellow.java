public class hellow{
	public static void main(String args[]){
		int n = 4;
		for(int line=1; line<=6; line++){
			for(int star = 1; star <= n-line+1; star++){
				System.out.print("*");
			}
		System.out.println();
	}
}
}