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


import java.io.IOException;

/**
 * Education
 */

public class Education {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("school_name")
  private String schoolName = null;

  @SerializedName("degree")
  private String degree = null;

  @SerializedName("field_of_study")
  private String fieldOfStudy = null;

  @SerializedName("start")
  private java.util.Date start = null;

  @SerializedName("end")
  private java.util.Date end = null;

  public Education id(Integer id) {
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

  public Education schoolName(String schoolName) {
    this.schoolName = schoolName;
    return this;
  }

   /**
   * Get schoolName
   * @return schoolName
  **/

  public String getSchoolName() {
    return schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }

  public Education degree(String degree) {
    this.degree = degree;
    return this;
  }

   /**
   * Get degree
   * @return degree
  **/

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public Education fieldOfStudy(String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
    return this;
  }

   /**
   * Get fieldOfStudy
   * @return fieldOfStudy
  **/

  public String getFieldOfStudy() {
    return fieldOfStudy;
  }

  public void setFieldOfStudy(String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
  }

  public Education start(java.util.Date start) {
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

  public Education end(java.util.Date end) {
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
    Education education = (Education) o;
    return Objects.equals(this.id, education.id) &&
        Objects.equals(this.schoolName, education.schoolName) &&
        Objects.equals(this.degree, education.degree) &&
        Objects.equals(this.fieldOfStudy, education.fieldOfStudy) &&
        Objects.equals(this.start, education.start) &&
        Objects.equals(this.end, education.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schoolName, degree, fieldOfStudy, start, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Education {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schoolName: ").append(toIndentedString(schoolName)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    fieldOfStudy: ").append(toIndentedString(fieldOfStudy)).append("\n");
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

