package com.codeline.mohasb.utility;

public class Info {
    private String name;
    private String location;
    private String language;

    public Info(String name, String location, String language) {
        this.name = name;
        this.location = location;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getLanguage() {
        return language;
    }
}
