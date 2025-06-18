package org.example.lesson_22

data class MainScreenState(
    val data: String?,
    val isLoading: Boolean = false,
)

class MainScreenViewModel(
    private var mainScreenState: MainScreenState = MainScreenState(data = null, isLoading = false)
) {
    fun loadData() {
        println("Отсутствие данных")
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Загрузка данных")
        mainScreenState = mainScreenState.copy(data = "Источник1", isLoading = false)
        println("Загрузка завершена")
    }
}

fun main() {

    val screen1 = MainScreenViewModel()
    screen1.loadData()
}