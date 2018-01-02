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
 * CompanyJobs
 */

public class CompanyJobs {
  @SerializedName("marketplace")
  private Integer marketplace = null;

  @SerializedName("my_company")
  private Integer myCompany = null;

  public CompanyJobs marketplace(Integer marketplace) {
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

  public CompanyJobs myCompany(Integer myCompany) {
    this.myCompany = myCompany;
    return this;
  }

   /**
   * Get myCompany
   * @return myCompany
  **/

  public Integer getMyCompany() {
    return myCompany;
  }

  public void setMyCompany(Integer myCompany) {
    this.myCompany = myCompany;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyJobs companyJobs = (CompanyJobs) o;
    return Objects.equals(this.marketplace, companyJobs.marketplace) &&
        Objects.equals(this.myCompany, companyJobs.myCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, myCompany);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyJobs {\n");
    
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    myCompany: ").append(toIndentedString(myCompany)).append("\n");
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

