import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.*;

public class Collect {
	HashMap<String, Integer> employees = new HashMap<String, Integer>();
	TreeMap<String, Integer> PresVotes = new TreeMap<String, Integer>();
	
	public Collect() {
		
	}
	public void addEmployee(String firstName, int employeeID) {
		employees.put(firstName, employeeID);
	}
	public void addCandidate(String fullName, int currVotes) {
		PresVotes.put(fullName, currVotes);
		
		
	}
	public void turnInVotes(String candName, int newVotes) {
		if(!PresVotes.containsKey(candName)) {
			System.out.println("That candidate isn't on the ballot!");
		}
		else {
			int votes = ((int)PresVotes.get(candName));
			PresVotes.put(candName, (votes + newVotes));
		}
	}
	public void whoIsWinning() {
		System.out.println(PresVotes);
	}
	
	
}
