package com.vesa.township.township.pojos;

public class Phone {

    public String phonNum;
    public ContactType phoneType;
    public boolean notification;

    public String getPhonNum() {
        return phonNum;
    }

    public void setPhonNum(String phonNum) {
        this.phonNum = phonNum;
    }

    public ContactType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(ContactType phoneType) {
        this.phoneType = phoneType;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }
}
