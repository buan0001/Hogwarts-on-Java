package edu.hogwarts.data.school;

import edu.hogwarts.data.school.TeachingMaterial;

public class Ingredient extends TeachingMaterial {

  String name;
  double amount;
  String unit;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Ingredient(
    String name,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes,
    double amount,
    String unit
  ) {
    super(name, onShoppingList, required, provided, notes);
    this.amount = amount;
    this.unit = unit;
  }

}
