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
 * ETAStatus
 */

public class ETAStatus {
  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    UNCONFIRMED("unconfirmed"),
    
    CONFIRMED("confirmed"),
    
    SET("set"),
    
    READYTOGO("readytogo"),
    
    ONMYWAY("onmyway");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("name")
  private NameEnum name = null;

  @SerializedName("updated")
  private java.util.Date updated = null;

  public ETAStatus name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public ETAStatus updated(java.util.Date updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/

  public java.util.Date getUpdated() {
    return updated;
  }

  public void setUpdated(java.util.Date updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETAStatus etAStatus = (ETAStatus) o;
    return Objects.equals(this.name, etAStatus.name) &&
        Objects.equals(this.updated, etAStatus.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETAStatus {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

