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
import com.fieldnation.models.WorkOrderOverviewTypeOfWorkCompany;
import com.fieldnation.models.WorkOrderOverviewTypeOfWorkMarketplace;

/**
 * WorkOrderOverviewTypeOfWork
 */

public class WorkOrderOverviewTypeOfWork {
  @SerializedName("company")
  private WorkOrderOverviewTypeOfWorkCompany company = null;

  @SerializedName("marketplace")
  private WorkOrderOverviewTypeOfWorkMarketplace marketplace = null;

  public WorkOrderOverviewTypeOfWork company(WorkOrderOverviewTypeOfWorkCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public WorkOrderOverviewTypeOfWorkCompany getCompany() {
    return company;
  }

  public void setCompany(WorkOrderOverviewTypeOfWorkCompany company) {
    this.company = company;
  }

  public WorkOrderOverviewTypeOfWork marketplace(WorkOrderOverviewTypeOfWorkMarketplace marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/

  public WorkOrderOverviewTypeOfWorkMarketplace getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(WorkOrderOverviewTypeOfWorkMarketplace marketplace) {
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
    WorkOrderOverviewTypeOfWork workOrderOverviewTypeOfWork = (WorkOrderOverviewTypeOfWork) o;
    return Objects.equals(this.company, workOrderOverviewTypeOfWork.company) &&
        Objects.equals(this.marketplace, workOrderOverviewTypeOfWork.marketplace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, marketplace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverviewTypeOfWork {\n");
    
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

