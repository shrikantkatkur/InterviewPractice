package patternprograms;

public class TSInterview {
	public static void main(String[] args) {
		int num=5;
		for(int i=0;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				
			}
			num--;
			System.out.println("");
		}
	}

}
