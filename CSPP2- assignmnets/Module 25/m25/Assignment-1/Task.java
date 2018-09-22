class Task {
	private String title;
	private String assignedTo;
	private int timetocomplete;
	private boolean important;
	private boolean urgent;
	private String status;
	Task() {
		
	}
	
	Task(String title1,  String assignedTo1,
        int timetocomplete1,  boolean important1,
        boolean urgent1,  String status1) throws Exception {
			if (title1.length() > 0) {
		        title = title1;
		    } else {
		        throw new Exception("Title not provided");
		    }
		    assignedTo = assignedTo1;
		    if (timetocomplete1 >= 0) {
		      timetocomplete = timetocomplete1;
		    } else {
		      throw new Exception("Invalid timeToComplete " + timetocomplete1);
		    }
		    important = important1;
		    urgent = urgent1;
		    if (status1.equals("todo") || status1.equals("done")) {
		      status = status1;
		    } else {
		      throw new Exception("Invalid status " + status1);
		    }
		  }
	  public String toString() {
	    String out = "";
	    String imp = "";
	    String urge = "";

	    if (important) {
	      imp = "Important";
	    } else {
	      imp = "Not Important";
	    }

	    if (urgent) {
	      urge = "Urgent";
	    } else {
	      urge = "Not Urgent";
	    }

	    out = title + ", " + assignedTo + ", " + timetocomplete + ", "
	          + imp + ", " + urge + ", " + status;
	    return out;
	  }
	  public String getTitle() {
	    return title;
	  }

	  public String getassignedTo() {
	    return assignedTo;
	  }

	  public int getTimeToComplete() {
	    return timetocomplete;
	  }

	  public String getImportant() {
	    if (important) {
	      return "Important";
	    } else {
	      return "Not Important";
	    }
	  }

	  public String getUrgent() {
	    if (urgent) {
	      return "Urgent";
	    } else {
	      return "Not Urgent";
	    }
	  }

	  public String getStatus() {
	    return status;
	  }

	  public boolean getImpStatus() {
	    return important;
	  }

	  public boolean getUrgStatus() {
	    return urgent;
	  }

}