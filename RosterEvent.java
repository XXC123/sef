package sefA1;

public class RosterEvent {
	private String name, start, end, time;
	private int numOfStaff;
	private String[] staffIDs;
	private double payRate;	
	
	public RosterEvent(String name, String start, String end, String time, int numOfStaff, String[] staffIDs, double payRate){
		this.name = name;
		this.start = start;
		this.end = end;
		this.time = time; 
		this.numOfStaff = numOfStaff;
		for (int i = 0; i < staffIDs.length; i++){
			this.staffIDs[i] = staffIDs[i];
		}
		this.payRate = payRate;
	}
	
	public String getName(){
		return name;
	}
	
	public String getStart(){
		return start;
	}
	
	public String getEnd(){
		return end;
	}
	
	public String getTime(){
		return time;
	}
	
	public int get numOfStaff(){
		return numOfStaff;
	}
	
	public double getPayRate(){
		return payRate;
	}
}
