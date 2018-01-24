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
import com.fieldnation.models.ListEnvelope;
import com.fieldnation.models.Task;
import java.util.ArrayList;
import java.util.List;

/**
 * Tasks
 */

public class Tasks {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("results")
  private List<Task> results = null;

  public Tasks metadata(ListEnvelope metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public ListEnvelope getMetadata() {
    return metadata;
  }

  public void setMetadata(ListEnvelope metadata) {
    this.metadata = metadata;
  }

  public Tasks results(List<Task> results) {
    this.results = results;
    return this;
  }

  public Tasks addResultsItem(Task resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Task>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<Task> getResults() {
    return results;
  }

  public void setResults(List<Task> results) {
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
    Tasks tasks = (Tasks) o;
    return Objects.equals(this.metadata, tasks.metadata) &&
        Objects.equals(this.results, tasks.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tasks {\n");
    
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

