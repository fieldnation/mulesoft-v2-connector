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
import com.fieldnation.models.WorkOrderOverviewCompany;
import com.fieldnation.models.WorkOrderOverviewTypeOfWork;

/**
 * WorkOrderOverview
 */

public class WorkOrderOverview {
  @SerializedName("type_of_work")
  private WorkOrderOverviewTypeOfWork typeOfWork = null;

  @SerializedName("company")
  private WorkOrderOverviewCompany company = null;

  public WorkOrderOverview typeOfWork(WorkOrderOverviewTypeOfWork typeOfWork) {
    this.typeOfWork = typeOfWork;
    return this;
  }

   /**
   * Get typeOfWork
   * @return typeOfWork
  **/

  public WorkOrderOverviewTypeOfWork getTypeOfWork() {
    return typeOfWork;
  }

  public void setTypeOfWork(WorkOrderOverviewTypeOfWork typeOfWork) {
    this.typeOfWork = typeOfWork;
  }

  public WorkOrderOverview company(WorkOrderOverviewCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public WorkOrderOverviewCompany getCompany() {
    return company;
  }

  public void setCompany(WorkOrderOverviewCompany company) {
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
    WorkOrderOverview workOrderOverview = (WorkOrderOverview) o;
    return Objects.equals(this.typeOfWork, workOrderOverview.typeOfWork) &&
        Objects.equals(this.company, workOrderOverview.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfWork, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverview {\n");
    
    sb.append("    typeOfWork: ").append(toIndentedString(typeOfWork)).append("\n");
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

