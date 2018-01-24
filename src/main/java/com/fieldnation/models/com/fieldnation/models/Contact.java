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
import com.google.gson.annotations.SerializedName;

/**
 * Contact
 */

public class Contact {
  @SerializedName("name")
  private String name = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("ext")
  private String ext = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("notes")
  private String notes = null;

  public Contact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Contact role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Contact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Contact ext(String ext) {
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/

  public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public Contact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.name, contact.name) &&
        Objects.equals(this.role, contact.role) &&
        Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.ext, contact.ext) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.notes, contact.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, role, phone, ext, email, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

