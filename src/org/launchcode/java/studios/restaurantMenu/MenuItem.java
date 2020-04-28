package org.launchcode.java.studios.restaurantMenu;

import java.util.ArrayList;

public class MenuItem {
    private float cost;
    private String description;
    private Boolean isNew;
    private Category category;
    private ArrayList<FoodItem> ingredients;

    public MenuItem(String description, float cost)
    {
        this.description = description;
        this.cost = cost;
    }

    //Add getters and setters as needed
    public String getDescription()
    {
        return description;
    }

    public float getCost(){
        return cost;
    }
}
