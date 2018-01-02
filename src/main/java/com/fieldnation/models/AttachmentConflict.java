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
 * AttachmentConflict
 */

public class AttachmentConflict {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNIQUE("unique"),
    
    DUPLICATE("duplicate");

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

  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  @SerializedName("conflicts")
  private List<Integer> conflicts = null;

  public AttachmentConflict status(StatusEnum status) {
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

  public AttachmentConflict workOrderId(Integer workOrderId) {
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

  public AttachmentConflict conflicts(List<Integer> conflicts) {
    this.conflicts = conflicts;
    return this;
  }

  public AttachmentConflict addConflictsItem(Integer conflictsItem) {
    if (this.conflicts == null) {
      this.conflicts = new ArrayList<Integer>();
    }
    this.conflicts.add(conflictsItem);
    return this;
  }

   /**
   * Get conflicts
   * @return conflicts
  **/

  public List<Integer> getConflicts() {
    return conflicts;
  }

  public void setConflicts(List<Integer> conflicts) {
    this.conflicts = conflicts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentConflict attachmentConflict = (AttachmentConflict) o;
    return Objects.equals(this.status, attachmentConflict.status) &&
        Objects.equals(this.workOrderId, attachmentConflict.workOrderId) &&
        Objects.equals(this.conflicts, attachmentConflict.conflicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, workOrderId, conflicts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentConflict {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    conflicts: ").append(toIndentedString(conflicts)).append("\n");
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

