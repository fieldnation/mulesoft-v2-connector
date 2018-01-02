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
import com.fieldnation.models.Problem;
import com.fieldnation.models.ProblemType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Problems
 */

public class Problems {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("results")
  private List<Problem> results = null;

  @SerializedName("active")
  private Problem active = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ADD("add"),
    
    RESOLVE("resolve"),
    
    EDIT("edit"),
    
    DELETE("delete"),
    
    REOPEN("reopen"),
    
    VIEW_MESSAGE("view_message");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionsEnum fromValue(String text) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  @SerializedName("types")
  private List<ProblemType> types = null;

  public Problems metadata(ListEnvelope metadata) {
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

  public Problems correlationId(String correlationId) {
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

  public Problems results(List<Problem> results) {
    this.results = results;
    return this;
  }

  public Problems addResultsItem(Problem resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Problem>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<Problem> getResults() {
    return results;
  }

  public void setResults(List<Problem> results) {
    this.results = results;
  }

  public Problems active(Problem active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/

  public Problem getActive() {
    return active;
  }

  public void setActive(Problem active) {
    this.active = active;
  }

  public Problems actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Problems addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }

  public Problems types(List<ProblemType> types) {
    this.types = types;
    return this;
  }

  public Problems addTypesItem(ProblemType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<ProblemType>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/

  public List<ProblemType> getTypes() {
    return types;
  }

  public void setTypes(List<ProblemType> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problems problems = (Problems) o;
    return Objects.equals(this.metadata, problems.metadata) &&
        Objects.equals(this.correlationId, problems.correlationId) &&
        Objects.equals(this.results, problems.results) &&
        Objects.equals(this.active, problems.active) &&
        Objects.equals(this.actions, problems.actions) &&
        Objects.equals(this.types, problems.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, correlationId, results, active, actions, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problems {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

