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


import com.fieldnation.models.MinimalMessageFrom;
import com.fieldnation.models.MinimalMessageTo;
import com.fieldnation.models.MinimalMessages;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Message
 */

public class Message {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("from")
  private MinimalMessageFrom from = null;

  @SerializedName("to")
  private MinimalMessageTo to = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("msg_id")
  private Integer msgId = null;

  @SerializedName("parent_id")
  private Integer parentId = null;

  @SerializedName("read")
  private Boolean read = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("message")
  private String message = null;

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

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("replies")
  private MinimalMessages replies = null;

  public Message id(Integer id) {
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

  public Message from(MinimalMessageFrom from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/

  public MinimalMessageFrom getFrom() {
    return from;
  }

  public void setFrom(MinimalMessageFrom from) {
    this.from = from;
  }

  public Message to(MinimalMessageTo to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/

  public MinimalMessageTo getTo() {
    return to;
  }

  public void setTo(MinimalMessageTo to) {
    this.to = to;
  }

  public Message role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Message msgId(Integer msgId) {
    this.msgId = msgId;
    return this;
  }

   /**
   * Get msgId
   * @return msgId
  **/

  public Integer getMsgId() {
    return msgId;
  }

  public void setMsgId(Integer msgId) {
    this.msgId = msgId;
  }

  public Message parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Message read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/

  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Message created(java.util.Date created) {
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

  public Message message(String message) {
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

  public Message type(TypeEnum type) {
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

  public Message actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Message addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public Message replies(MinimalMessages replies) {
    this.replies = replies;
    return this;
  }

   /**
   * Get replies
   * @return replies
  **/

  public MinimalMessages getReplies() {
    return replies;
  }

  public void setReplies(MinimalMessages replies) {
    this.replies = replies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.from, message.from) &&
        Objects.equals(this.to, message.to) &&
        Objects.equals(this.role, message.role) &&
        Objects.equals(this.msgId, message.msgId) &&
        Objects.equals(this.parentId, message.parentId) &&
        Objects.equals(this.read, message.read) &&
        Objects.equals(this.created, message.created) &&
        Objects.equals(this.message, message.message) &&
        Objects.equals(this.type, message.type) &&
        Objects.equals(this.actions, message.actions) &&
        Objects.equals(this.replies, message.replies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, role, msgId, parentId, read, created, message, type, actions, replies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
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

