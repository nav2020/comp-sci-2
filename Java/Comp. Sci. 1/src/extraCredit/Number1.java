package extraCredit;
public class Number1 {
	/**
	 * Comp sci 2 group(max, Abdul, Drew, Drew)
	 */
	public static void main(String[] args) {
		int best = 0,bestnum = 0;
		for(int num = 1;num < 1001;num ++){
			int count =0 ;
			for(int i = 1;i <= num;i++){
				if(num % i == 0){
					count++;
				}
				if(count > best){
					best = count;
					bestnum = num;
				}
			}
		}
		System.out.println(bestnum);
	}
}