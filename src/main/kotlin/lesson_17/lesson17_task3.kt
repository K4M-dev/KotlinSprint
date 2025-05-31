package org.example.lesson_17

class FolderLes17(
    private var name: String,
    private var numberOfFiles: Int,
    private var secret: Boolean,
) {
    val folderName: String
        get() = if (secret) "Скрытое имя" else name

    val filesCount: Int
        get() = if (secret) 0 else numberOfFiles
}

fun main() {
    val folder1 = FolderLes17("1", 2, true)
    val folder2 = FolderLes17("2", 10, false)

    println(folder1.folderName)
    println(folder1.filesCount)

    println(folder2.folderName)
    println(folder2.filesCount)
}