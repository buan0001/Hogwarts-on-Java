abstract class TeachingMaterial {

  String name;
  boolean onShoppingList;
  boolean required;
  boolean provided;
  String notes;

  public TeachingMaterial(
    String name,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes
  ) {
    this.name = name;
    this.onShoppingList = onShoppingList;
    this.required = required;
    this.provided = provided;
    this.notes = notes;
  }
}
