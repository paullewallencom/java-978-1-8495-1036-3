package net.ensode.glassfishbook.jsfcustommess;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Customer {

  private String firstName;
  private String lastName;
  private String email;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
