package foodloop;

import java.util.List;

public class ComboMeal {

    private String comboName;
    private List<FoodItem> items;

    public ComboMeal(String comboName, List<FoodItem> items) {
        this.comboName = comboName;
        this.items = items;
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public String getComboName() {
        return comboName;
    }
}
