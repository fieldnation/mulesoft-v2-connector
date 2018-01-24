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
import com.google.gson.annotations.SerializedName;
import com.fieldnation.models.StaffrecruitmentsendcommunicationsworkOrderIdStaff;

/**
 * InlineResponse2002
 */

public class InlineResponse2002 {
  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("contact_method")
  private String contactMethod = null;

  @SerializedName("messageId")
  private String messageId = null;

  @SerializedName("email_template")
  private Integer emailTemplate = null;

  @SerializedName("staff_template")
  private Integer staffTemplate = null;

  @SerializedName("contacted_at")
  private Integer contactedAt = null;

  @SerializedName("staff")
  private StaffrecruitmentsendcommunicationsworkOrderIdStaff staff = null;

  public InlineResponse2002 userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public InlineResponse2002 contactMethod(String contactMethod) {
    this.contactMethod = contactMethod;
    return this;
  }

   /**
   * Get contactMethod
   * @return contactMethod
  **/

  public String getContactMethod() {
    return contactMethod;
  }

  public void setContactMethod(String contactMethod) {
    this.contactMethod = contactMethod;
  }

  public InlineResponse2002 messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public InlineResponse2002 emailTemplate(Integer emailTemplate) {
    this.emailTemplate = emailTemplate;
    return this;
  }

   /**
   * Get emailTemplate
   * @return emailTemplate
  **/

  public Integer getEmailTemplate() {
    return emailTemplate;
  }

  public void setEmailTemplate(Integer emailTemplate) {
    this.emailTemplate = emailTemplate;
  }

  public InlineResponse2002 staffTemplate(Integer staffTemplate) {
    this.staffTemplate = staffTemplate;
    return this;
  }

   /**
   * Get staffTemplate
   * @return staffTemplate
  **/

  public Integer getStaffTemplate() {
    return staffTemplate;
  }

  public void setStaffTemplate(Integer staffTemplate) {
    this.staffTemplate = staffTemplate;
  }

  public InlineResponse2002 contactedAt(Integer contactedAt) {
    this.contactedAt = contactedAt;
    return this;
  }

   /**
   * Get contactedAt
   * @return contactedAt
  **/

  public Integer getContactedAt() {
    return contactedAt;
  }

  public void setContactedAt(Integer contactedAt) {
    this.contactedAt = contactedAt;
  }

  public InlineResponse2002 staff(StaffrecruitmentsendcommunicationsworkOrderIdStaff staff) {
    this.staff = staff;
    return this;
  }

   /**
   * Get staff
   * @return staff
  **/

  public StaffrecruitmentsendcommunicationsworkOrderIdStaff getStaff() {
    return staff;
  }

  public void setStaff(StaffrecruitmentsendcommunicationsworkOrderIdStaff staff) {
    this.staff = staff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.userId, inlineResponse2002.userId) &&
        Objects.equals(this.contactMethod, inlineResponse2002.contactMethod) &&
        Objects.equals(this.messageId, inlineResponse2002.messageId) &&
        Objects.equals(this.emailTemplate, inlineResponse2002.emailTemplate) &&
        Objects.equals(this.staffTemplate, inlineResponse2002.staffTemplate) &&
        Objects.equals(this.contactedAt, inlineResponse2002.contactedAt) &&
        Objects.equals(this.staff, inlineResponse2002.staff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, contactMethod, messageId, emailTemplate, staffTemplate, contactedAt, staff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contactMethod: ").append(toIndentedString(contactMethod)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    emailTemplate: ").append(toIndentedString(emailTemplate)).append("\n");
    sb.append("    staffTemplate: ").append(toIndentedString(staffTemplate)).append("\n");
    sb.append("    contactedAt: ").append(toIndentedString(contactedAt)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
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

