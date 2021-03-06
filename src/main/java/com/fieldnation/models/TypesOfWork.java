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
import com.fieldnation.models.TypeOfWork;
import java.util.ArrayList;
import java.util.List;

/**
 * TypesOfWork
 */

public class TypesOfWork {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("results")
  private List<TypeOfWork> results = null;

  public TypesOfWork metadata(ListEnvelope metadata) {
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

  public TypesOfWork results(List<TypeOfWork> results) {
    this.results = results;
    return this;
  }

  public TypesOfWork addResultsItem(TypeOfWork resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<TypeOfWork>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<TypeOfWork> getResults() {
    return results;
  }

  public void setResults(List<TypeOfWork> results) {
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
    TypesOfWork typesOfWork = (TypesOfWork) o;
    return Objects.equals(this.metadata, typesOfWork.metadata) &&
        Objects.equals(this.results, typesOfWork.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesOfWork {\n");
    
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

