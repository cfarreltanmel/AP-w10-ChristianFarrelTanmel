package com.springboot.bikinsakitmata.Model;

public class PageState {
    private boolean darkMode = false;
    private boolean showPersonality = false;
    public boolean isDarkMode() { return darkMode; }
    public void setDarkMode(boolean darkMode) { this.darkMode = darkMode; }
    public boolean isShowPersonality() { return showPersonality; }
    public void setShowPersonality(boolean showPersonality) { this.showPersonality = showPersonality; }
}