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


import com.fieldnation.models.UserJobsTypeOfWork;
import java.io.IOException;

/**
 * UserJobs
 */

public class UserJobs {
  @SerializedName("marketplace")
  private Integer marketplace = null;

  @SerializedName("company")
  private Integer company = null;

  @SerializedName("type_of_work")
  private UserJobsTypeOfWork typeOfWork = null;

  public UserJobs marketplace(Integer marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/

  public Integer getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(Integer marketplace) {
    this.marketplace = marketplace;
  }

  public UserJobs company(Integer company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public Integer getCompany() {
    return company;
  }

  public void setCompany(Integer company) {
    this.company = company;
  }

  public UserJobs typeOfWork(UserJobsTypeOfWork typeOfWork) {
    this.typeOfWork = typeOfWork;
    return this;
  }

   /**
   * Get typeOfWork
   * @return typeOfWork
  **/

  public UserJobsTypeOfWork getTypeOfWork() {
    return typeOfWork;
  }

  public void setTypeOfWork(UserJobsTypeOfWork typeOfWork) {
    this.typeOfWork = typeOfWork;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserJobs userJobs = (UserJobs) o;
    return Objects.equals(this.marketplace, userJobs.marketplace) &&
        Objects.equals(this.company, userJobs.company) &&
        Objects.equals(this.typeOfWork, userJobs.typeOfWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, company, typeOfWork);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserJobs {\n");
    
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    typeOfWork: ").append(toIndentedString(typeOfWork)).append("\n");
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

