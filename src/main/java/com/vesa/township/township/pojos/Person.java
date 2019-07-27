package com.vesa.township.township.pojos;

import java.util.Date;
import java.util.List;

public abstract class Person {

    public String pIdentNum;
    public String firstName;
    public String lastname;
    public Date dateOfBirth;
    public int age;
    public Sex personSex;
    public List<Phone> phones;
    public List<Email> emails;
    public RelationShipType relationShipType;


    public String getpIdentNum() {
        return pIdentNum;
    }

    public void setpIdentNum(String pIdentNum) {
        this.pIdentNum = pIdentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public Sex getPersonSex() {
        return personSex;
    }

    public void setPersonSex(Sex personSex) {
        this.personSex = personSex;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public RelationShipType getRelationShipType() {
        return relationShipType;
    }

    public void setRelationShipType(RelationShipType relationShipType) {
        this.relationShipType = relationShipType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
