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
 * Certification
 */

public class Certification {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("term_id")
  private Integer termId = null;

  @SerializedName("number")
  private String number = null;

  public Certification id(Integer id) {
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

  public Certification name(String name) {
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

  public Certification termId(Integer termId) {
    this.termId = termId;
    return this;
  }

   /**
   * Get termId
   * @return termId
  **/

  public Integer getTermId() {
    return termId;
  }

  public void setTermId(Integer termId) {
    this.termId = termId;
  }

  public Certification number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certification certification = (Certification) o;
    return Objects.equals(this.id, certification.id) &&
        Objects.equals(this.name, certification.name) &&
        Objects.equals(this.termId, certification.termId) &&
        Objects.equals(this.number, certification.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, termId, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

