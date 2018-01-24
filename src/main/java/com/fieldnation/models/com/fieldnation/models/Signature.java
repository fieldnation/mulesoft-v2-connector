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


import com.fieldnation.models.MinimalTask;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.TimeZone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Signature
 */

public class Signature {
  @SerializedName("name")
  private String name = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("closing_notes")
  private String closingNotes = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("worklog")
  private String worklog = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
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

  @SerializedName("task")
  private MinimalTask task = null;

  public Signature name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Signature format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public Signature closingNotes(String closingNotes) {
    this.closingNotes = closingNotes;
    return this;
  }

   /**
   * Get closingNotes
   * @return closingNotes
  **/

  public String getClosingNotes() {
    return closingNotes;
  }

  public void setClosingNotes(String closingNotes) {
    this.closingNotes = closingNotes;
  }

  public Signature data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Signature id(Integer id) {
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

  public Signature hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Signature author(MinimalUser author) {
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

  public Signature created(java.util.Date created) {
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

  public Signature worklog(String worklog) {
    this.worklog = worklog;
    return this;
  }

   /**
   * Get worklog
   * @return worklog
  **/

  public String getWorklog() {
    return worklog;
  }

  public void setWorklog(String worklog) {
    this.worklog = worklog;
  }

  public Signature timeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/

  public TimeZone getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  public Signature actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Signature addActionsItem(ActionsEnum actionsItem) {
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

  public Signature task(MinimalTask task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/

  public MinimalTask getTask() {
    return task;
  }

  public void setTask(MinimalTask task) {
    this.task = task;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.name, signature.name) &&
        Objects.equals(this.format, signature.format) &&
        Objects.equals(this.closingNotes, signature.closingNotes) &&
        Objects.equals(this.data, signature.data) &&
        Objects.equals(this.id, signature.id) &&
        Objects.equals(this.hash, signature.hash) &&
        Objects.equals(this.author, signature.author) &&
        Objects.equals(this.created, signature.created) &&
        Objects.equals(this.worklog, signature.worklog) &&
        Objects.equals(this.timeZone, signature.timeZone) &&
        Objects.equals(this.actions, signature.actions) &&
        Objects.equals(this.task, signature.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, format, closingNotes, data, id, hash, author, created, worklog, timeZone, actions, task);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    closingNotes: ").append(toIndentedString(closingNotes)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    worklog: ").append(toIndentedString(worklog)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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

