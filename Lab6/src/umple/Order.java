/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 11 "Lab6.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private int month;
  private int day;
  private int year;
  private int orderNumber;

  //Order Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(int aMonth, int aDay, int aYear, int aOrderNumber, Account aAccount)
  {
    month = aMonth;
    day = aDay;
    year = aYear;
    orderNumber = aOrderNumber;
    if (aAccount == null || aAccount.getOrder() != null)
    {
      throw new RuntimeException("Unable to create Order due to aAccount");
    }
    account = aAccount;
  }

  public Order(int aMonth, int aDay, int aYear, int aOrderNumber, String aPasswordForAccount, String aUsernameForAccount, int aAccountNumberForAccount, int aYearCreatedForAccount, Customer aCustomerForAccount)
  {
    month = aMonth;
    day = aDay;
    year = aYear;
    orderNumber = aOrderNumber;
    account = new Account(aPasswordForAccount, aUsernameForAccount, aAccountNumberForAccount, aYearCreatedForAccount, aCustomerForAccount, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMonth(int aMonth)
  {
    boolean wasSet = false;
    month = aMonth;
    wasSet = true;
    return wasSet;
  }

  public boolean setDay(int aDay)
  {
    boolean wasSet = false;
    day = aDay;
    wasSet = true;
    return wasSet;
  }

  public boolean setYear(int aYear)
  {
    boolean wasSet = false;
    year = aYear;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrderNumber(int aOrderNumber)
  {
    boolean wasSet = false;
    orderNumber = aOrderNumber;
    wasSet = true;
    return wasSet;
  }

  public int getMonth()
  {
    return month;
  }

  public int getDay()
  {
    return day;
  }

  public int getYear()
  {
    return year;
  }

  public int getOrderNumber()
  {
    return orderNumber;
  }

  public Account getAccount()
  {
    return account;
  }

  public void delete()
  {
    Account existingAccount = account;
    account = null;
    if (existingAccount != null)
    {
      existingAccount.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "month" + ":" + getMonth()+ "," +
            "day" + ":" + getDay()+ "," +
            "year" + ":" + getYear()+ "," +
            "orderNumber" + ":" + getOrderNumber()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}