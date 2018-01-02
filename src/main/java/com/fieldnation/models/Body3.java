/*
 * Field Nation V2 API
 *
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 *
 *
 * Do not edit the class manually.
 */


package com.fieldnation.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import com.fieldnation.models.StaffrecruitmentsendcommunicationsworkOrderIdUsers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Body3
 */

public class Body3 {
  @SerializedName("users")
  private List<StaffrecruitmentsendcommunicationsworkOrderIdUsers> users = new ArrayList<StaffrecruitmentsendcommunicationsworkOrderIdUsers>();

  @SerializedName("email_template")
  private Integer emailTemplate = null;

  @SerializedName("robocall_template")
  private Integer robocallTemplate = null;

  public Body3 users(List<StaffrecruitmentsendcommunicationsworkOrderIdUsers> users) {
    this.users = users;
    return this;
  }

  public Body3 addUsersItem(StaffrecruitmentsendcommunicationsworkOrderIdUsers usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  public List<StaffrecruitmentsendcommunicationsworkOrderIdUsers> getUsers() {
    return users;
  }

  public void setUsers(List<StaffrecruitmentsendcommunicationsworkOrderIdUsers> users) {
    this.users = users;
  }

  public Body3 emailTemplate(Integer emailTemplate) {
    this.emailTemplate = emailTemplate;
    return this;
  }

   /**
   * Get emailTemplate
   * @return emailTemplate
  **/

  public Integer getEmailTemplate() {
    return emailTemplate;
  }

  public void setEmailTemplate(Integer emailTemplate) {
    this.emailTemplate = emailTemplate;
  }

  public Body3 robocallTemplate(Integer robocallTemplate) {
    this.robocallTemplate = robocallTemplate;
    return this;
  }

   /**
   * Get robocallTemplate
   * @return robocallTemplate
  **/

  public Integer getRobocallTemplate() {
    return robocallTemplate;
  }

  public void setRobocallTemplate(Integer robocallTemplate) {
    this.robocallTemplate = robocallTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return Objects.equals(this.users, body3.users) &&
        Objects.equals(this.emailTemplate, body3.emailTemplate) &&
        Objects.equals(this.robocallTemplate, body3.robocallTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, emailTemplate, robocallTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    emailTemplate: ").append(toIndentedString(emailTemplate)).append("\n");
    sb.append("    robocallTemplate: ").append(toIndentedString(robocallTemplate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

