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
 * UserCompanyJobs
 */

public class UserCompanyJobs {
  @SerializedName("marketplace")
  private Integer marketplace = null;

  @SerializedName("company")
  private Integer company = null;

  public UserCompanyJobs marketplace(Integer marketplace) {
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

  public UserCompanyJobs company(Integer company) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCompanyJobs userCompanyJobs = (UserCompanyJobs) o;
    return Objects.equals(this.marketplace, userCompanyJobs.marketplace) &&
        Objects.equals(this.company, userCompanyJobs.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCompanyJobs {\n");
    
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

