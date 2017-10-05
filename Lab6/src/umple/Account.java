/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 1 "Lab6.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private String password;
  private String username;
  private int accountNumber;
  private int yearCreated;

  //Account Associations
  private Customer customer;
  private Order order;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(String aPassword, String aUsername, int aAccountNumber, int aYearCreated, Customer aCustomer, Order aOrder)
  {
    password = aPassword;
    username = aUsername;
    accountNumber = aAccountNumber;
    yearCreated = aYearCreated;
    if (aCustomer == null || aCustomer.getAccount() != null)
    {
      throw new RuntimeException("Unable to create Account due to aCustomer");
    }
    customer = aCustomer;
    if (aOrder == null || aOrder.getAccount() != null)
    {
      throw new RuntimeException("Unable to create Account due to aOrder");
    }
    order = aOrder;
  }

  public Account(String aPassword, String aUsername, int aAccountNumber, int aYearCreated, String aFirstNameForCustomer, String aLastNameForCustomer, String aShippingAddressForCustomer, String aBillingAddressForCustomer, int aMonthForOrder, int aDayForOrder, int aYearForOrder, int aOrderNumberForOrder)
  {
    password = aPassword;
    username = aUsername;
    accountNumber = aAccountNumber;
    yearCreated = aYearCreated;
    customer = new Customer(aFirstNameForCustomer, aLastNameForCustomer, aShippingAddressForCustomer, aBillingAddressForCustomer, this);
    order = new Order(aMonthForOrder, aDayForOrder, aYearForOrder, aOrderNumberForOrder, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public boolean setUsername(String aUsername)
  {
    boolean wasSet = false;
    username = aUsername;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccountNumber(int aAccountNumber)
  {
    boolean wasSet = false;
    accountNumber = aAccountNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setYearCreated(int aYearCreated)
  {
    boolean wasSet = false;
    yearCreated = aYearCreated;
    wasSet = true;
    return wasSet;
  }

  public String getPassword()
  {
    return password;
  }

  public String getUsername()
  {
    return username;
  }

  public int getAccountNumber()
  {
    return accountNumber;
  }

  public int getYearCreated()
  {
    return yearCreated;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public Order getOrder()
  {
    return order;
  }

  public void delete()
  {
    Customer existingCustomer = customer;
    customer = null;
    if (existingCustomer != null)
    {
      existingCustomer.delete();
    }
    Order existingOrder = order;
    order = null;
    if (existingOrder != null)
    {
      existingOrder.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "password" + ":" + getPassword()+ "," +
            "username" + ":" + getUsername()+ "," +
            "accountNumber" + ":" + getAccountNumber()+ "," +
            "yearCreated" + ":" + getYearCreated()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "customer = "+(getCustomer()!=null?Integer.toHexString(System.identityHashCode(getCustomer())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "order = "+(getOrder()!=null?Integer.toHexString(System.identityHashCode(getOrder())):"null");
  }
}