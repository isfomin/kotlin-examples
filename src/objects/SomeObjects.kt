package objects

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${id}: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()

    // Сохранение информации о пользователе в базе данных
}

fun executeSomeCode() {
    //demo1()
    demo2()
}

fun demo1() {
    saveUser(User(1, "", ""))
}

fun demo2() {
    val button = Button();
    button.showOff()
    button.setFocus(true)
    button.click()
}