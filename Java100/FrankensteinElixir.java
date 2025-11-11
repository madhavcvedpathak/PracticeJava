package Java100;
import java.util.*;

public class FrankensteinElixir {

    public FrankensteinElixir(){
        System.out.println("In Constructor");
    }

    // Map: potion -> list of possible recipes
    private static Map<String, List<List<String>>> potionRecipes = new HashMap<>();

    // Cache for memoization
    private static Map<String, Integer> minCostCache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of recipes
        int numberOfRecipes = Integer.parseInt(scanner.nextLine().trim());

        // Read all recipes
        for (int i = 0; i < numberOfRecipes; i++) {
            String line = scanner.nextLine().trim();

            // Each recipe is in format: potion=ingredient1+ingredient2+...
            String[] parts = line.split("=");
            String potion = parts[0].trim();
            String[] ingredients = parts[1].split("\\+");

            potionRecipes
                    .computeIfAbsent(potion, key -> new ArrayList<>())
                    .add(Arrays.asList(ingredients));
        }

        // Target potion
        String targetPotion = scanner.nextLine().trim();

        // Calculate and print result
        int result = calculateMinimumOrbs(targetPotion);
        System.out.println(result);

        scanner.close();
    }

    /**
     * Recursive function to calculate the minimum magical orbs required
     * for brewing a potion.
     */
    private static int calculateMinimumOrbs(String potion) {
        // Already computed
        if (minCostCache.containsKey(potion)) {
            return minCostCache.get(potion);
        }

        // If potion is a base item (not in recipes)
        if (!potionRecipes.containsKey(potion)) {
            minCostCache.put(potion, 0);
            return 0;
        }

        int bestCost = Integer.MAX_VALUE;

        // Try all recipes for this potion
        for (List<String> ingredients : potionRecipes.get(potion)) {
            int recipeCost = ingredients.size() - 1; // orbs for mixing
            for (String ingredient : ingredients) {
                recipeCost += calculateMinimumOrbs(ingredient);
            }
            bestCost = Math.min(bestCost, recipeCost);
        }

        minCostCache.put(potion, bestCost);
        return bestCost;
    }
}
