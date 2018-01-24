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


import com.fieldnation.models.CheckInOutTimeLog;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.ProblemResolution;
import com.fieldnation.models.ProblemType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 */

public class Problem {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private ProblemType type = null;

  @SerializedName("comments")
  private String comments = null;

  /**
   * Gets or Sets contact
   */
  @JsonAdapter(ContactEnum.Adapter.class)
  public enum ContactEnum {
    SUPPORT("support"),
    
    BUYER("buyer"),
    
    PROVIDER("provider"),
    
    ALL("all");

    private String value;

    ContactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContactEnum fromValue(String text) {
      for (ContactEnum b : ContactEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContactEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContactEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contact")
  private ContactEnum contact = null;

  @SerializedName("escalate")
  private Boolean escalate = null;

  @SerializedName("use_provider")
  private Boolean useProvider = null;

  @SerializedName("only_company_can_mark_resolved")
  private Boolean onlyCompanyCanMarkResolved = null;

  @SerializedName("resolution")
  private ProblemResolution resolution = null;

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("message")
  private CheckInOutTimeLog message = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
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

  public Problem id(Integer id) {
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

  public Problem type(ProblemType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public ProblemType getType() {
    return type;
  }

  public void setType(ProblemType type) {
    this.type = type;
  }

  public Problem comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Problem contact(ContactEnum contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/

  public ContactEnum getContact() {
    return contact;
  }

  public void setContact(ContactEnum contact) {
    this.contact = contact;
  }

  public Problem escalate(Boolean escalate) {
    this.escalate = escalate;
    return this;
  }

   /**
   * Get escalate
   * @return escalate
  **/

  public Boolean isEscalate() {
    return escalate;
  }

  public void setEscalate(Boolean escalate) {
    this.escalate = escalate;
  }

  public Problem useProvider(Boolean useProvider) {
    this.useProvider = useProvider;
    return this;
  }

   /**
   * Get useProvider
   * @return useProvider
  **/

  public Boolean isUseProvider() {
    return useProvider;
  }

  public void setUseProvider(Boolean useProvider) {
    this.useProvider = useProvider;
  }

  public Problem onlyCompanyCanMarkResolved(Boolean onlyCompanyCanMarkResolved) {
    this.onlyCompanyCanMarkResolved = onlyCompanyCanMarkResolved;
    return this;
  }

   /**
   * Get onlyCompanyCanMarkResolved
   * @return onlyCompanyCanMarkResolved
  **/

  public Boolean isOnlyCompanyCanMarkResolved() {
    return onlyCompanyCanMarkResolved;
  }

  public void setOnlyCompanyCanMarkResolved(Boolean onlyCompanyCanMarkResolved) {
    this.onlyCompanyCanMarkResolved = onlyCompanyCanMarkResolved;
  }

  public Problem resolution(ProblemResolution resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/

  public ProblemResolution getResolution() {
    return resolution;
  }

  public void setResolution(ProblemResolution resolution) {
    this.resolution = resolution;
  }

  public Problem author(MinimalUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/

  public MinimalUser getAuthor() {
    return author;
  }

  public void setAuthor(MinimalUser author) {
    this.author = author;
  }

  public Problem created(java.util.Date created) {
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

  public Problem message(CheckInOutTimeLog message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/

  public CheckInOutTimeLog getMessage() {
    return message;
  }

  public void setMessage(CheckInOutTimeLog message) {
    this.message = message;
  }

  public Problem actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Problem addActionsItem(ActionsEnum actionsItem) {
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
    Problem problem = (Problem) o;
    return Objects.equals(this.id, problem.id) &&
        Objects.equals(this.type, problem.type) &&
        Objects.equals(this.comments, problem.comments) &&
        Objects.equals(this.contact, problem.contact) &&
        Objects.equals(this.escalate, problem.escalate) &&
        Objects.equals(this.useProvider, problem.useProvider) &&
        Objects.equals(this.onlyCompanyCanMarkResolved, problem.onlyCompanyCanMarkResolved) &&
        Objects.equals(this.resolution, problem.resolution) &&
        Objects.equals(this.author, problem.author) &&
        Objects.equals(this.created, problem.created) &&
        Objects.equals(this.message, problem.message) &&
        Objects.equals(this.actions, problem.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, comments, contact, escalate, useProvider, onlyCompanyCanMarkResolved, resolution, author, created, message, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    escalate: ").append(toIndentedString(escalate)).append("\n");
    sb.append("    useProvider: ").append(toIndentedString(useProvider)).append("\n");
    sb.append("    onlyCompanyCanMarkResolved: ").append(toIndentedString(onlyCompanyCanMarkResolved)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

