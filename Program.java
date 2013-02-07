import java.util.*;
public class Program {
	public static void main(String ... args) throws Exception {
		Contest contest = XMLContestReader.parseContestFile(args[0]);
		contest.updateRanking(new PositionalEloCalculator());
		ArrayList<Contestant> list = contest.getContestants();
		for (Contestant c : list) {
			System.out.println(c);
		}
	}
}
