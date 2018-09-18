class PhysicalActivityLog extends Log {
	String activityname;
	String endtime;
	String notes;
	PhysicalActivityLog(String activityname1, String notes1, String date1, String time1, String endtime1) {
		this.activityname = activityname1;
		this.setDate(date1);
		this.setTime(time1);
		this.endtime = endtime1;
		this.notes = notes1;
	}
	public void setActivityName(String activityname1) {
		this.activityname = activityname1;
	}
	public String getActivityName() {
		return activityname;
	}
	public void setEndTime(String endtime1) {
		this.endtime = endtime1;
	}
	public String getEndTime() {
		return endtime;
	}
	public void setNotes(String notes1) {
		this.notes = notes1;
	}
	public String getNotes() {
		return notes;
	}
	public String toString() {
        System.out.println("PhysicalActivity");
        return "Name:" + this.getActivityName() + "\n" +"Notes:"+ this.getNotes()+ " \n" +"Date:" +this.getDate() + "\n" +"Starttime:" +this.getTime() + "\n" + "Endtime:" + this.getEndTime();
    }
}
