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
import com.fieldnation.models.License;
import com.fieldnation.models.ListEnvelope;
import java.util.ArrayList;
import java.util.List;

/**
 * Licenses
 */

public class Licenses {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("results")
  private List<License> results = null;

  public Licenses metadata(ListEnvelope metadata) {
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

  public Licenses results(List<License> results) {
    this.results = results;
    return this;
  }

  public Licenses addResultsItem(License resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<License>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<License> getResults() {
    return results;
  }

  public void setResults(List<License> results) {
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
    Licenses licenses = (Licenses) o;
    return Objects.equals(this.metadata, licenses.metadata) &&
        Objects.equals(this.results, licenses.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Licenses {\n");
    
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

