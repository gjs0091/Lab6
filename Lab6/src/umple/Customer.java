/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 19 "Lab6.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String firstName;
  private String lastName;
  private String shippingAddress;
  private String billingAddress;

  //Customer Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aFirstName, String aLastName, String aShippingAddress, String aBillingAddress, Account aAccount)
  {
    firstName = aFirstName;
    lastName = aLastName;
    shippingAddress = aShippingAddress;
    billingAddress = aBillingAddress;
    if (aAccount == null || aAccount.getCustomer() != null)
    {
      throw new RuntimeException("Unable to create Customer due to aAccount");
    }
    account = aAccount;
  }

  public Customer(String aFirstName, String aLastName, String aShippingAddress, String aBillingAddress, String aPasswordForAccount, String aUsernameForAccount, int aAccountNumberForAccount, int aYearCreatedForAccount, Order aOrderForAccount)
  {
    firstName = aFirstName;
    lastName = aLastName;
    shippingAddress = aShippingAddress;
    billingAddress = aBillingAddress;
    account = new Account(aPasswordForAccount, aUsernameForAccount, aAccountNumberForAccount, aYearCreatedForAccount, this, aOrderForAccount);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFirstName(String aFirstName)
  {
    boolean wasSet = false;
    firstName = aFirstName;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastName(String aLastName)
  {
    boolean wasSet = false;
    lastName = aLastName;
    wasSet = true;
    return wasSet;
  }

  public boolean setShippingAddress(String aShippingAddress)
  {
    boolean wasSet = false;
    shippingAddress = aShippingAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setBillingAddress(String aBillingAddress)
  {
    boolean wasSet = false;
    billingAddress = aBillingAddress;
    wasSet = true;
    return wasSet;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getShippingAddress()
  {
    return shippingAddress;
  }

  public String getBillingAddress()
  {
    return billingAddress;
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
            "firstName" + ":" + getFirstName()+ "," +
            "lastName" + ":" + getLastName()+ "," +
            "shippingAddress" + ":" + getShippingAddress()+ "," +
            "billingAddress" + ":" + getBillingAddress()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}