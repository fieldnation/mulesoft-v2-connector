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
 * Tag
 */

public class Tag {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("hex_color")
  private String hexColor = null;

  /**
   * Gets or Sets types
   */
  @JsonAdapter(TypesEnum.Adapter.class)
  public enum TypesEnum {
    SUBSTATUS("substatus"),
    
    HOLD("hold"),
    
    PROBLEM("problem"),
    
    SHOW_IN_DASHBOARD("show_in_dashboard"),
    
    HIDE_FROM_PROVIDER("hide_from_provider"),
    
    CUSTOM_COMPANY("custom_company"),
    
    PROVIDER_CAN_EDIT("provider_can_edit");

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

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    DELETE("delete"),
    
    EDIT("edit");

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

  /**
   * Gets or Sets validStatuses
   */
  @JsonAdapter(ValidStatusesEnum.Adapter.class)
  public enum ValidStatusesEnum {
    CREATED("created"),
    
    PUBLISHED("published"),
    
    ROUTED("routed"),
    
    ASSIGNED("assigned"),
    
    WORKDONE("workdone"),
    
    APPROVED("approved"),
    
    PAID("paid"),
    
    CANCELED("canceled");

    private String value;

    ValidStatusesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidStatusesEnum fromValue(String text) {
      for (ValidStatusesEnum b : ValidStatusesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ValidStatusesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidStatusesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidStatusesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ValidStatusesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("valid_statuses")
  private List<ValidStatusesEnum> validStatuses = null;

  public Tag id(Integer id) {
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

  public Tag author(MinimalUser author) {
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

  public Tag created(java.util.Date created) {
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

  public Tag label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Tag hexColor(String hexColor) {
    this.hexColor = hexColor;
    return this;
  }

   /**
   * Get hexColor
   * @return hexColor
  **/

  public String getHexColor() {
    return hexColor;
  }

  public void setHexColor(String hexColor) {
    this.hexColor = hexColor;
  }

  public Tag types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public Tag addTypesItem(TypesEnum typesItem) {
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

  public Tag actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Tag addActionsItem(ActionsEnum actionsItem) {
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

  public Tag validStatuses(List<ValidStatusesEnum> validStatuses) {
    this.validStatuses = validStatuses;
    return this;
  }

  public Tag addValidStatusesItem(ValidStatusesEnum validStatusesItem) {
    if (this.validStatuses == null) {
      this.validStatuses = new ArrayList<ValidStatusesEnum>();
    }
    this.validStatuses.add(validStatusesItem);
    return this;
  }

   /**
   * Get validStatuses
   * @return validStatuses
  **/

  public List<ValidStatusesEnum> getValidStatuses() {
    return validStatuses;
  }

  public void setValidStatuses(List<ValidStatusesEnum> validStatuses) {
    this.validStatuses = validStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.id, tag.id) &&
        Objects.equals(this.author, tag.author) &&
        Objects.equals(this.created, tag.created) &&
        Objects.equals(this.label, tag.label) &&
        Objects.equals(this.hexColor, tag.hexColor) &&
        Objects.equals(this.types, tag.types) &&
        Objects.equals(this.actions, tag.actions) &&
        Objects.equals(this.validStatuses, tag.validStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, created, label, hexColor, types, actions, validStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    hexColor: ").append(toIndentedString(hexColor)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    validStatuses: ").append(toIndentedString(validStatuses)).append("\n");
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

