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


import com.fieldnation.models.Expenses;
import com.fieldnation.models.MinimalPayIncreases;
import com.fieldnation.models.PayBase;
import com.fieldnation.models.PayCalculatedTotal;
import com.fieldnation.models.PayCalculatedTotalTotal;
import com.fieldnation.models.PayFinance;
import com.fieldnation.models.PayModifier;
import com.fieldnation.models.PayModifiers;
import com.fieldnation.models.PayTerm;
import com.fieldnation.models.PricingInsights;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Pay
 */

public class Pay {
  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EMPTY(""),
    
    HOURLY("hourly"),
    
    FIXED("fixed"),
    
    DEVICE("device"),
    
    BLENDED("blended");

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

  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("minimum_payment")
  private BigDecimal minimumPayment = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    PRINT("print"),
    
    VIEW("view");

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

  @SerializedName("base")
  private PayBase base = null;

  @SerializedName("additional")
  private PayBase additional = null;

  @SerializedName("finance")
  private PayFinance finance = null;

  @SerializedName("range")
  private PayCalculatedTotalTotal range = null;

  @SerializedName("pricing_insights")
  private PricingInsights pricingInsights = null;

  @SerializedName("reported_hours")
  private BigDecimal reportedHours = null;

  @SerializedName("number_of_devices")
  private BigDecimal numberOfDevices = null;

  @SerializedName("labor_sum")
  private BigDecimal laborSum = null;

  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("estimated_payment_date")
  private java.util.Date estimatedPaymentDate = null;

  @SerializedName("hold")
  private PayModifier hold = null;

  @SerializedName("payment")
  private PayModifier payment = null;

  @SerializedName("fees")
  private List<PayModifier> fees = null;

  @SerializedName("bonuses")
  private PayModifiers bonuses = null;

  @SerializedName("penalties")
  private PayModifiers penalties = null;

  @SerializedName("discounts")
  private PayModifiers discounts = null;

  @SerializedName("expenses")
  private Expenses expenses = null;

  @SerializedName("increases")
  private MinimalPayIncreases increases = null;

  @SerializedName("max_pay")
  private BigDecimal maxPay = null;

  @SerializedName("calculated_total")
  private PayCalculatedTotal calculatedTotal = null;

  @SerializedName("term")
  private PayTerm term = null;

