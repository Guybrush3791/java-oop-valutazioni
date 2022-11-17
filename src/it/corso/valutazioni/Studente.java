package it.corso.valutazioni;

public class Studente {

	private int id;
	private int percMissingDay;
	private int avgRating;
	
	public Studente(int id, int percMissingDay, 
					int avgRating) {
		
		this.id = id;
		this.percMissingDay = percMissingDay;
		this.avgRating = avgRating;
	}
	
	public int getId() { 
		
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
	}
	public int getPercMissingDay() {
		
		return percMissingDay;
	}
	public void setPercMissingDay(int percMissingDay) {
		
		this.percMissingDay = percMissingDay;
	}
	public int getAvgRating() {
		
		return avgRating;
	}
	public void setAvgRating(int avgRating) {
		
		this.avgRating = avgRating;
	}
	
	public boolean isPass() {
		
		if ((percMissingDay >= 25 && percMissingDay < 50 
				&& avgRating > 2) 
			|| (percMissingDay < 25 && avgRating >= 2)) 
			return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		
		return "Studente: " + id
				+ "\npercentuale assenze: " + percMissingDay + "%"
				+ "\nmedia voti: " + avgRating + "/5"
				+ "\npass: " + isPass();
	}
}
