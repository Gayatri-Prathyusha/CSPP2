class User {
	String userName;
	List<String> friends;
	User() {
		this.userName = null;
		this.friends = null;
	}
	User(String user) {
		this.userName = user;
		this.friends = null;
	}

	User(String user1, List<String> friends1) {
		this.userName = user1;
		this.friends = friends1;

	}
	public List<String> getFriends() {
		return friends;
	}
	 public void setFriends(List<String> friends1) {
     this.friends = friends1;
	 }
	 public String getUserName() {
        return this.userName;
    }
    public void setUserName(String user) {
        this.userName = user;
    }
    public String toString() {
    	return this.getUserName() + " " + this.getFriends();
    }


}
