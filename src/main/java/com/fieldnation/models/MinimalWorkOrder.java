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


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MinimalWorkOrder
 */

public class MinimalWorkOrder {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("title")
  private String title = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    SET_NETWORK("set_network"),
    
    WITHDRAW_REQUEST("withdraw_request"),
    
    CONFIRM("confirm"),
    
    MESSAGING("messaging"),
    
    MANAGED("managed"),
    
    SET_MANAGED("set_managed"),
    
    REPORT_A_PROBLEM("report_a_problem"),
    
    VIEW_PROBLEM("view_problem"),
    
    MAP("map"),
    
    CLOSING_NOTES("closing_notes"),
    
    SEARCH_PROVIDER("search-provider"),
    
    HISTORY("history"),
    
    COPY("copy"),
    
    PRINT("print"),
    
    OVERVIEW("overview"),
    
    TASKS("tasks"),
    
    COUNTER_OFFER("counter_offer"),
    
    APPLY_TAGS("apply_tags"),
    
    PUBLISH("publish"),
    
    ROUTE("route"),
    
    DELETE("delete"),
    
    HOLD("hold"),
    
    CANCEL("cancel"),
    
    UNPUBLISH("unpublish"),
    
    REVERT("revert"),
    
    APPROVE("approve"),
    
    COMPLETE("complete"),
    
    INCOMPLETE("incomplete"),
    
    REQUEST("request"),
    
    EDIT("edit"),
    
    UNAPPROVE("unapprove"),
    
    CREATE_TEMPLATE("create_template"),
    
    PAID("paid"),
    
    UNPAID("unpaid"),
    
    SERVICE_TYPES("service_types");

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

  public MinimalWorkOrder id(Integer id) {
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

  public MinimalWorkOrder title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MinimalWorkOrder actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public MinimalWorkOrder addActionsItem(ActionsEnum actionsItem) {
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
    MinimalWorkOrder minimalWorkOrder = (MinimalWorkOrder) o;
    return Objects.equals(this.id, minimalWorkOrder.id) &&
        Objects.equals(this.title, minimalWorkOrder.title) &&
        Objects.equals(this.actions, minimalWorkOrder.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimalWorkOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

