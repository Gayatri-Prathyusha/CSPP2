import java.util.Arrays;
import java.util.Scanner;
/**
 * Class for show.
 */
class Show {
  /**
   * Decalring variables.
   */
  private String names, dates;
  /**
   * Creates an array of seat numbers.
   */
  private String[] seat;
  /**
   * Constructs the object.
   *
   * @param      name   The name
   * @param      date   The date
   * @param      seats  The seats
   */
  Show(final String name, final String date, final String[] seats) {
    names = name;
    dates = date;
    seat = Arrays.copyOf(seats, seats.length);
  }
  /**
   * Gets the m name.
   *
   * @return     The m name.
   */
  public String getMName() {
    return names;
  }
  /**
   * Gets the m date.
   *
   * @return     The m date.
   */
  public String getMDate() {
    return dates;
  }
  /**
   * Gets the m seats.
   *
   * @return     The m seats.
   */
  public String[] getMSeats() {
    return seat;
  }
  /**
   * Returns a string representation of the object.
   *
   * @return     String representation of the object.
   */
  public String toString() {
    return names + "," + dates;
  }
  /**
   * Represent function for showAll.
   *
   * @return     { description_of_the_return_value }
   */
  public String represent() {
    return names + "," + dates + ","
    + Arrays.toString(seat).replace(" ", "");
  }
  /**
   * Searches for the first match.
   *
   * @param      item  The item
   *
   * @return     { description_of_the_return_value }
   */
  public int indexOf(final String item) {
    for (int i = 0; i < seat.length; i++) {
      if (item.equals(seat[i])) {
        return i;
      }
    } return -1;
  }

}
/**
 * Class for patron.
 */
class Patron {
  /**
   * Declaring variables.
   */
  private String patronName, patronNum;
  /**
   * Constructs the object.
   *
   * @param      name    The name
   * @param      number  The number
   */
  Patron(final String name, final String number) {
    patronName = name;
    patronNum = number;
  }
  /**
   * Gets the p name.
   *
   * @return     The p name.
   */
  public String getPName() {
    return patronName;
  }
  /**
   * Gets the p number.
   *
   * @return     The p number.
   */
  public String getPNum() {
    return patronNum;
  }
}
/**
 * Class for book your show.
 */
class BookYourShow {
  /**
   * Declaring sizes for arrays.
   */
  private int size = 0, size1 = 0;
  /**
   * To remove Magic Number Error.
   */
  private static final int FIF = 15;
  /**
   * Creating a Show array.
   */
  private Show[] s = new Show[FIF];
  /**
   * Creating a patron array.
   */
  private Patron[] p = new Patron[FIF];
  /**
   * Adds a show.
   *
   * @param      mname   The mname
   * @param      mdate   The mdate
   * @param      mseats  The mseats
   */
  public void addAShow(final String mname, final String mdate,
    final String[] mseats) {
    s[size++] = new Show(mname, mdate, mseats);
  }
  /**
   * Gets a show.
   *
   * @param      mname  The mname
   * @param      mdate  The mdate
   *
   * @return     A show.
   */
  public Show getAShow(final String mname, final String mdate) {
    for (int i = 0; i < size; i++) {
      if (s[i].getMName().equals(mname) && s[i].getMDate().equals(mdate)) {
        return s[i];
      }
    }
    return null;
  }
  /**
   * Shows all.
   */
  public void showAll() {
    for (int i = 0; i < size; i++) {
      System.out.println(s[i].represent());
    }
  }
  /**
   * Booking A Show Ticket function.
   *
   * @param      mname    The mname
   * @param      mdate    The mdate
   * @param      pname    The pname
   * @param      pnumber  The pnumber
   * @param      array    The array
   */
  public void bookAShow(final String mname, final String mdate,
    final String pname, final String pnumber, final String[] array) {
    int count = 0, temp = 0;
    // String z = "";
    boolean flag = false;
    boolean flag1 = false;
    for (int i = 0; i < size; i++) {
      // System.out.println(count);
      if (s[i].getMName().equals(mname) && s[i].getMDate().equals(mdate)) {
        flag1 = true;
        // String[] array1 = s[i].getMSeats();
        for (int i1 = 0; i1 < array.length; i1++) {
          if (Arrays.asList(s[i].getMSeats()).contains(array[i1])) {
            count += 1;
            flag = true;
            for (int i2 = 0; i2 < s[i].getMSeats().length; i2++) {
              if (s[i].getMSeats()[i2].equals(array[i1])) {
                s[i].getMSeats()[i2] = "N/A";
              }
            }
          }
        }
      }
    }
    // String[] array2 = s[temp].getMSeats();
    // System.out.println(Arrays.toString(array2));
    // System.out.println(Arrays.toString(array));
    // System.out.println((count==array.length));
    if (!flag && !flag1) {
      System.out.println("No show");
    } else if (count <= array.length) {
       p[size1++] = new Patron(pname, pnumber);
    }
  }
  /**
   * Printing the ticket function.
   *
   * @param      mname    The mname
   * @param      mdate    The mdate
   * @param      pnumber  The pnumber
   *
   * @return     { description_of_the_return_value }
   */
  public String printTicket(final String mname, final String mdate,
   final String pnumber) {
    for (int i = 0; i < size; i++) {
      if (s[i].getMName().equals(mname) && s[i].getMDate().equals(mdate)) {
        for (int i1 = 0; i1 < size1; i1++) {
          if (p[i1].getPNum().equals(pnumber)) {
            return pnumber + " " + mname + " " + mdate;
          }
        }
      }
    }
    return "Invalid";
  }

}

/**
 * Class for solution.
 */
public final class Solution {
/**
 * Constructs the object.
 */
private Solution() {

  }
  /**
   * main method to drive program.
   *
   @param      args  The arguments
   */
  public static void main(final String[] args) {
    BookYourShow bys = new BookYourShow();
    Scanner scan = new Scanner(System.in);
    int testCases = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < testCases; i++) {
      String[] tokens = scan.nextLine().
                        replace("[", "").replace("]", "").split(",");
      String[] check = tokens[0].split(" ");
      switch (check[0]) {
      case "add":
        int k = 2;
        String[] seats = new String[tokens.length - 2];
        for (int j = 0; j < seats.length; j++) {
          seats[j] = tokens[k++];
        }
        bys.addAShow(check[1], tokens[1], seats);
        break;

      case "book":
        k = 2 + 2;
        seats = new String[tokens.length - 2 - 2];
        for (int j = 0; j < seats.length; j++) {
          seats[j] = tokens[k++];
        }
        bys.bookAShow(check[1], tokens[1],
                      tokens[2], tokens[2 + 1], seats);
        break;

      case "get":
        Show show = bys.getAShow(check[1], tokens[1]);
        if (show != null) {
          System.out.println(show);
        } else {
          System.out.println("No show");
        }
        break;

      case "print":
        System.out.println(bys.printTicket(check[1], tokens[1], tokens[2]));
        break;

      case "showAll":
        bys.showAll();
        break;

      default:
        break;
      }
    }
  }
}
