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


import com.fieldnation.models.Attachment;
import com.fieldnation.models.MinimalTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AttachmentFolder
 */

public class AttachmentFolder {
  @SerializedName("id")
  private Integer id = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SLOT("slot"),
    
    DOCUMENT("document");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("min_files")
  private Integer minFiles = null;

  @SerializedName("max_files")
  private Integer maxFiles = null;

  @SerializedName("min_bytes")
  private Integer minBytes = null;

  @SerializedName("max_bytes")
  private Integer maxBytes = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("results")
  private List<Attachment> results = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    UPLOAD("upload"),
    
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

  public AttachmentFolder id(Integer id) {
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

  public AttachmentFolder type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AttachmentFolder minFiles(Integer minFiles) {
    this.minFiles = minFiles;
    return this;
  }

   /**
   * Get minFiles
   * @return minFiles
  **/

  public Integer getMinFiles() {
    return minFiles;
  }

  public void setMinFiles(Integer minFiles) {
    this.minFiles = minFiles;
  }

  public AttachmentFolder maxFiles(Integer maxFiles) {
    this.maxFiles = maxFiles;
    return this;
  }

   /**
   * Get maxFiles
   * @return maxFiles
  **/

  public Integer getMaxFiles() {
    return maxFiles;
  }

  public void setMaxFiles(Integer maxFiles) {
    this.maxFiles = maxFiles;
  }

  public AttachmentFolder minBytes(Integer minBytes) {
    this.minBytes = minBytes;
    return this;
  }

   /**
   * Get minBytes
   * @return minBytes
  **/

  public Integer getMinBytes() {
    return minBytes;
  }

  public void setMinBytes(Integer minBytes) {
    this.minBytes = minBytes;
  }

  public AttachmentFolder maxBytes(Integer maxBytes) {
    this.maxBytes = maxBytes;
    return this;
  }

   /**
   * Get maxBytes
   * @return maxBytes
  **/

  public Integer getMaxBytes() {
    return maxBytes;
  }

  public void setMaxBytes(Integer maxBytes) {
    this.maxBytes = maxBytes;
  }

  public AttachmentFolder name(String name) {
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

  public AttachmentFolder results(List<Attachment> results) {
    this.results = results;
    return this;
  }

  public AttachmentFolder addResultsItem(Attachment resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Attachment>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<Attachment> getResults() {
    return results;
  }

  public void setResults(List<Attachment> results) {
    this.results = results;
  }

  public AttachmentFolder actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public AttachmentFolder addActionsItem(ActionsEnum actionsItem) {
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

  public AttachmentFolder task(MinimalTask task) {
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
    AttachmentFolder attachmentFolder = (AttachmentFolder) o;
    return Objects.equals(this.id, attachmentFolder.id) &&
        Objects.equals(this.type, attachmentFolder.type) &&
        Objects.equals(this.minFiles, attachmentFolder.minFiles) &&
        Objects.equals(this.maxFiles, attachmentFolder.maxFiles) &&
        Objects.equals(this.minBytes, attachmentFolder.minBytes) &&
        Objects.equals(this.maxBytes, attachmentFolder.maxBytes) &&
        Objects.equals(this.name, attachmentFolder.name) &&
        Objects.equals(this.results, attachmentFolder.results) &&
        Objects.equals(this.actions, attachmentFolder.actions) &&
        Objects.equals(this.task, attachmentFolder.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, minFiles, maxFiles, minBytes, maxBytes, name, results, actions, task);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentFolder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    minFiles: ").append(toIndentedString(minFiles)).append("\n");
    sb.append("    maxFiles: ").append(toIndentedString(maxFiles)).append("\n");
    sb.append("    minBytes: ").append(toIndentedString(minBytes)).append("\n");
    sb.append("    maxBytes: ").append(toIndentedString(maxBytes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

