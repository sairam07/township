package com.vesa.township.township.pojos;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Community {

    public String communityName;
    public String communityInfo;
    public Address communityAddress;
    public int blocks;
    public List<Flat> flats;

    public Community() {
        communityName = StringUtils.EMPTY;
        communityInfo = StringUtils.EMPTY;
        communityAddress = new Address();
        flats = new ArrayList<>();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityInfo() {
        return communityInfo;
    }

    public void setCommunityInfo(String communityInfo) {
        this.communityInfo = communityInfo;
    }

    public Address getCommunityAddress() {
        return communityAddress;
    }

    public void setCommunityAddress(Address communityAddress) {
        this.communityAddress = communityAddress;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }
}
