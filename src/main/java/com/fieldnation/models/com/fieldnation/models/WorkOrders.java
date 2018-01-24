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
import com.fieldnation.models.WorkOrder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrders
 */

public class WorkOrders {
  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("results")
  private List<WorkOrder> results = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    FEEDBACK("feedback"),
    
    PAYMENT_LINK("payment_link"),
    
    ADD_TYPE_OF_WORK("add_type_of_work"),
    
    REMIND("remind"),
    
    CREATE("create"),
    
    IMPORT("import"),
    
    HIGHLIGHT_PROBLEMS("highlight_problems"),
    
    PUBLISH_STATS("publish_stats"),
    
    ADVANCED_DATE_FILTERING("advanced_date_filtering"),
    
    EDIT("edit"),
    
    PUBLISH("publish"),
    
    REVERT("revert"),
    
    CANCEL("cancel"),
    
    BUNDLE("bundle"),
    
    UNBUNDLE("unbundle"),
    
    DISPATCH("dispatch"),
    
    MESSAGE("message"),
    
    HOLD("hold"),
    
    DOWNLOAD_ATTACHMENTS("download_attachments"),
    
    APPROVE("approve"),
    
    AUTO_ASSIGN("auto_assign"),
    
    LOCATION_FILTERING("location_filtering");

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

  public WorkOrders userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public WorkOrders metadata(ListEnvelope metadata) {
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

  public WorkOrders results(List<WorkOrder> results) {
    this.results = results;
    return this;
  }

  public WorkOrders addResultsItem(WorkOrder resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<WorkOrder>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<WorkOrder> getResults() {
    return results;
  }

  public void setResults(List<WorkOrder> results) {
    this.results = results;
  }

  public WorkOrders actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public WorkOrders addActionsItem(ActionsEnum actionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrders workOrders = (WorkOrders) o;
    return Objects.equals(this.userId, workOrders.userId) &&
        Objects.equals(this.metadata, workOrders.metadata) &&
        Objects.equals(this.results, workOrders.results) &&
        Objects.equals(this.actions, workOrders.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, metadata, results, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrders {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

