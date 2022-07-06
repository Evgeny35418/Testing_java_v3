package model;

public class NewUser {
  private final String firstName;
  private final String lastName;
  private final String company;
  private final String address;
  private final String telephone;
  private final String email;

  public NewUser(String firstName, String lastName, String company, String address, String telephone, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.telephone = telephone;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getEmail() {
    return email;
  }
}
