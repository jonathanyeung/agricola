package agricola;

public interface FoodConverter {
    int getConvertableQuantity(FoodConvertable toBeConverted);

    int foodProduced(FoodConvertable toBeConverted, int quantity);
}
