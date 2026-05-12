package com.springboot.bikinsakitmata.Model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String title;
    private String bioParagraph;
    private String personalityText;
    private Integer age;
    private String hobbies;
    private String favoriteQuote;

    @ElementCollection
    private List<String> socialLinks; 

    public Student() {}
    public Student(Long id, String firstName, String lastName, String title, String bioParagraph, String personalityText, List<String> socialLinks, Integer Age, String Hobbies, String FavoriteQuote) {
        this.id = id;
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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
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