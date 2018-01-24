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
import com.fieldnation.models.ThreadMessage;
import java.util.ArrayList;
import java.util.List;

/**
 * Threads
 */

public class Threads {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SuppressWarnings("rawtypes")
  @SerializedName("lists")
  private List<List> lists = null;

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("results")
  private List<ThreadMessage> results = null;

  public Threads metadata(ListEnvelope metadata) {
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

  public Threads lists(@SuppressWarnings("rawtypes") List<List> lists) {
    this.lists = lists;
    return this;
  }

  @SuppressWarnings({ "rawtypes" })
public Threads addListsItem(List listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<List>();
    }
    this.lists.add(listsItem);
    return this;
  }

   /**
   * Get lists
   * @return lists
  **/

  @SuppressWarnings("rawtypes")
public List<List> getLists() {
    return lists;
  }

  @SuppressWarnings("rawtypes")
public void setLists(List<List> lists) {
    this.lists = lists;
  }

  public Threads actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Threads addActionsItem(String actionsItem) {
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

  public Threads correlationId(String correlationId) {
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

  public Threads results(List<ThreadMessage> results) {
    this.results = results;
    return this;
  }

  public Threads addResultsItem(ThreadMessage resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ThreadMessage>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<ThreadMessage> getResults() {
    return results;
  }

  public void setResults(List<ThreadMessage> results) {
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
    Threads threads = (Threads) o;
    return Objects.equals(this.metadata, threads.metadata) &&
        Objects.equals(this.lists, threads.lists) &&
        Objects.equals(this.actions, threads.actions) &&
        Objects.equals(this.correlationId, threads.correlationId) &&
        Objects.equals(this.results, threads.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, lists, actions, correlationId, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Threads {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

