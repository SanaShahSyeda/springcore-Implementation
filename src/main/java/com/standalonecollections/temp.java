package com.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class temp {
    private List<String> friends;
    private Map<String, Integer> feestructure;
    private Properties properties;

    public temp() {
    }

    public temp(List<String> friends, Map<String, Integer> feestructure, Properties properties) {
        this.friends = friends;
        this.feestructure = feestructure;
        this.properties = properties;
    }

    public Map<String, Integer> getFeestructure() {
        return this.feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    public List<String> getFriends() {
        return this.friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Properties getProperties() {
        return this.properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "{" +
                " friends='" + getFriends() + "'" +
                " feestructure='" + getFeestructure() + "'" +
                " properties='" + getProperties() + "'" +
                "}";
    }

}
