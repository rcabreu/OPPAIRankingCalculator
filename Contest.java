import java.util.ArrayList;

public class Contest {
	private String name;
	private ArrayList<Contestant> contestants;
	
	public Contest() {
		name = null;
		contestants = new ArrayList<Contestant>();
	}
	
	public String getName() {
        return name;
    }
    public void setName(String date) {
        this.name = date;
    }
    
    public void addContestant(Contestant c) {
		contestants.add(c);
	}
	
	public ArrayList<Contestant> getContestants() {
		return contestants;
	}
	
	public void updateRanking(RankingCalculationStrategy calculator) {
		calculator.calculate(this);
	}
    
    
	
}
