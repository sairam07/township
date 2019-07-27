package com.vesa.township.township.pojos;

import org.apache.commons.lang3.StringUtils;

public class Email {

    public String email;
    public ContactType emailType;
    public boolean notificatins;

    public Email() {
        email = StringUtils.EMPTY;
        notificatins = true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContactType getEmailType() {
        return emailType;
    }

    public void setEmailType(ContactType emailType) {
        this.emailType = emailType;
    }

    public boolean isNotificatins() {
        return notificatins;
    }

    public void setNotificatins(boolean notificatins) {
        this.notificatins = notificatins;
    }
}
