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
 * ProblemResolution
 */

public class ProblemResolution {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    RESOLVED("resolved"),
    
    OPEN("open");

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

  @SerializedName("at")
  private java.util.Date at = null;

  @SerializedName("by")
  private MinimalUser by = null;

  /**
   * Gets or Sets allowedResolvers
   */
  @JsonAdapter(AllowedResolversEnum.Adapter.class)
  public enum AllowedResolversEnum {
    SUPPORT("support"),
    
    BUYER("buyer"),
    
    ASSIGNED_PROVIDER("assigned_provider");

    private String value;

    AllowedResolversEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedResolversEnum fromValue(String text) {
      for (AllowedResolversEnum b : AllowedResolversEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AllowedResolversEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedResolversEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedResolversEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AllowedResolversEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("allowed_resolvers")
  private List<AllowedResolversEnum> allowedResolvers = null;

  public ProblemResolution status(StatusEnum status) {
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

  public ProblemResolution at(java.util.Date at) {
    this.at = at;
    return this;
  }

   /**
   * Get at
   * @return at
  **/

  public java.util.Date getAt() {
    return at;
  }

  public void setAt(java.util.Date at) {
    this.at = at;
  }

  public ProblemResolution by(MinimalUser by) {
    this.by = by;
    return this;
  }

   /**
   * Get by
   * @return by
  **/

  public MinimalUser getBy() {
    return by;
  }

  public void setBy(MinimalUser by) {
    this.by = by;
  }

  public ProblemResolution allowedResolvers(List<AllowedResolversEnum> allowedResolvers) {
    this.allowedResolvers = allowedResolvers;
    return this;
  }

  public ProblemResolution addAllowedResolversItem(AllowedResolversEnum allowedResolversItem) {
    if (this.allowedResolvers == null) {
      this.allowedResolvers = new ArrayList<AllowedResolversEnum>();
    }
    this.allowedResolvers.add(allowedResolversItem);
    return this;
  }

   /**
   * Get allowedResolvers
   * @return allowedResolvers
  **/

  public List<AllowedResolversEnum> getAllowedResolvers() {
    return allowedResolvers;
  }

  public void setAllowedResolvers(List<AllowedResolversEnum> allowedResolvers) {
    this.allowedResolvers = allowedResolvers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemResolution problemResolution = (ProblemResolution) o;
    return Objects.equals(this.status, problemResolution.status) &&
        Objects.equals(this.at, problemResolution.at) &&
        Objects.equals(this.by, problemResolution.by) &&
        Objects.equals(this.allowedResolvers, problemResolution.allowedResolvers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, at, by, allowedResolvers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemResolution {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    allowedResolvers: ").append(toIndentedString(allowedResolvers)).append("\n");
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

