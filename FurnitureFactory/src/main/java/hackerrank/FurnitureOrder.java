package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	HashMap<Furniture, Integer> orderQuantities = new HashMap<>();

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
    	
    	orderQuantities.put(type, furnitureCount);
        // TODO: Complete the method
    	
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return orderQuantities;
    }

    public float getTotalOrderCost() {
    	  // TODO: Complete the method
    		float totalCount = 0.0f;
    	for ( Entry<Furniture, Integer> orderQuantitie : orderQuantities.entrySet()) {
    		totalCount = orderQuantitie.getKey().cost() * orderQuantitie.getValue();
    		
    	}
        return totalCount;
    }

    public int getTypeCount(Furniture type) {
    	
    	if(orderQuantities.get(type) != null) {
    		return orderQuantities.get(type);
    	}
        return -1;
    }

    public float getTypeCost(Furniture type) {
        return type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return orderQuantities.values().stream().mapToInt(Integer::intValue).sum();
    }
}
