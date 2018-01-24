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

/**
 * Bank
 */

public class Bank {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("routingNumber")
  private BigDecimal routingNumber = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    CHECKING("Checking"),
    
    SAVINGS("Savings");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accountType")
  private AccountTypeEnum accountType = null;

  /**
   * Gets or Sets accountCategory
   */
  @JsonAdapter(AccountCategoryEnum.Adapter.class)
  public enum AccountCategoryEnum {
    BUSINESS("Business"),
    
    CONSUMER("Consumer");

    private String value;

    AccountCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountCategoryEnum fromValue(String text) {
      for (AccountCategoryEnum b : AccountCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountCategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accountCategory")
  private AccountCategoryEnum accountCategory = null;

  public Bank firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Bank lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Bank routingNumber(BigDecimal routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  public BigDecimal getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(BigDecimal routingNumber) {
    this.routingNumber = routingNumber;
  }

  public Bank accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Bank accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public Bank accountCategory(AccountCategoryEnum accountCategory) {
    this.accountCategory = accountCategory;
    return this;
  }

   /**
   * Get accountCategory
   * @return accountCategory
  **/
  public AccountCategoryEnum getAccountCategory() {
    return accountCategory;
  }

  public void setAccountCategory(AccountCategoryEnum accountCategory) {
    this.accountCategory = accountCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bank bank = (Bank) o;
    return Objects.equals(this.firstName, bank.firstName) &&
        Objects.equals(this.lastName, bank.lastName) &&
        Objects.equals(this.routingNumber, bank.routingNumber) &&
        Objects.equals(this.accountNumber, bank.accountNumber) &&
        Objects.equals(this.accountType, bank.accountType) &&
        Objects.equals(this.accountCategory, bank.accountCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, routingNumber, accountNumber, accountType, accountCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bank {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
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

