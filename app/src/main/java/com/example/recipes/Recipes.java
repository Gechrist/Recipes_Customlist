package com.example.recipes;

public class Recipes {

   int id;
   private String title;
   private String description;
   private String url;

    public Recipes (){}

   public Recipes (int id, String title, String description, String url) {
       this.id = id;
       this.title = title;
       this.description = description;
       this.url = url;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
