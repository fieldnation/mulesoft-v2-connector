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
import java.util.ArrayList;
import java.util.List;

/**
 * SavedCreditCard
 */

public class SavedCreditCard {
  @SerializedName("card_id")
  private Integer cardId = null;

  /**
   * Gets or Sets cardType
   */
  @JsonAdapter(CardTypeEnum.Adapter.class)
  public enum CardTypeEnum {
    VISA("visa"),
    
    MASTERCARD("mastercard"),
    
    AMERICAN_EXPRESS("american express"),
    
    DISCOVER("discover"),
    
    JCB("jcb"),
    
    DINERS_CLUB("diners club");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardTypeEnum fromValue(String text) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CardTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CardTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("card_type")
  private CardTypeEnum cardType = null;

  @SerializedName("expiration_date")
  private String expirationDate = null;

  @SerializedName("isExpired")
  private Integer isExpired = null;

  @SerializedName("last_four")
  private String lastFour = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    DISABLE("disable"),
    
    ENABLE("enable"),
    
    REQUEST("request"),
    
    DENY("deny");

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

  public SavedCreditCard cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/

  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  public SavedCreditCard cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/

  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public SavedCreditCard expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * format MM/YY
   * @return expirationDate
  **/
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public SavedCreditCard isExpired(Integer isExpired) {
    this.isExpired = isExpired;
    return this;
  }

   /**
   * Get isExpired
   * @return isExpired
  **/

  public Integer getIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Integer isExpired) {
    this.isExpired = isExpired;
  }

  public SavedCreditCard lastFour(String lastFour) {
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Get lastFour
   * @return lastFour
  **/

  public String getLastFour() {
    return lastFour;
  }

  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }

  public SavedCreditCard actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public SavedCreditCard addActionsItem(ActionsEnum actionsItem) {
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
    SavedCreditCard savedCreditCard = (SavedCreditCard) o;
    return Objects.equals(this.cardId, savedCreditCard.cardId) &&
        Objects.equals(this.cardType, savedCreditCard.cardType) &&
        Objects.equals(this.expirationDate, savedCreditCard.expirationDate) &&
        Objects.equals(this.isExpired, savedCreditCard.isExpired) &&
        Objects.equals(this.lastFour, savedCreditCard.lastFour) &&
        Objects.equals(this.actions, savedCreditCard.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, cardType, expirationDate, isExpired, lastFour, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedCreditCard {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
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

