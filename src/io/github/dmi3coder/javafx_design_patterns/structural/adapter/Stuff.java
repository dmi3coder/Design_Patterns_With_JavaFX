package io.github.dmi3coder.javafx_design_patterns.structural.adapter;

public class Stuff {
  private String name;
  private String surname;
  private Department department;
  private String image;


  public Stuff(String name, String surname,
      Department department, String image) {
    this.name = name;
    this.surname = surname;
    this.department = department;
    this.image = image;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(
      Department department) {
    this.department = department;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
