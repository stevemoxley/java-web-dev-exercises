package org.launchcode.java.studios.restaurantMenu;

import org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.Category;
import org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.FoodItem;

import java.util.ArrayList;

public class MenuItem {

    private float cost;

    private String name;
    private String description;
    private Boolean isNew;
    private org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.Category category;
    private ArrayList<FoodItem> ingredients;

    public MenuItem(String name, String description, float cost, org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.Category category)
    {
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

}
