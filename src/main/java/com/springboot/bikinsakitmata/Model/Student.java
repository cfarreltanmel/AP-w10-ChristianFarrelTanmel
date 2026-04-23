package com.springboot.bikinsakitmata.Model;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String title;
    private String bioParagraph;
    private String personalityText;
    private List<String> socialLinks;
    private Integer age;
    private String hobbies;
    private String favoriteQuote;

    public Student(String firstName, String lastName, String title, String bioParagraph, String personalityText, List<String> socialLinks, Integer Age, String Hobbies, String FavoriteQuote) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.bioParagraph = bioParagraph;
        this.personalityText = personalityText;
        this.socialLinks = socialLinks;
        this.age = Age;
        this.hobbies = Hobbies;
        this.favoriteQuote = FavoriteQuote;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getBioParagraph() { return bioParagraph; }
    public void setBioParagraph(String bioParagraph) { this.bioParagraph = bioParagraph; }
    public String getPersonalityText() { return personalityText; }
    public void setPersonalityText(String personalityText) { this.personalityText = personalityText; }
    public List<String> getSocialLinks() { return socialLinks; }
    public void setSocialLinks(List<String> socialLinks) { this.socialLinks = socialLinks; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getHobbies() { return hobbies; }
    public void setHobbies(String hobbies) { this.hobbies = hobbies; }
    public String getFavoriteQuote() { return favoriteQuote; }
    public void setFavoriteQuote(String favoriteQuote) { this.favoriteQuote = favoriteQuote; }

    public String getFullName() { return firstName + " " + lastName; }
}