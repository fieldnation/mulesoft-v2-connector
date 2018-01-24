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
 * TypeOfWork
 */

public class TypeOfWork {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("industry")
  private String industry = null;

  @SerializedName("name")
  private String name = null;

  public TypeOfWork id(Integer id) {
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

  public TypeOfWork industry(String industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/

  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public TypeOfWork name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfWork typeOfWork = (TypeOfWork) o;
    return Objects.equals(this.id, typeOfWork.id) &&
        Objects.equals(this.industry, typeOfWork.industry) &&
        Objects.equals(this.name, typeOfWork.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, industry, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfWork {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

