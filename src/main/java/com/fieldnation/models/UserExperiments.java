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
import com.fieldnation.models.UserExperimentsResults;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserExperiments
 */

public class UserExperiments {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("results")
  private List<UserExperimentsResults> results = null;

  public UserExperiments metadata(ListEnvelope metadata) {
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

  public UserExperiments actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public UserExperiments addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public UserExperiments results(List<UserExperimentsResults> results) {
    this.results = results;
    return this;
  }

  public UserExperiments addResultsItem(UserExperimentsResults resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<UserExperimentsResults>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<UserExperimentsResults> getResults() {
    return results;
  }

  public void setResults(List<UserExperimentsResults> results) {
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
    UserExperiments userExperiments = (UserExperiments) o;
    return Objects.equals(this.metadata, userExperiments.metadata) &&
        Objects.equals(this.actions, userExperiments.actions) &&
        Objects.equals(this.results, userExperiments.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, actions, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExperiments {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

