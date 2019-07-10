package com.example.recipes;

public class Recipes {

   private String title;
   private String description;
   private int imageid;

    public Recipes (){};

   public Recipes (String title, String description, int imageid) {
       this.title = title;
       this.description = description;
       this.imageid = imageid;
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

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

}
