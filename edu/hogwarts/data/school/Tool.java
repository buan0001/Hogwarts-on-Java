package edu.hogwarts.data.school;

import edu.hogwarts.data.school.TeachingMaterial;

public class Tool extends TeachingMaterial {
    String name;
    String description;

    public Tool(String name,boolean onShoppingList, boolean required, boolean provided, String notes,  String description){
        super(name,onShoppingList,required,provided,notes);
        
        this.description = description;
    }
}