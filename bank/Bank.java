package bank;

class Account {
  public String name;
  protected String email;
  private double password;

  // getter function to get the private attribute
  public double getPassword() {
    setPassword(Math.random());
    return this.password;
  }

  // setter function to assign value to the private attribute
  private void setPassword(double password) {
    this.password = password;
  }
}

public class Bank {
  public static void main(String args[]) {
    Account account1 = new Account();
    account1.name = "Mohammad";
    account1.email = "mddanishsiddique@gmail.com";
    // getting the private attribute value
    System.out.println(account1.getPassword());
  }
}
