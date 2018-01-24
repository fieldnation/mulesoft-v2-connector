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

/**
 * WorkOrderRatingsAssignedProviderWorkOrderCategories
 */

public class WorkOrderRatingsAssignedProviderWorkOrderCategories {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ON_TIME("on_time"),
    
    FOLLOW_INSTRUCTIONS("follow_instructions"),
    
    ASSIGNMENT_FULFILLED("assignment_fulfilled"),
    
    RIGHT_DELIVERABLES("right_deliverables");

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

  @SerializedName("value")
  private Integer value = null;

  public WorkOrderRatingsAssignedProviderWorkOrderCategories type(TypeEnum type) {
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

  public WorkOrderRatingsAssignedProviderWorkOrderCategories value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatingsAssignedProviderWorkOrderCategories workOrderRatingsAssignedProviderWorkOrderCategories = (WorkOrderRatingsAssignedProviderWorkOrderCategories) o;
    return Objects.equals(this.type, workOrderRatingsAssignedProviderWorkOrderCategories.type) &&
        Objects.equals(this.value, workOrderRatingsAssignedProviderWorkOrderCategories.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsAssignedProviderWorkOrderCategories {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

