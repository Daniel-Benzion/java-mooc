
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ionbenz
 */
public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = createRecipeListFromFile(file);
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getName());
            System.out.println(recipe.getTime());
            System.out.println(recipe.getIngredients());
        }
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            parseCommand(command, recipes);
        }

    }

    public ArrayList<Recipe> createRecipeListFromFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();
        String name;
        int time;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (!(line.isEmpty())) {
                    ingredients.add(line);
                } else {
                    name = ingredients.get(0);
                    time = Integer.valueOf(ingredients.get(1));
                    ingredients.remove(0);
                    ingredients.remove(0);
                    recipes.add(new Recipe(name, time, ingredients));
                    ingredients.clear();
                }
            }
            if (!(ingredients.isEmpty())) {
                name = ingredients.get(0);
                time = Integer.valueOf(ingredients.get(1));
                ingredients.remove(0);
                ingredients.remove(0);
                recipes.add(new Recipe(name, time, ingredients));
                ingredients.clear();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

    public void parseCommand(String command, ArrayList<Recipe> recipes) {
        if (command.equalsIgnoreCase("list")) {
            listRecipes(recipes);
            System.out.println("");
        } else if (command.equalsIgnoreCase("find name")) {
            System.out.print("Searched word: ");
            String name = scanner.nextLine();
            nameSearch(name, recipes);
            System.out.println("");
        } else if (command.equalsIgnoreCase("find cooking time")) {
            System.out.print("Max cooking time: ");
            int time = Integer.parseInt(scanner.nextLine());
            timeSearch(time, recipes);
            System.out.println("");
        } else if (command.equalsIgnoreCase("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();
            ingredientSearch(ingredient, recipes);
            System.out.println("");
        }
    }

    public void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
        }
    }

    public void nameSearch(String name, ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }

    public void timeSearch(int time, ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }

    public void ingredientSearch(String ingredient, ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }
}
