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
import com.fieldnation.models.Finance;
import com.fieldnation.models.ListEnvelope;
import java.util.ArrayList;
import java.util.List;

/**
 * Finances
 */

public class Finances {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("results")
  private List<Finance> results = null;

  public Finances metadata(ListEnvelope metadata) {
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

  public Finances results(List<Finance> results) {
    this.results = results;
    return this;
  }

  public Finances addResultsItem(Finance resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Finance>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<Finance> getResults() {
    return results;
  }

  public void setResults(List<Finance> results) {
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
    Finances finances = (Finances) o;
    return Objects.equals(this.metadata, finances.metadata) &&
        Objects.equals(this.results, finances.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Finances {\n");
    
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

