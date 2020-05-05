package org.launchcode.java.studios.restaurantMenuNew.restaurantMenu;

import java.util.ArrayList;

public class MenuItem {

    private float cost;

    private int id;
    private String name;
    private String description;
    private Boolean isNew;
    private Category category;
    private ArrayList<FoodItem> ingredients;

    public MenuItem(int id, String name, String description, float cost, Category category)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.isNew = true;
        this.category = category;
    }

    //Add getters and setters as needed
    public String getDescription()
    {
        return description;
    }

    public float getCost(){
        return cost;
    }

    public String getName() { return name; }

    public String getIsNew() { return isNew.toString(); }

    public Category getCategory() { return category;  }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return getName() + ": " + getDescription()+ " $"+ getCost();
    }
}
