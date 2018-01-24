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
import com.fieldnation.models.HoldCategory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hold
 */

public class Hold {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("type")
  private HoldCategory type = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ACKNOWLEDGE("acknowledge"),
    
    DELETE("delete"),
    
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

  @SerializedName("acknowledgment")
  private Acknowledgment acknowledgment = null;

  public Hold id(Integer id) {
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

  public Hold reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Hold type(HoldCategory type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public HoldCategory getType() {
    return type;
  }

  public void setType(HoldCategory type) {
    this.type = type;
  }

  public Hold actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Hold addActionsItem(ActionsEnum actionsItem) {
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

  public Hold acknowledgment(Acknowledgment acknowledgment) {
    this.acknowledgment = acknowledgment;
    return this;
  }

   /**
   * Get acknowledgment
   * @return acknowledgment
  **/

  public Acknowledgment getAcknowledgment() {
    return acknowledgment;
  }

  public void setAcknowledgment(Acknowledgment acknowledgment) {
    this.acknowledgment = acknowledgment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hold hold = (Hold) o;
    return Objects.equals(this.id, hold.id) &&
        Objects.equals(this.reason, hold.reason) &&
        Objects.equals(this.type, hold.type) &&
        Objects.equals(this.actions, hold.actions) &&
        Objects.equals(this.acknowledgment, hold.acknowledgment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reason, type, actions, acknowledgment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hold {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    acknowledgment: ").append(toIndentedString(acknowledgment)).append("\n");
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

