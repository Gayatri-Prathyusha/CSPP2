class FoodLog extends Log {
	String fooditem;
	int quantity;
	FoodLog(String name1, int qunat1, String date1, String time1) {
		this.fooditem = name1;
		this.quantity = qunat1;
		this.setDate(date1);
		this.setTime(time1);
	}
	public void setNameOfFood(String name) {
		this.fooditem = name;

	}
	public String getNameOfFood() {
		return fooditem;
	}
		public void setQuantity(int quant) {
		this.quantity = quant;

	}
	public int getQuantity() {
		return quantity;
	}
	public String toString() {
        System.out.println("Food");
        return "Date:" + this.getDate() +"\n"+ "Time:" + this.getTime() + "\n" +"Name:"+this.getNameOfFood() + "\n" + "Quantity:" +this.getQuantity();
    }
}
