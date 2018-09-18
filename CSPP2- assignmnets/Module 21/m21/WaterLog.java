class WaterLog extends Log {
	int quantity;

	WaterLog(int qunat1, String date1, String time1) {
		
		this.setDate(date1);
		this.setTime(time1);
		this.quantity = qunat1;

	}
	public void setQuantity(int quant) {
		this.quantity = quant;

	}
	public int getQuantity() {
		return quantity;
	}
	public String toString() {
        System.out.println("Water");
        return "Date:" +this.getDate() + "\n" + "Quantity:" + this.getQuantity() + "ml";
    }
}
