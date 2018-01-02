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


import com.fieldnation.models.ListEnvelope;
import com.fieldnation.models.SavedCreditCard;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SavedCreditCards
 */

public class SavedCreditCards {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("results")
  private List<SavedCreditCard> results = null;

  public SavedCreditCards metadata(ListEnvelope metadata) {
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

  public SavedCreditCards results(List<SavedCreditCard> results) {
    this.results = results;
    return this;
  }

  public SavedCreditCards addResultsItem(SavedCreditCard resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<SavedCreditCard>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<SavedCreditCard> getResults() {
    return results;
  }

  public void setResults(List<SavedCreditCard> results) {
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
    SavedCreditCards savedCreditCards = (SavedCreditCards) o;
    return Objects.equals(this.metadata, savedCreditCards.metadata) &&
        Objects.equals(this.results, savedCreditCards.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedCreditCards {\n");
    
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

