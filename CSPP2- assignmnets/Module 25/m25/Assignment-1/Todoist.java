class Todoist {

  private Task[] tasks;
 
  private int size;

  Todoist() {
    final int Hundered = 100;
    tasks = new Task[Hundered];
    size = 0;
  }

  public void addTask(final Task task1) {
    tasks[size++] = task1;
    // size += 1;
    // System.out.println(task1);
  }

  public Task getNextTask(final String person) {
    Task sendtask = new Task();
    boolean val = false;

    for (int i = 0; i < size; i++) {
      if (tasks[i].getassignedTo().equals(person)) {
        if (tasks[i].getStatus().equals("todo")
            && tasks[i].getImpStatus() && !tasks[i].getUrgStatus()) {
          sendtask = tasks[i];
          val = true;
          return sendtask;
        }
      }
    }

    if (!val) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getassignedTo().equals(person)) {
                if (tasks[i].getStatus().equals("todo")
                    && tasks[i].getImpStatus() && !tasks[i].getUrgStatus()) {
                sendtask = tasks[i];
                val = true;
                }
            }
        }

    }

    if (!val) {
      sendtask = null;
    }

    return sendtask;
  }

  public String toString() {
    String sendtask = "";
    for (int i = 0; i < size; i++) {
      sendtask = sendtask + tasks[i].getTitle() + ", " + tasks[i].getassignedTo() +  ", "
            + tasks[i].getTimeToComplete() +  ", " + tasks[i].getImportant()
            +  ", " + tasks[i].getUrgent() + ", " +  tasks[i].getStatus() + "\n";
    }
    return sendtask;
  }


}