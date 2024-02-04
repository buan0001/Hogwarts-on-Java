public class Ingredient extends TeachingMaterial {

  String name;
  double amount;
  String unit;

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
