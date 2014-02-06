package acsl.factorTree;

public class test {
	public static void main(String args[]){
		for(int j = 1; j <= 101; j+=5){
			for(int k = 1; k <=101; k+=10){
				if(j == k){
					System.out.println("gotchya!");
				}
			}
		}
	}
}
