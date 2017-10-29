package io.github.dmi3coder.javafx_design_patterns.creational.protorype;

/**
 * Created by dim3coder on 10/13/17.
 */
public class Author implements Cloneable {

  private String avatarUrl;
  private String name;
  private String nickname;


  public Author(String avatarUrl, String name, String nickname) {
    this.avatarUrl = avatarUrl;
    this.name = name;
    this.nickname = nickname;
  }

  public Author(Author author) {
    this.avatarUrl = author.avatarUrl;
    this.name = author.name;
    this.nickname = author.nickname;
  }

  public Author() {
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Author(this);
  }
}
