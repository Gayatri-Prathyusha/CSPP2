class WeightLog extends Log {
	String weight;
	String fatpercent;
	WeightLog(String weight1, String fatpercent1, String date1, String time1) {
		this.weight = weight1;
		this.fatpercent = fatpercent1;
	    this.setDate(date1);
		this.setTime(time1);
	}
	public void setWeight(String weight1) {
		this.weight = weight1;
	}
	public String getWeight() {
		return weight;
	}
	public void setFatPercentage(String fatpercent1) {
		this.fatpercent = fatpercent1;
	}
	public String getFatPercentage() {
		return fatpercent;
	}
	public String toString() {
        System.out.println("Weight");
        return  "Date:" +this.getDate() + "\n" + "Time:" +this.getTime()+"\n"+ "Weight:" +this.getWeight() + "\n" + "Fat:"+ this.getFatPercentage();
    }
} 
