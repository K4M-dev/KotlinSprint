package org.example.lesson11

class Category(
    val id: Int,
    val namesOfCategory: String,
    val dishesInCategory: MutableList<Recipe>,
    val imageUrl: String = "URL_image",
)

class Recipe(
    val id: Int,
    val dishNameRecipe: String,
    val portions: Int,
    val ingredients: MutableList<Ingredient>,
    var inFavorites: Boolean = false,
    val methodPreparation: String,
    val imageRecipeUrl: String = "URL_image",
) {
    fun addInFavorites() {
        println("Рецепт блюда $dishNameRecipe добавлено в избраное")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Рецепт блюда $dishNameRecipe удалено из избраного")
        inFavorites = false
    }
}

class Ingredient(
    val nameOfIngredient: String,
    val quantityServing: Int,
    val unit: String,
)