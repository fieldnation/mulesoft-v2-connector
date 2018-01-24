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
import com.fieldnation.models.WorkOrderOverviewValuesClientRequestsMetadata;
import com.fieldnation.models.WorkOrderOverviewValuesClients;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrderOverviewValuesClientRequests
 */

public class WorkOrderOverviewValuesClientRequests {
  @SerializedName("metadata")
  private WorkOrderOverviewValuesClientRequestsMetadata metadata = null;

  @SerializedName("results")
  private List<WorkOrderOverviewValuesClients> results = null;

  public WorkOrderOverviewValuesClientRequests metadata(WorkOrderOverviewValuesClientRequestsMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public WorkOrderOverviewValuesClientRequestsMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(WorkOrderOverviewValuesClientRequestsMetadata metadata) {
    this.metadata = metadata;
  }

  public WorkOrderOverviewValuesClientRequests results(List<WorkOrderOverviewValuesClients> results) {
    this.results = results;
    return this;
  }

  public WorkOrderOverviewValuesClientRequests addResultsItem(WorkOrderOverviewValuesClients resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<WorkOrderOverviewValuesClients> getResults() {
    return results;
  }

  public void setResults(List<WorkOrderOverviewValuesClients> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderOverviewValuesClientRequests workOrderOverviewValuesClientRequests = (WorkOrderOverviewValuesClientRequests) o;
    return Objects.equals(this.metadata, workOrderOverviewValuesClientRequests.metadata) &&
        Objects.equals(this.results, workOrderOverviewValuesClientRequests.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverviewValuesClientRequests {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

