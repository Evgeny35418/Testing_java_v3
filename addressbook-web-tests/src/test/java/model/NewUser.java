package model;

public class NewUser {
  private final String firstName;
  private final String lastName;
  private final String company;
  private final String address;
  private final String telephone;
  private final String email;
  private final String group;

  public NewUser(String firstName, String lastName, String company, String address, String telephone, String email, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.telephone = telephone;
    this.email = email;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}
