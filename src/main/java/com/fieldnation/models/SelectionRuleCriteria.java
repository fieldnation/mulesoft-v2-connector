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


import com.fieldnation.models.CustomField;
import java.io.IOException;

/**
 * SelectionRuleCriteria
 */

public class SelectionRuleCriteria {
  @SerializedName("id")
  private Integer id = null;

  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    CERTIFICATION("SC_CERTIFICATION"),
    
    SERVICE_CATEGORY("SC_SERVICE_CATEGORY"),
    
    SERVICE_CATEGORY_OF_WORKORDER("SC_SERVICE_CATEGORY_OF_WORKORDER"),
    
    AMOUNT_CURRENTLY_ASSIGNED("SC_AMOUNT_CURRENTLY_ASSIGNED"),
    
    AMOUNT_COMPLETED_FOR_ALL_COMPANIES("SC_AMOUNT_COMPLETED_FOR_ALL_COMPANIES"),
    
    AMOUNT_COMPLETED_FOR_MY_COMPANY("SC_AMOUNT_COMPLETED_FOR_MY_COMPANY"),
    
    DISTANCE_FROM_WORK_ORDER("SC_DISTANCE_FROM_WORK_ORDER"),
    
    CUSTOM_PROVIDER_FIELDS("SC_CUSTOM_PROVIDER_FIELDS"),
    
    MY_TECHNICIAN_GROUP("SC_MY_TECHNICIAN_GROUP"),
    
    OVERALL_RATING("SC_OVERALL_RATING"),
    
    PROVIDER_AND_WORK_ORDER("SC_PROVIDER_AND_WORK_ORDER"),
    
    INSURANCE("SC_INSURANCE"),
    
    BACKGROUND_CHECK("SC_BACKGROUND_CHECK"),
    
    DRUG_TEST("SC_DRUG_TEST"),
    
    ASSIGNED_BEFORE("SC_ASSIGNED_BEFORE"),
    
    ASSIGNED_NEARBY("SC_ASSIGNED_NEARBY"),
    
    REQUESTED("SC_REQUESTED"),
    
    RECENTLY_MATCHED_WO("SC_RECENTLY_MATCHED_WO"),
    
    VERIFICATION("SC_VERIFICATION"),
    
    BLOCK_RATIO("SC_BLOCK_RATIO"),
    
    CANCEL_RATIO("SC_CANCEL_RATIO"),
    
    STAR_BASED_RATING("SC_STAR_BASED_RATING"),
    
    PROTEC_PROVIDER("SC_PROTEC_PROVIDER"),
    
    EQUIPMENT("SC_EQUIPMENT"),
    
    TYPE_OF_WORK("SC_TYPE_OF_WORK"),
    
    PHONE_INTERVIEW("SC_PHONE_INTERVIEW"),
    
    PHONE_CALL_BUYER("SC_PHONE_CALL_BUYER"),
    
    DISCLOSE_ADDRESS("SC_DISCLOSE_ADDRESS");

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

  @SerializedName("service")
  private String service = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("weight")
  private Integer weight = null;

  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    EQUAL_TO("equal_to"),
    
    GREATER_THAN("greater_than"),
    
    LESS_THAN("less_than"),
    
    NOT_EQUAL_TO("not_equal_to");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operation")
  private OperationEnum operation = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NO_MATCH_OPTIONAL("no_match_optional"),
    
    NO_MATCH_REQUIRED("no_match_required"),
    
    MATCH("match");

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

  @SerializedName("value")
  private String value = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("custom_field")
  private CustomField customField = null;

  @SerializedName("extra")
  private String extra = null;

  public SelectionRuleCriteria id(Integer id) {
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

  public SelectionRuleCriteria name(NameEnum name) {
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

  public SelectionRuleCriteria service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SelectionRuleCriteria description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SelectionRuleCriteria required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/

  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public SelectionRuleCriteria weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/

  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public SelectionRuleCriteria operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/

  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public SelectionRuleCriteria status(StatusEnum status) {
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

  public SelectionRuleCriteria value(String value) {
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

  public SelectionRuleCriteria order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/

  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public SelectionRuleCriteria customField(CustomField customField) {
    this.customField = customField;
    return this;
  }

   /**
   * Get customField
   * @return customField
  **/

  public CustomField getCustomField() {
    return customField;
  }

  public void setCustomField(CustomField customField) {
    this.customField = customField;
  }

  public SelectionRuleCriteria extra(String extra) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionRuleCriteria selectionRuleCriteria = (SelectionRuleCriteria) o;
    return Objects.equals(this.id, selectionRuleCriteria.id) &&
        Objects.equals(this.name, selectionRuleCriteria.name) &&
        Objects.equals(this.service, selectionRuleCriteria.service) &&
        Objects.equals(this.description, selectionRuleCriteria.description) &&
        Objects.equals(this.required, selectionRuleCriteria.required) &&
        Objects.equals(this.weight, selectionRuleCriteria.weight) &&
        Objects.equals(this.operation, selectionRuleCriteria.operation) &&
        Objects.equals(this.status, selectionRuleCriteria.status) &&
        Objects.equals(this.value, selectionRuleCriteria.value) &&
        Objects.equals(this.order, selectionRuleCriteria.order) &&
        Objects.equals(this.customField, selectionRuleCriteria.customField) &&
        Objects.equals(this.extra, selectionRuleCriteria.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, service, description, required, weight, operation, status, value, order, customField, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionRuleCriteria {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

