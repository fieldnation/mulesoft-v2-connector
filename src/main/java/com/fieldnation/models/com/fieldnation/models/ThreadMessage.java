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

/**
 * ThreadMessage
 */

public class ThreadMessage {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("participant")
  private MinimalUser participant = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("created")
  private java.util.Date created = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INTERNAL("INTERNAL"),
    
    ASSIGNEDTECH("ASSIGNEDTECH"),
    
    REQUESTEDTECHS("REQUESTEDTECHS"),
    
    SPECIFICTECH("SPECIFICTECH"),
    
    FROMTECH("FROMTECH"),
    
    REPLY("REPLY"),
    
    TECHTOMANAGER("TECHTOMANAGER"),
    
    ROUTEDTECHS("ROUTEDTECHS"),
    
    REPLYTOTHREAD("REPLYTOTHREAD"),
    
    STAFF_NOTE("STAFF_NOTE");

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

  public ThreadMessage id(Integer id) {
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

  public ThreadMessage participant(MinimalUser participant) {
    this.participant = participant;
    return this;
  }

   /**
   * Get participant
   * @return participant
  **/

  public MinimalUser getParticipant() {
    return participant;
  }

  public void setParticipant(MinimalUser participant) {
    this.participant = participant;
  }

  public ThreadMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ThreadMessage created(java.util.Date created) {
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

  public ThreadMessage type(TypeEnum type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadMessage threadMessage = (ThreadMessage) o;
    return Objects.equals(this.id, threadMessage.id) &&
        Objects.equals(this.participant, threadMessage.participant) &&
        Objects.equals(this.message, threadMessage.message) &&
        Objects.equals(this.created, threadMessage.created) &&
        Objects.equals(this.type, threadMessage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, participant, message, created, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

