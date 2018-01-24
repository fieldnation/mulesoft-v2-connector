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


import com.fieldnation.models.CustomFieldDependency;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomField
 */

public class CustomField {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tip")
  private String tip = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("text"),
    
    NUMERIC("numeric"),
    
    DATE("date"),
    
    DATE_TIME("date_time"),
    
    TIME("time"),
    
    PREDEFINED("predefined"),
    
    PHONE("phone");

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

  @SerializedName("options")
  private List<String> options = null;

  /**
   * Gets or Sets role
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    BUYER("buyer"),
    
    ASSIGNED_PROVIDER("assigned_provider");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("dependency")
  private CustomFieldDependency dependency = null;

  /**
   * Gets or Sets flags
   */
  @JsonAdapter(FlagsEnum.Adapter.class)
  public enum FlagsEnum {
    UNIQUE("unique"),
    
    REQUIRED("required"),
    
    INTERNAL_ID("internal_id"),
    
    REQUIRED_DURING_CHECKIN("required_during_checkin"),
    
    INCLUDED_IN_ALERTS("included_in_alerts"),
    
    SHOWN_IN_HEADER("shown_in_header"),
    
    SEEN_BY_PROVIDER("seen_by_provider"),
    
    SEEN_BY_CLIENTS("seen_by_clients"),
    
    VISIBLE_TO_CLIENTS("visible_to_clients"),
    
    CLIENT_REQUEST_REQUIRED("client_request_required"),
    
    CLIENT_REQUEST_USE_FOR("client_request_use_for");

    private String value;

    FlagsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlagsEnum fromValue(String text) {
      for (FlagsEnum b : FlagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FlagsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlagsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlagsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FlagsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("flags")
  private List<FlagsEnum> flags = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
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

  @SerializedName("category")
  private String category = null;

  public CustomField id(Integer id) {
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

  public CustomField name(String name) {
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

  public CustomField tip(String tip) {
    this.tip = tip;
    return this;
  }

   /**
   * Get tip
   * @return tip
  **/

  public String getTip() {
    return tip;
  }

  public void setTip(String tip) {
    this.tip = tip;
  }

  public CustomField type(TypeEnum type) {
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

  public CustomField options(List<String> options) {
    this.options = options;
    return this;
  }

  public CustomField addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/

  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  public CustomField role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public CustomField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CustomField dependency(CustomFieldDependency dependency) {
    this.dependency = dependency;
    return this;
  }

   /**
   * Get dependency
   * @return dependency
  **/

  public CustomFieldDependency getDependency() {
    return dependency;
  }

  public void setDependency(CustomFieldDependency dependency) {
    this.dependency = dependency;
  }

  public CustomField flags(List<FlagsEnum> flags) {
    this.flags = flags;
    return this;
  }

  public CustomField addFlagsItem(FlagsEnum flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<FlagsEnum>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/

  public List<FlagsEnum> getFlags() {
    return flags;
  }

  public void setFlags(List<FlagsEnum> flags) {
    this.flags = flags;
  }

  public CustomField actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public CustomField addActionsItem(ActionsEnum actionsItem) {
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

  public CustomField category(String category) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomField customField = (CustomField) o;
    return Objects.equals(this.id, customField.id) &&
        Objects.equals(this.name, customField.name) &&
        Objects.equals(this.tip, customField.tip) &&
        Objects.equals(this.type, customField.type) &&
        Objects.equals(this.options, customField.options) &&
        Objects.equals(this.role, customField.role) &&
        Objects.equals(this.value, customField.value) &&
        Objects.equals(this.dependency, customField.dependency) &&
        Objects.equals(this.flags, customField.flags) &&
        Objects.equals(this.actions, customField.actions) &&
        Objects.equals(this.category, customField.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tip, type, options, role, value, dependency, flags, actions, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dependency: ").append(toIndentedString(dependency)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

