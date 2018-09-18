class SleepLog extends Log {
	String endtime;
	SleepLog(String date1, String time1, String endtime1) {
		this.setDate(date1);
		this.setTime(time1);
	    this.endtime = endtime1;
	}
	public void setEndTime(String endtime1) {
		this.endtime = endtime1;
	}
	public String getEndTime() {
		return endtime;
	}
	public String toString() {
        System.out.println("Sleep");
        return "Date:"+this.getDate() + "\n" + "Starttime:"+this.getTime() + "\n" +"Endtime:"+this.getEndTime();
    }
}