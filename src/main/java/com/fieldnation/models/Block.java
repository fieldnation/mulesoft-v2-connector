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
 * Block
 */

public class Block {
  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ADD("add"),
    
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

  @SerializedName("blocked")
  private Boolean blocked = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("reason_id")
  private Integer reasonId = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("category")
  private String category = null;

  /**
   * Gets or Sets types
   */
  @JsonAdapter(TypesEnum.Adapter.class)
  public enum TypesEnum {
    WORK_ORDER("work_order"),
    
    COMPANY("company"),
    
    CLIENT("client"),
    
    LOCATION("location"),
    
    PROJECT("project"),
    
    SERVICE_COMPANY("service_company");

    private String value;

    TypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypesEnum fromValue(String text) {
      for (TypesEnum b : TypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("types")
  private List<TypesEnum> types = null;

  public Block actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Block addActionsItem(ActionsEnum actionsItem) {
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

  public Block blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/

  public Boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public Block created(java.util.Date created) {
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

  public Block author(MinimalUser author) {
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

  public Block reasonId(Integer reasonId) {
    this.reasonId = reasonId;
    return this;
  }

   /**
   * Get reasonId
   * @return reasonId
  **/

  public Integer getReasonId() {
    return reasonId;
  }

  public void setReasonId(Integer reasonId) {
    this.reasonId = reasonId;
  }

  public Block reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Block category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Block types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public Block addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<TypesEnum>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/

  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block block = (Block) o;
    return Objects.equals(this.actions, block.actions) &&
        Objects.equals(this.blocked, block.blocked) &&
        Objects.equals(this.created, block.created) &&
        Objects.equals(this.author, block.author) &&
        Objects.equals(this.reasonId, block.reasonId) &&
        Objects.equals(this.reason, block.reason) &&
        Objects.equals(this.category, block.category) &&
        Objects.equals(this.types, block.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, blocked, created, author, reasonId, reason, category, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

