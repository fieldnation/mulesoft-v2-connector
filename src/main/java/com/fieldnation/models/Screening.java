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
 * JSON screening object
 */


public class Screening {
  @SerializedName("user_id")
  private Integer userId = null;

  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    BACKGROUND_CHECK("background_check"),
    
    DRUG_TEST("drug_test"),
    
    DRIVING_RECORDS_CHECK("driving_records_check"),
    
    CREDIT_CHECK("credit_check");

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

  @SerializedName("extra")
  private String extra = null;

  @SerializedName("verified")
  private String verified = null;

  @SerializedName("expires")
  private String expires = null;

  public Screening userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Screening name(NameEnum name) {
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

  public Screening extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/

  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public Screening verified(String verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/

  public String getVerified() {
    return verified;
  }

  public void setVerified(String verified) {
    this.verified = verified;
  }

  public Screening expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/

  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Screening screening = (Screening) o;
    return Objects.equals(this.userId, screening.userId) &&
        Objects.equals(this.name, screening.name) &&
        Objects.equals(this.extra, screening.extra) &&
        Objects.equals(this.verified, screening.verified) &&
        Objects.equals(this.expires, screening.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, name, extra, verified, expires);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Screening {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

