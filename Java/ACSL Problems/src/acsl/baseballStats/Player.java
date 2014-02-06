package acsl.baseballStats;

public class Player {
	private String name;
	private int outs, singles, doubles, triples, HRs, Ks, BBs, HBPs, sacs;
	
	public Player(){
		name = null;
		outs = 0;
		singles = 0;
		doubles = 0;
		triples = 0;
		HRs = 0;
		Ks = 0;
		BBs = 0;
		HBPs = 0;
		sacs = 0;
	}

	// accessors
	public String getName() {
		return name;
	}
	public double getBatAvg() {
		return (double)getTotalHits() / getOAB();
	}
	public int getTotalPA() {
		return outs + getTotalHits() + Ks + BBs + HBPs + sacs;
	}
	public int getOAB() {
		return getTotalPA() - BBs - HBPs - sacs;
	}
	public double getSLG() {
		return (double)getTotalBases() / getOAB();
	}
	public double getOBP() {
		return ((double)getTotalHits() + BBs + HBPs) / (getOAB() + BBs + HBPs + sacs);
	}
	public int getTotalBases() {
		return (singles + 2*doubles + 3*triples + 4*HRs);
	}
	public int getTotalHits() {
		return singles + doubles + triples + HRs;
	}

	// mutators
	public void setName(String n){
		name = n;
	}
	public void setOuts(int outs) {
		this.outs = outs;
	}
	public void setSingles(int singles) {
		this.singles = singles;
	}
	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}
	public void setTriples(int triples) {
		this.triples = triples;
	}
	public void setHRs(int hrs) {
		HRs = hrs;
	}
	public void setKs(int ks) {
		Ks = ks;
	}
	public void setBBs(int bbs) {
		BBs = bbs;
	}
	public void setHBPs(int hbps) {
		HBPs = hbps;
	}
	public void setSacs(int sacs) {
		this.sacs = sacs;
	}
}