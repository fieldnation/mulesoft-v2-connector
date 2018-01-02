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


import com.fieldnation.models.Coords;
import com.fieldnation.models.MinimalTask;
import com.fieldnation.models.MinimalUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Attachment
 */

public class Attachment {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("folder_id")
  private Integer folderId = null;

  @SerializedName("file")
  private java.io.File file = null;

  @SerializedName("coords")
  private Coords coords = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("reviewer")
  private MinimalUser reviewer = null;

  @SerializedName("notes")
  private String notes = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    APPROVED("approved"),
    
    DENIED("denied");

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

  @SerializedName("status_description")
  private String statusDescription = null;

  @SerializedName("show_before_assignment")
  private Boolean showBeforeAssignment = null;

  @SerializedName("task")
  private MinimalTask task = null;

  @SerializedName("reviewed")
  private java.util.Date reviewed = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    VIEW("view"),
    
    VISIBILITY("visibility"),
    
    MAKE_PUBLIC("make_public"),
    
    MAKE_PRIVATE("make_private"),
    
    NOTES("notes"),
    
    EDIT("edit"),
    
    DELETE("delete"),
    
    APPROVE("approve"),
    
    DENY("deny"),
    
    REOPEN("reopen");

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

  public Attachment id(Integer id) {
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

  public Attachment folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/

  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public Attachment file(java.io.File file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/

  public java.io.File getFile() {
    return file;
  }

  public void setFile(java.io.File file) {
    this.file = file;
  }

  public Attachment coords(Coords coords) {
    this.coords = coords;
    return this;
  }

   /**
   * Get coords
   * @return coords
  **/

  public Coords getCoords() {
    return coords;
  }

  public void setCoords(Coords coords) {
    this.coords = coords;
  }

  public Attachment created(java.util.Date created) {
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

  public Attachment author(MinimalUser author) {
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

  public Attachment reviewer(MinimalUser reviewer) {
    this.reviewer = reviewer;
    return this;
  }

   /**
   * Get reviewer
   * @return reviewer
  **/

  public MinimalUser getReviewer() {
    return reviewer;
  }

  public void setReviewer(MinimalUser reviewer) {
    this.reviewer = reviewer;
  }

  public Attachment notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Attachment status(StatusEnum status) {
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

  public Attachment statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/

  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public Attachment showBeforeAssignment(Boolean showBeforeAssignment) {
    this.showBeforeAssignment = showBeforeAssignment;
    return this;
  }

   /**
   * Get showBeforeAssignment
   * @return showBeforeAssignment
  **/

  public Boolean isShowBeforeAssignment() {
    return showBeforeAssignment;
  }

  public void setShowBeforeAssignment(Boolean showBeforeAssignment) {
    this.showBeforeAssignment = showBeforeAssignment;
  }

  public Attachment task(MinimalTask task) {
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

  public Attachment reviewed(java.util.Date reviewed) {
    this.reviewed = reviewed;
    return this;
  }

   /**
   * Get reviewed
   * @return reviewed
  **/

  public java.util.Date getReviewed() {
    return reviewed;
  }

  public void setReviewed(java.util.Date reviewed) {
    this.reviewed = reviewed;
  }

  public Attachment actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Attachment addActionsItem(ActionsEnum actionsItem) {
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
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.folderId, attachment.folderId) &&
        Objects.equals(this.file, attachment.file) &&
        Objects.equals(this.coords, attachment.coords) &&
        Objects.equals(this.created, attachment.created) &&
        Objects.equals(this.author, attachment.author) &&
        Objects.equals(this.reviewer, attachment.reviewer) &&
        Objects.equals(this.notes, attachment.notes) &&
        Objects.equals(this.status, attachment.status) &&
        Objects.equals(this.statusDescription, attachment.statusDescription) &&
        Objects.equals(this.showBeforeAssignment, attachment.showBeforeAssignment) &&
        Objects.equals(this.task, attachment.task) &&
        Objects.equals(this.reviewed, attachment.reviewed) &&
        Objects.equals(this.actions, attachment.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, folderId, file, coords, created, author, reviewer, notes, status, statusDescription, showBeforeAssignment, task, reviewed, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    showBeforeAssignment: ").append(toIndentedString(showBeforeAssignment)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    reviewed: ").append(toIndentedString(reviewed)).append("\n");
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

