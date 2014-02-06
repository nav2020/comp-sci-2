package acsl.baseballStats;
import java.util.*;

public class BaseballStats {
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<Player>();
		
		int c = 1;
		
		for(int i = 0; i < 3; i++){
			String[] input = new String[3];
			System.out.println("Insert player " +(i+1)+ "'s data: ");
			input[i] = reader.nextLine();
			players.add(new Player());
			
			// Splits input and parse them to an array of ints
			List<String> data = Arrays.asList(input[i].split(","));
			int[] stats = new int[9];
			for(int j = 0; j < 9; j++){
				stats[j] = Integer.parseInt(data.get(j));
			}
			
			// Sets array elements to the object's stats
			Player current = players.get(i);
			current.setOuts(stats[0]);
			current.setSingles(stats[1]);
			current.setDoubles(stats[2]);
			current.setTriples(stats[3]);
			current.setHRs(stats[4]);
			current.setKs(stats[5]);
			current.setBBs(stats[6]);
			current.setHBPs(stats[7]);
			current.setSacs(stats[8]);
			
			if (c == 1) current.setName("A");
			else if (c == 2) current.setName("B");
			else if (c == 3) current.setName("C");
			c++;
		}
		
		// finds highest BA
		double highestBA = 0.0;
		ArrayList<Player> highestBAs = new ArrayList<Player>();
		for (Player p : players){
			if(p.getBatAvg() >= highestBA){
				highestBA = p.getBatAvg();
				highestBAs.add(p);
			}
		}
		// finds fewest OABs
		int fewestOAB = 100000;
		ArrayList<Player> fewestOABs = new ArrayList<Player>();
		for (Player p : players){
			if(p.getOAB() <= fewestOAB){
				fewestOAB = p.getOAB();
				fewestOABs.add(p);
			}

		}
		// finds highest SLG
		double highestSLG = 0;
		ArrayList<Player> highestSLGs = new ArrayList<Player>();
		for (Player p : players){
			if(p.getSLG() >= highestSLG){
				highestSLG = p.getSLG();
				highestSLGs.add(p);
			}
		}
		// finds highest OBP
		double highestOBP = 0.0;
		ArrayList<Player> highestOBPs = new ArrayList<Player>();
		for (Player p : players){
			if(p.getOBP() >= highestOBP){
				highestOBP = p.getOBP();
				highestOBPs.add(p);
			}
		}
		// finds fewest TBs
		int fewestBases = 100000;
		ArrayList<Player> fewestTBs = new ArrayList<Player>();
		for (Player p : players){
			if(p.getTotalBases() <= fewestBases){
				fewestBases = p.getTotalBases();
				fewestTBs.add(p);
			}
		}
		
		// prints results
		for(Player p : highestBAs){
			if(p.getBatAvg() == highestBA) System.out.print(p.getName() + ", ");
		}
		System.out.print(highestBA + "\n");
		for(Player p : fewestOABs){
			if(p.getOAB() == fewestOAB) System.out.print(p.getName() + ", ");
		}
		System.out.print(fewestOAB + "\n");
		for(Player p : highestSLGs){
			if(p.getSLG() == highestSLG) System.out.print(p.getName() + ", ");
		}
		System.out.print(highestSLG + "\n");
		for(Player p : highestOBPs){
			if(p.getOBP() == highestOBP) System.out.print(p.getName() + ", ");
		}
		System.out.print(highestOBP + "\n");
		for(Player p : fewestTBs){
			if(p.getTotalBases() == fewestBases) System.out.print(p.getName() + ", ");
		}
		System.out.print(fewestBases + "\n");
	}
}