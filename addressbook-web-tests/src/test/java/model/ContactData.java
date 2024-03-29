package model;

public class ContactData {
  public int id;
  private final String firstName;
  private final String lastName;
  private final String company;
  private final String address;
  private final String telephone;
  private final String email;
  private final String group;



  public ContactData(int id, String firstName, String lastName, String company, String address, String telephone, String email, String group) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.telephone = telephone;
    this.email = email;
    this.group = group;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
    return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }

  public ContactData(String firstName, String lastName, String company, String address, String telephone, String email, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.telephone = telephone;
    this.email = email;
    this.group = group;
  }
  public int getId() {
    return id;
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
