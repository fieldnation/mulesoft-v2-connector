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


import com.fieldnation.models.Location;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoredLocations
 */

public class StoredLocations {
  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    CUSTOM("custom"),
    
    LOCATION("location"),
    
    REMOTE("remote");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("role")
  private String role = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit");

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
  private List<Location> results = null;

  public StoredLocations workOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
    return this;
  }

   /**
   * Get workOrderId
   * @return workOrderId
  **/

  public Integer getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
  }

  public StoredLocations mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/

  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public StoredLocations role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public StoredLocations actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public StoredLocations addActionsItem(ActionsEnum actionsItem) {
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

  public StoredLocations results(List<Location> results) {
    this.results = results;
    return this;
  }

  public StoredLocations addResultsItem(Location resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Location>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<Location> getResults() {
    return results;
  }

  public void setResults(List<Location> results) {
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
    StoredLocations storedLocations = (StoredLocations) o;
    return Objects.equals(this.workOrderId, storedLocations.workOrderId) &&
        Objects.equals(this.mode, storedLocations.mode) &&
        Objects.equals(this.role, storedLocations.role) &&
        Objects.equals(this.actions, storedLocations.actions) &&
        Objects.equals(this.results, storedLocations.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrderId, mode, role, actions, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredLocations {\n");
    
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

