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
import com.fieldnation.models.ProviderRatings;

/**
 * WorkOrderRatingsAssignedProviderOverall
 */

public class WorkOrderRatingsAssignedProviderOverall {
  @SerializedName("company")
  private ProviderRatings company = null;

  @SerializedName("marketplace")
  private ProviderRatings marketplace = null;

  public WorkOrderRatingsAssignedProviderOverall company(ProviderRatings company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public ProviderRatings getCompany() {
    return company;
  }

  public void setCompany(ProviderRatings company) {
    this.company = company;
  }

  public WorkOrderRatingsAssignedProviderOverall marketplace(ProviderRatings marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/

  public ProviderRatings getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(ProviderRatings marketplace) {
    this.marketplace = marketplace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatingsAssignedProviderOverall workOrderRatingsAssignedProviderOverall = (WorkOrderRatingsAssignedProviderOverall) o;
    return Objects.equals(this.company, workOrderRatingsAssignedProviderOverall.company) &&
        Objects.equals(this.marketplace, workOrderRatingsAssignedProviderOverall.marketplace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, marketplace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsAssignedProviderOverall {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
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

