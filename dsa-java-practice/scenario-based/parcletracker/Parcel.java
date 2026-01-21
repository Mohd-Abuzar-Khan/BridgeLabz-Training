package parcletracker;

public class Parcel {
	String parcelStage;
	Parcel next;
	
	public Parcel(String parcelStage) {
		this.parcelStage = parcelStage;
		this.next = null;
	}

}
