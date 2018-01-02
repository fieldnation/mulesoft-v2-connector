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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * JSON Model
 */


public class PayModifier {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("charged")
  private Boolean charged = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("modifier")
  private BigDecimal modifier = null;

  /**
   * Gets or Sets calculation
   */
  @JsonAdapter(CalculationEnum.Adapter.class)
  public enum CalculationEnum {
    FIXED("fixed"),
    
    PERCENT("percent");

    private String value;

    CalculationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CalculationEnum fromValue(String text) {
      for (CalculationEnum b : CalculationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CalculationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CalculationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("calculation")
  private CalculationEnum calculation = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hours24_applicable")
  private Boolean hours24Applicable = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    CHARGE("charge"),
    
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

  public PayModifier id(Integer id) {
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

  public PayModifier charged(Boolean charged) {
    this.charged = charged;
    return this;
  }

   /**
   * Get charged
   * @return charged
  **/

  public Boolean isCharged() {
    return charged;
  }

  public void setCharged(Boolean charged) {
    this.charged = charged;
  }

  public PayModifier amount(BigDecimal amount) {
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

  public PayModifier modifier(BigDecimal modifier) {
    this.modifier = modifier;
    return this;
  }

   /**
   * Get modifier
   * @return modifier
  **/

  public BigDecimal getModifier() {
    return modifier;
  }

  public void setModifier(BigDecimal modifier) {
    this.modifier = modifier;
  }

  public PayModifier calculation(CalculationEnum calculation) {
    this.calculation = calculation;
    return this;
  }

   /**
   * Get calculation
   * @return calculation
  **/

  public CalculationEnum getCalculation() {
    return calculation;
  }

  public void setCalculation(CalculationEnum calculation) {
    this.calculation = calculation;
  }

  public PayModifier name(String name) {
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

  public PayModifier description(String description) {
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

  public PayModifier hours24Applicable(Boolean hours24Applicable) {
    this.hours24Applicable = hours24Applicable;
    return this;
  }

   /**
   * Get hours24Applicable
   * @return hours24Applicable
  **/

  public Boolean isHours24Applicable() {
    return hours24Applicable;
  }

  public void setHours24Applicable(Boolean hours24Applicable) {
    this.hours24Applicable = hours24Applicable;
  }

  public PayModifier actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public PayModifier addActionsItem(ActionsEnum actionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayModifier payModifier = (PayModifier) o;
    return Objects.equals(this.id, payModifier.id) &&
        Objects.equals(this.charged, payModifier.charged) &&
        Objects.equals(this.amount, payModifier.amount) &&
        Objects.equals(this.modifier, payModifier.modifier) &&
        Objects.equals(this.calculation, payModifier.calculation) &&
        Objects.equals(this.name, payModifier.name) &&
        Objects.equals(this.description, payModifier.description) &&
        Objects.equals(this.hours24Applicable, payModifier.hours24Applicable) &&
        Objects.equals(this.actions, payModifier.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, charged, amount, modifier, calculation, name, description, hours24Applicable, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayModifier {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    charged: ").append(toIndentedString(charged)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    calculation: ").append(toIndentedString(calculation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hours24Applicable: ").append(toIndentedString(hours24Applicable)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

