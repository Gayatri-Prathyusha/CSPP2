import java.util.ArrayList;
import java.util.Arrays;
class Network {
	private List<User> userList;

	public Network() {
		userList = new List<User>();
	}
	// public void createNetwork() {
	// 	String[] lines = string.split("\\.");
	// 	for(String line : lines) {
	// 		String token[] = line.split(" is connected to ");
	// 		String [] frnds = tokens[1].split(", ");
	// 		List<User> set = new List<User>();
	// 		for(int i = 0; i < frnds.length; i++) {
	// 		    connections.add(frnds[i]);
	// 		}
	// 		addNewUser(tokens[0], connections);

	// 	}
	// }

	public void addUser(String username, List<String> friends) {
		if (userList.size() == 0) {
			userList.add(new User(username, friends));
		} else {
			for (int i = 0; i < userList.size(); i++) {
				if (userList.get(i).getUserName().equals(username)) {
					System.out.println("User already exists");
					return;
				}
			}
			userList.add(new User(username, friends));
		}
	}

	public void addConnection(String user, String friend) {
		int index = userList.indexOf(new User(user));
		if (index == -1) {
			System.out.println("Not a user in Network");
			return;
		} else {
			if (userList.get(index).getFriends().contains(friend) == false) {
				userList.get(index).getFriends().add(friend);
			}
		}
	}

	public List<String> getConnections(String user) {
		int index = userList.indexOf(new User(user));
		if(index != -1) {
			return userList.get(index).getFriends();
		}
		return null;
	}

		public List<String> getCommonConnection(String username, String username1) {
		List<String> commonfriends = new List<String>();
		List<String> frndsListA = getConnections(username);
		List<String> frndsListB = getConnections(username1);
		for (int i = 0; i < frndsListA.size(); i++) {
			if (frndsListB.contains(frndsListA.get(i))) {
				commonfriends.add(frndsListA.get(i));
			}
		}
		return commonfriends;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		ArrayList list = new ArrayList();
		for (int i = 0; i < userList.size(); i++) {
			list.add(userList.get(i).getUserName());
		}
		java.util.Collections.sort(list);
		for (int i = 0; i < userList.size(); i++) {
			int index = userList.indexOf(new User((String)list.get(i)));
			s.append(userList.get(index));
		}
		String string = s.toString();
		return string.substring(0, string.length() - 2);
	}

	}

