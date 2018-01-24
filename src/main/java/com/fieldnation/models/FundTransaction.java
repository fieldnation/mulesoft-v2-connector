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
import com.fieldnation.models.BillingAddress;
import com.fieldnation.models.CreditCard;
import com.fieldnation.models.WorkOrder;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Transaction attempting to be created
 */
public class FundTransaction {
  @SerializedName("id")
  private Integer id = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT("payment"),
    
    WITHDRAWAL("withdrawal"),
    
    DEPOSIT("deposit"),
    
    LOAN("loan"),
    
    SERVICE_FEE("service_fee"),
    
    INSURANCE_FEE("insurance_fee"),
    
    CCAUTH("ccauth");

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

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    COMPLETED("completed"),
    
    HOLDING("holding"),
    
    FAILED("failed");

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

  @SerializedName("status_reason")
  private String statusReason = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("credit_card_id")
  private String creditCardId = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("updated")
  private java.util.Date updated = null;

  @SerializedName("work_order")
  private WorkOrder workOrder = null;

  @SerializedName("credit_card")
  private CreditCard creditCard = null;

  @SerializedName("bank")
  private Bank bank = null;

  @SerializedName("billing_address")
  private BillingAddress billingAddress = null;

  public FundTransaction id(Integer id) {
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

  public FundTransaction type(TypeEnum type) {
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

  public FundTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public FundTransaction description(String description) {
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

  public FundTransaction status(StatusEnum status) {
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

  public FundTransaction statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

   /**
   * Get statusReason
   * @return statusReason
  **/

  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public FundTransaction note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public FundTransaction creditCardId(String creditCardId) {
    this.creditCardId = creditCardId;
    return this;
  }

   /**
   * Get creditCardId
   * @return creditCardId
  **/

  public String getCreditCardId() {
    return creditCardId;
  }

  public void setCreditCardId(String creditCardId) {
    this.creditCardId = creditCardId;
  }

  public FundTransaction externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/

  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public FundTransaction created(java.util.Date created) {
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

  public FundTransaction updated(java.util.Date updated) {
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

  public FundTransaction workOrder(WorkOrder workOrder) {
    this.workOrder = workOrder;
    return this;
  }

   /**
   * Get workOrder
   * @return workOrder
  **/

  public WorkOrder getWorkOrder() {
    return workOrder;
  }

  public void setWorkOrder(WorkOrder workOrder) {
    this.workOrder = workOrder;
  }

  public FundTransaction creditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
    return this;
  }

   /**
   * Get creditCard
   * @return creditCard
  **/

  public CreditCard getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  public FundTransaction bank(Bank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public FundTransaction billingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/

  public BillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundTransaction fundTransaction = (FundTransaction) o;
    return Objects.equals(this.id, fundTransaction.id) &&
        Objects.equals(this.type, fundTransaction.type) &&
        Objects.equals(this.amount, fundTransaction.amount) &&
        Objects.equals(this.description, fundTransaction.description) &&
        Objects.equals(this.status, fundTransaction.status) &&
        Objects.equals(this.statusReason, fundTransaction.statusReason) &&
        Objects.equals(this.note, fundTransaction.note) &&
        Objects.equals(this.creditCardId, fundTransaction.creditCardId) &&
        Objects.equals(this.externalId, fundTransaction.externalId) &&
        Objects.equals(this.created, fundTransaction.created) &&
        Objects.equals(this.updated, fundTransaction.updated) &&
        Objects.equals(this.workOrder, fundTransaction.workOrder) &&
        Objects.equals(this.creditCard, fundTransaction.creditCard) &&
        Objects.equals(this.bank, fundTransaction.bank) &&
        Objects.equals(this.billingAddress, fundTransaction.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, amount, description, status, statusReason, note, creditCardId, externalId, created, updated, workOrder, creditCard, bank, billingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    creditCardId: ").append(toIndentedString(creditCardId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    workOrder: ").append(toIndentedString(workOrder)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