  public Pay workOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
    return this;
  }

   /**
   * Get workOrderId
   * @return workOrderId
  **/

  public Integer getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
  }

  public Pay type(TypeEnum type) {
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

  public Pay correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public Pay role(String role) {
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

  public Pay minimumPayment(BigDecimal minimumPayment) {
    this.minimumPayment = minimumPayment;
    return this;
  }

   /**
   * Get minimumPayment
   * @return minimumPayment
  **/

  public BigDecimal getMinimumPayment() {
    return minimumPayment;
  }

  public void setMinimumPayment(BigDecimal minimumPayment) {
    this.minimumPayment = minimumPayment;
  }

  public Pay actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Pay addActionsItem(ActionsEnum actionsItem) {
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

  public Pay base(PayBase base) {
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/

  public PayBase getBase() {
    return base;
  }

  public void setBase(PayBase base) {
    this.base = base;
  }

  public Pay additional(PayBase additional) {
    this.additional = additional;
    return this;
  }

   /**
   * Get additional
   * @return additional
  **/

  public PayBase getAdditional() {
    return additional;
  }

  public void setAdditional(PayBase additional) {
    this.additional = additional;
  }

  public Pay finance(PayFinance finance) {
    this.finance = finance;
    return this;
  }

   /**
   * Get finance
   * @return finance
  **/

  public PayFinance getFinance() {
    return finance;
  }

  public void setFinance(PayFinance finance) {
    this.finance = finance;
  }

  public Pay range(PayCalculatedTotalTotal range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/

  public PayCalculatedTotalTotal getRange() {
    return range;
  }

  public void setRange(PayCalculatedTotalTotal range) {
    this.range = range;
  }

  public Pay pricingInsights(PricingInsights pricingInsights) {
    this.pricingInsights = pricingInsights;
    return this;
  }

   /**
   * Get pricingInsights
   * @return pricingInsights
  **/

  public PricingInsights getPricingInsights() {
    return pricingInsights;
  }

  public void setPricingInsights(PricingInsights pricingInsights) {
    this.pricingInsights = pricingInsights;
  }

  public Pay reportedHours(BigDecimal reportedHours) {
    this.reportedHours = reportedHours;
    return this;
  }

   /**
   * Get reportedHours
   * @return reportedHours
  **/

  public BigDecimal getReportedHours() {
    return reportedHours;
  }

  public void setReportedHours(BigDecimal reportedHours) {
    this.reportedHours = reportedHours;
  }

  public Pay numberOfDevices(BigDecimal numberOfDevices) {
    this.numberOfDevices = numberOfDevices;
    return this;
  }

   /**
   * Get numberOfDevices
   * @return numberOfDevices
  **/

  public BigDecimal getNumberOfDevices() {
    return numberOfDevices;
  }

  public void setNumberOfDevices(BigDecimal numberOfDevices) {
    this.numberOfDevices = numberOfDevices;
  }

  public Pay laborSum(BigDecimal laborSum) {
    this.laborSum = laborSum;
    return this;
  }

   /**
   * Get laborSum
   * @return laborSum
  **/

  public BigDecimal getLaborSum() {
    return laborSum;
  }

  public void setLaborSum(BigDecimal laborSum) {
    this.laborSum = laborSum;
  }

  public Pay total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Pay estimatedPaymentDate(java.util.Date estimatedPaymentDate) {
    this.estimatedPaymentDate = estimatedPaymentDate;
    return this;
  }

   /**
   * Get estimatedPaymentDate
   * @return estimatedPaymentDate
  **/

  public java.util.Date getEstimatedPaymentDate() {
    return estimatedPaymentDate;
  }

  public void setEstimatedPaymentDate(java.util.Date estimatedPaymentDate) {
    this.estimatedPaymentDate = estimatedPaymentDate;
  }

  public Pay hold(PayModifier hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/

  public PayModifier getHold() {
    return hold;
  }

  public void setHold(PayModifier hold) {
    this.hold = hold;
  }

  public Pay payment(PayModifier payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/

  public PayModifier getPayment() {
    return payment;
  }

  public void setPayment(PayModifier payment) {
    this.payment = payment;
  }

  public Pay fees(List<PayModifier> fees) {
    this.fees = fees;
    return this;
  }

  public Pay addFeesItem(PayModifier feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<PayModifier>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/

  public List<PayModifier> getFees() {
    return fees;
  }

  public void setFees(List<PayModifier> fees) {
    this.fees = fees;
  }

  public Pay bonuses(PayModifiers bonuses) {
    this.bonuses = bonuses;
    return this;
  }

   /**
   * Get bonuses
   * @return bonuses
  **/

  public PayModifiers getBonuses() {
    return bonuses;
  }

  public void setBonuses(PayModifiers bonuses) {
    this.bonuses = bonuses;
  }

  public Pay penalties(PayModifiers penalties) {
    this.penalties = penalties;
    return this;
  }

   /**
   * Get penalties
   * @return penalties
  **/

  public PayModifiers getPenalties() {
    return penalties;
  }

  public void setPenalties(PayModifiers penalties) {
    this.penalties = penalties;
  }

  public Pay discounts(PayModifiers discounts) {
    this.discounts = discounts;
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/

  public PayModifiers getDiscounts() {
    return discounts;
  }

  public void setDiscounts(PayModifiers discounts) {
    this.discounts = discounts;
  }

  public Pay expenses(Expenses expenses) {
    this.expenses = expenses;
    return this;
  }

   /**
   * Get expenses
   * @return expenses
  **/

  public Expenses getExpenses() {
    return expenses;
  }

  public void setExpenses(Expenses expenses) {
    this.expenses = expenses;
  }

  public Pay increases(MinimalPayIncreases increases) {
    this.increases = increases;
    return this;
  }

   /**
   * Get increases
   * @return increases
  **/

  public MinimalPayIncreases getIncreases() {
    return increases;
  }

  public void setIncreases(MinimalPayIncreases increases) {
    this.increases = increases;
  }

  public Pay maxPay(BigDecimal maxPay) {
    this.maxPay = maxPay;
    return this;
  }

   /**
   * Get maxPay
   * @return maxPay
  **/

  public BigDecimal getMaxPay() {
    return maxPay;
  }

  public void setMaxPay(BigDecimal maxPay) {
    this.maxPay = maxPay;
  }

  public Pay calculatedTotal(PayCalculatedTotal calculatedTotal) {
    this.calculatedTotal = calculatedTotal;
    return this;
  }

   /**
   * Get calculatedTotal
   * @return calculatedTotal
  **/

  public PayCalculatedTotal getCalculatedTotal() {
    return calculatedTotal;
  }

  public void setCalculatedTotal(PayCalculatedTotal calculatedTotal) {
    this.calculatedTotal = calculatedTotal;
  }

  public Pay term(PayTerm term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/

  public PayTerm getTerm() {
    return term;
  }

  public void setTerm(PayTerm term) {
    this.term = term;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pay pay = (Pay) o;
    return Objects.equals(this.workOrderId, pay.workOrderId) &&
        Objects.equals(this.type, pay.type) &&
        Objects.equals(this.correlationId, pay.correlationId) &&
        Objects.equals(this.role, pay.role) &&
        Objects.equals(this.minimumPayment, pay.minimumPayment) &&
        Objects.equals(this.actions, pay.actions) &&
        Objects.equals(this.base, pay.base) &&
        Objects.equals(this.additional, pay.additional) &&
        Objects.equals(this.finance, pay.finance) &&
        Objects.equals(this.range, pay.range) &&
        Objects.equals(this.pricingInsights, pay.pricingInsights) &&
        Objects.equals(this.reportedHours, pay.reportedHours) &&
        Objects.equals(this.numberOfDevices, pay.numberOfDevices) &&
        Objects.equals(this.laborSum, pay.laborSum) &&
        Objects.equals(this.total, pay.total) &&
        Objects.equals(this.estimatedPaymentDate, pay.estimatedPaymentDate) &&
        Objects.equals(this.hold, pay.hold) &&
        Objects.equals(this.payment, pay.payment) &&
        Objects.equals(this.fees, pay.fees) &&
        Objects.equals(this.bonuses, pay.bonuses) &&
        Objects.equals(this.penalties, pay.penalties) &&
        Objects.equals(this.discounts, pay.discounts) &&
        Objects.equals(this.expenses, pay.expenses) &&
        Objects.equals(this.increases, pay.increases) &&
        Objects.equals(this.maxPay, pay.maxPay) &&
        Objects.equals(this.calculatedTotal, pay.calculatedTotal) &&
        Objects.equals(this.term, pay.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrderId, type, correlationId, role, minimumPayment, actions, base, additional, finance, range, pricingInsights, reportedHours, numberOfDevices, laborSum, total, estimatedPaymentDate, hold, payment, fees, bonuses, penalties, discounts, expenses, increases, maxPay, calculatedTotal, term);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pay {\n");
    
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    minimumPayment: ").append(toIndentedString(minimumPayment)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    finance: ").append(toIndentedString(finance)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    pricingInsights: ").append(toIndentedString(pricingInsights)).append("\n");
    sb.append("    reportedHours: ").append(toIndentedString(reportedHours)).append("\n");
    sb.append("    numberOfDevices: ").append(toIndentedString(numberOfDevices)).append("\n");
    sb.append("    laborSum: ").append(toIndentedString(laborSum)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    estimatedPaymentDate: ").append(toIndentedString(estimatedPaymentDate)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    bonuses: ").append(toIndentedString(bonuses)).append("\n");
    sb.append("    penalties: ").append(toIndentedString(penalties)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    increases: ").append(toIndentedString(increases)).append("\n");
    sb.append("    maxPay: ").append(toIndentedString(maxPay)).append("\n");
    sb.append("    calculatedTotal: ").append(toIndentedString(calculatedTotal)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

