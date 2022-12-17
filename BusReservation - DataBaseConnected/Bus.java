package BusResev;

public class Bus {
	private int busNo;
	private boolean AC;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.AC = ac;
		this.capacity = cap;
	}
	
	int getBusNo() {
		return busNo;
	}
	void setBusNo(int no) {
		this.busNo = no;
	}
	
	int getCapacity() {
		return capacity;
	}
	void setCapacity(int cap) {
		this.capacity = cap;
	}
	
	
}
