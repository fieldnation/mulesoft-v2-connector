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


import com.fieldnation.models.MinimalUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Route
 */

public class Route {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("declined")
  private Boolean declined = null;

  @SerializedName("assigned")
  private Boolean assigned = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("technician")
  private MinimalUser technician = null;

  @SerializedName("routed")
  private MinimalUser routed = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    DENY("deny"),
    
    ACCEPT("accept");

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

  public Route id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Route declined(Boolean declined) {
    this.declined = declined;
    return this;
  }

   /**
   * Get declined
   * @return declined
  **/

  public Boolean isDeclined() {
    return declined;
  }

  public void setDeclined(Boolean declined) {
    this.declined = declined;
  }

  public Route assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/

  public Boolean isAssigned() {
    return assigned;
  }

  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }

  public Route created(java.util.Date created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/

  public java.util.Date getCreated() {
    return created;
  }

  public void setCreated(java.util.Date created) {
    this.created = created;
  }

  public Route technician(MinimalUser technician) {
    this.technician = technician;
    return this;
  }

   /**
   * Get technician
   * @return technician
  **/

  public MinimalUser getTechnician() {
    return technician;
  }

  public void setTechnician(MinimalUser technician) {
    this.technician = technician;
  }

  public Route routed(MinimalUser routed) {
    this.routed = routed;
    return this;
  }

   /**
   * Get routed
   * @return routed
  **/

  public MinimalUser getRouted() {
    return routed;
  }

  public void setRouted(MinimalUser routed) {
    this.routed = routed;
  }

  public Route actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Route addActionsItem(ActionsEnum actionsItem) {
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
    Route route = (Route) o;
    return Objects.equals(this.id, route.id) &&
        Objects.equals(this.declined, route.declined) &&
        Objects.equals(this.assigned, route.assigned) &&
        Objects.equals(this.created, route.created) &&
        Objects.equals(this.technician, route.technician) &&
        Objects.equals(this.routed, route.routed) &&
        Objects.equals(this.actions, route.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, declined, assigned, created, technician, routed, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    declined: ").append(toIndentedString(declined)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    technician: ").append(toIndentedString(technician)).append("\n");
    sb.append("    routed: ").append(toIndentedString(routed)).append("\n");
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

