package com.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class emp {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties props;

    public String getName() {
        return name;
    }

    public Properties getProps() {
        return this.props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
        super();
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public emp() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "emp [name=" + name + ", \nphones=" + phones + ",\naddresses=" + addresses + ", \ncourses=" + courses
                + "]";
    }

}
