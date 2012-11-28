public class Contestant {
	private int id;
    private String name;
    private int prev;
    private int curr;
    private int pos;
    
    public Contestant() {
		name = null;
		prev = curr = pos = id = -1;
	}
	
	public int getID() {
        return id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPreviousRanking() {
        return prev;
    }
    
    public void setPreviousRanking(int prev) {
        this.prev = prev;
    }
    
    public int getCurrentRanking() {
        return curr;
    }
    
    public void setCurrentRanking(int curr) {
        this.curr = curr;
    }
    
    public int getCurrentPosition() {
        return pos;
    }
    
    public void setCurrentPosition(int pos) {
        this.pos = pos;
    }
    
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + name + "\n");
		sb.append("\t\tPrevious Ranking: " + prev + "\n");
		sb.append("\t\tNew Ranking: " + curr + "\n");
		sb.append("\t\tChange: " + (curr - prev) + "\n");
		return sb.toString();
	}
}
