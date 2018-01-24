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
import com.fieldnation.models.WorkOrderRatingsAssignedProvider;
import com.fieldnation.models.WorkOrderRatingsBuyer;
import com.fieldnation.models.WorkOrderRatingsServiceCompany;

/**
 * WorkOrderRatings
 */

public class WorkOrderRatings {
  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("buyer")
  private WorkOrderRatingsBuyer buyer = null;

  @SerializedName("assigned_provider")
  private WorkOrderRatingsAssignedProvider assignedProvider = null;

  @SerializedName("service_company")
  private WorkOrderRatingsServiceCompany serviceCompany = null;

  public WorkOrderRatings correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public WorkOrderRatings buyer(WorkOrderRatingsBuyer buyer) {
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/

  public WorkOrderRatingsBuyer getBuyer() {
    return buyer;
  }

  public void setBuyer(WorkOrderRatingsBuyer buyer) {
    this.buyer = buyer;
  }

  public WorkOrderRatings assignedProvider(WorkOrderRatingsAssignedProvider assignedProvider) {
    this.assignedProvider = assignedProvider;
    return this;
  }

   /**
   * Get assignedProvider
   * @return assignedProvider
  **/

  public WorkOrderRatingsAssignedProvider getAssignedProvider() {
    return assignedProvider;
  }

  public void setAssignedProvider(WorkOrderRatingsAssignedProvider assignedProvider) {
    this.assignedProvider = assignedProvider;
  }

  public WorkOrderRatings serviceCompany(WorkOrderRatingsServiceCompany serviceCompany) {
    this.serviceCompany = serviceCompany;
    return this;
  }

   /**
   * Get serviceCompany
   * @return serviceCompany
  **/

  public WorkOrderRatingsServiceCompany getServiceCompany() {
    return serviceCompany;
  }

  public void setServiceCompany(WorkOrderRatingsServiceCompany serviceCompany) {
    this.serviceCompany = serviceCompany;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatings workOrderRatings = (WorkOrderRatings) o;
    return Objects.equals(this.correlationId, workOrderRatings.correlationId) &&
        Objects.equals(this.buyer, workOrderRatings.buyer) &&
        Objects.equals(this.assignedProvider, workOrderRatings.assignedProvider) &&
        Objects.equals(this.serviceCompany, workOrderRatings.serviceCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, buyer, assignedProvider, serviceCompany);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatings {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    assignedProvider: ").append(toIndentedString(assignedProvider)).append("\n");
    sb.append("    serviceCompany: ").append(toIndentedString(serviceCompany)).append("\n");
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

