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
import com.fieldnation.models.MinimalMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MinimalMessages
 */

public class MinimalMessages {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("unread")
  private Integer unread = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ADD("add"),
    
    MESSAGEPROVIDER("messageProvider"),
    
    MESSAGECOMPANY("messageCompany"),
    
    STAFFNOTE("staffNote");

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

  @SerializedName("results")
  private List<MinimalMessage> results = null;

  @SerializedName("sum")
  private Integer sum = null;

  @SerializedName("problem_reported")
  private Boolean problemReported = null;

  public MinimalMessages metadata(ListEnvelope metadata) {
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

  public MinimalMessages unread(Integer unread) {
    this.unread = unread;
    return this;
  }

   /**
   * Get unread
   * @return unread
  **/

  public Integer getUnread() {
    return unread;
  }

  public void setUnread(Integer unread) {
    this.unread = unread;
  }

  public MinimalMessages actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public MinimalMessages addActionsItem(ActionsEnum actionsItem) {
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

  public MinimalMessages results(List<MinimalMessage> results) {
    this.results = results;
    return this;
  }

  public MinimalMessages addResultsItem(MinimalMessage resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<MinimalMessage>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<MinimalMessage> getResults() {
    return results;
  }

  public void setResults(List<MinimalMessage> results) {
    this.results = results;
  }

  public MinimalMessages sum(Integer sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/

  public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  public MinimalMessages problemReported(Boolean problemReported) {
    this.problemReported = problemReported;
    return this;
  }

   /**
   * Get problemReported
   * @return problemReported
  **/

  public Boolean isProblemReported() {
    return problemReported;
  }

  public void setProblemReported(Boolean problemReported) {
    this.problemReported = problemReported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimalMessages minimalMessages = (MinimalMessages) o;
    return Objects.equals(this.metadata, minimalMessages.metadata) &&
        Objects.equals(this.unread, minimalMessages.unread) &&
        Objects.equals(this.actions, minimalMessages.actions) &&
        Objects.equals(this.results, minimalMessages.results) &&
        Objects.equals(this.sum, minimalMessages.sum) &&
        Objects.equals(this.problemReported, minimalMessages.problemReported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, unread, actions, results, sum, problemReported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimalMessages {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    problemReported: ").append(toIndentedString(problemReported)).append("\n");
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

