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
 * Swap
 */

public class Swap {
  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ACCEPT("accept"),
    
    DENY("deny"),
    
    DELETE("delete");

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

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACCEPTED("accepted"),
    
    DENIED("denied"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("from")
  private MinimalUser from = null;

  @SerializedName("to")
  private MinimalUser to = null;

  @SerializedName("requestor")
  private MinimalUser requestor = null;

  @SerializedName("actor")
  private MinimalUser actor = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("accepted")
  private java.util.Date accepted = null;

  @SerializedName("denied")
  private java.util.Date denied = null;

  public Swap actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Swap addActionsItem(ActionsEnum actionsItem) {
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

  public Swap id(Integer id) {
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

  public Swap description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Swap status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Swap from(MinimalUser from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/

  public MinimalUser getFrom() {
    return from;
  }

  public void setFrom(MinimalUser from) {
    this.from = from;
  }

  public Swap to(MinimalUser to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/

  public MinimalUser getTo() {
    return to;
  }

  public void setTo(MinimalUser to) {
    this.to = to;
  }

  public Swap requestor(MinimalUser requestor) {
    this.requestor = requestor;
    return this;
  }

   /**
   * Get requestor
   * @return requestor
  **/

  public MinimalUser getRequestor() {
    return requestor;
  }

  public void setRequestor(MinimalUser requestor) {
    this.requestor = requestor;
  }

  public Swap actor(MinimalUser actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/

  public MinimalUser getActor() {
    return actor;
  }

  public void setActor(MinimalUser actor) {
    this.actor = actor;
  }

  public Swap created(java.util.Date created) {
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

  public Swap accepted(java.util.Date accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * Get accepted
   * @return accepted
  **/

  public java.util.Date getAccepted() {
    return accepted;
  }

  public void setAccepted(java.util.Date accepted) {
    this.accepted = accepted;
  }

  public Swap denied(java.util.Date denied) {
    this.denied = denied;
    return this;
  }

   /**
   * Get denied
   * @return denied
  **/

  public java.util.Date getDenied() {
    return denied;
  }

  public void setDenied(java.util.Date denied) {
    this.denied = denied;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Swap swap = (Swap) o;
    return Objects.equals(this.actions, swap.actions) &&
        Objects.equals(this.id, swap.id) &&
        Objects.equals(this.description, swap.description) &&
        Objects.equals(this.status, swap.status) &&
        Objects.equals(this.from, swap.from) &&
        Objects.equals(this.to, swap.to) &&
        Objects.equals(this.requestor, swap.requestor) &&
        Objects.equals(this.actor, swap.actor) &&
        Objects.equals(this.created, swap.created) &&
        Objects.equals(this.accepted, swap.accepted) &&
        Objects.equals(this.denied, swap.denied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, id, description, status, from, to, requestor, actor, created, accepted, denied);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Swap {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    denied: ").append(toIndentedString(denied)).append("\n");
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

