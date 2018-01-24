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
import com.fieldnation.models.Template;
import java.util.ArrayList;
import java.util.List;

/**
 * Templates
 */

public class Templates {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("results")
  private List<Template> results = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  public Templates metadata(ListEnvelope metadata) {
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

  public Templates actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Templates addActionsItem(String actionsItem) {
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

  public Templates results(List<Template> results) {
    this.results = results;
    return this;
  }

  public Templates addResultsItem(Template resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Template>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<Template> getResults() {
    return results;
  }

  public void setResults(List<Template> results) {
    this.results = results;
  }

  public Templates correlationId(String correlationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Templates templates = (Templates) o;
    return Objects.equals(this.metadata, templates.metadata) &&
        Objects.equals(this.actions, templates.actions) &&
        Objects.equals(this.results, templates.results) &&
        Objects.equals(this.correlationId, templates.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, actions, results, correlationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templates {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

