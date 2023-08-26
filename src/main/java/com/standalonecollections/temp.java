package com.standalonecollections;

import java.util.List;

public class temp {
    private List<String> friends;

    public temp() {
    }

    public List<String> getFriends() {
        return this.friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "{" +
                " friends='" + getFriends() + "'" +
                "}";
    }

}
