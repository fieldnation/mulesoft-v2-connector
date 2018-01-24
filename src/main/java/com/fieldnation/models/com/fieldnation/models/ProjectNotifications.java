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
import com.fieldnation.models.ProjectNotificationsEmailSubject;

/**
 * ProjectNotifications
 */

public class ProjectNotifications {
  @SerializedName("email_subject")
  private ProjectNotificationsEmailSubject emailSubject = null;

  @SerializedName("email_body")
  private ProjectNotificationsEmailSubject emailBody = null;

  @SerializedName("digest_email")
  private ProjectNotificationsEmailSubject digestEmail = null;

  @SerializedName("sms")
  private ProjectNotificationsEmailSubject sms = null;

  @SerializedName("notification")
  private ProjectNotificationsEmailSubject notification = null;

  public ProjectNotifications emailSubject(ProjectNotificationsEmailSubject emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Get emailSubject
   * @return emailSubject
  **/

  public ProjectNotificationsEmailSubject getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(ProjectNotificationsEmailSubject emailSubject) {
    this.emailSubject = emailSubject;
  }

  public ProjectNotifications emailBody(ProjectNotificationsEmailSubject emailBody) {
    this.emailBody = emailBody;
    return this;
  }

   /**
   * Get emailBody
   * @return emailBody
  **/

  public ProjectNotificationsEmailSubject getEmailBody() {
    return emailBody;
  }

  public void setEmailBody(ProjectNotificationsEmailSubject emailBody) {
    this.emailBody = emailBody;
  }

  public ProjectNotifications digestEmail(ProjectNotificationsEmailSubject digestEmail) {
    this.digestEmail = digestEmail;
    return this;
  }

   /**
   * Get digestEmail
   * @return digestEmail
  **/

  public ProjectNotificationsEmailSubject getDigestEmail() {
    return digestEmail;
  }

  public void setDigestEmail(ProjectNotificationsEmailSubject digestEmail) {
    this.digestEmail = digestEmail;
  }

  public ProjectNotifications sms(ProjectNotificationsEmailSubject sms) {
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/

  public ProjectNotificationsEmailSubject getSms() {
    return sms;
  }

  public void setSms(ProjectNotificationsEmailSubject sms) {
    this.sms = sms;
  }

  public ProjectNotifications notification(ProjectNotificationsEmailSubject notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/

  public ProjectNotificationsEmailSubject getNotification() {
    return notification;
  }

  public void setNotification(ProjectNotificationsEmailSubject notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectNotifications projectNotifications = (ProjectNotifications) o;
    return Objects.equals(this.emailSubject, projectNotifications.emailSubject) &&
        Objects.equals(this.emailBody, projectNotifications.emailBody) &&
        Objects.equals(this.digestEmail, projectNotifications.digestEmail) &&
        Objects.equals(this.sms, projectNotifications.sms) &&
        Objects.equals(this.notification, projectNotifications.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, emailBody, digestEmail, sms, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectNotifications {\n");
    
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    sb.append("    digestEmail: ").append(toIndentedString(digestEmail)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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

