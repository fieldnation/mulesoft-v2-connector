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
 * Experience
 */

public class Experience {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("start")
  private java.util.Date start = null;

  @SerializedName("end")
  private java.util.Date end = null;

  public Experience id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Experience company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Experience title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Experience description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Experience location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Experience start(java.util.Date start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/

  public java.util.Date getStart() {
    return start;
  }

  public void setStart(java.util.Date start) {
    this.start = start;
  }

  public Experience end(java.util.Date end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/

  public java.util.Date getEnd() {
    return end;
  }

  public void setEnd(java.util.Date end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Experience experience = (Experience) o;
    return Objects.equals(this.id, experience.id) &&
        Objects.equals(this.company, experience.company) &&
        Objects.equals(this.title, experience.title) &&
        Objects.equals(this.description, experience.description) &&
        Objects.equals(this.location, experience.location) &&
        Objects.equals(this.start, experience.start) &&
        Objects.equals(this.end, experience.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, company, title, description, location, start, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Experience {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

