package ru.korolevss.profile

import ru.korolevss.profile.view.View
import ru.korolevss.profile.view.ViewGroup
import ru.korolevss.profile.widget.Button
import ru.korolevss.profile.widget.TextView

fun main() {
    val view = View()
    view.click()

    val textView = TextView("text from textView")
    println("textView.text() ${textView.text}")
    textView.text = "another text from textView"
    println("textView.text() ${textView.text}")

    val button = Button("text from Button")
    println("button.text() ${button.text}")
    button.text = "another text from Button"
    println("button.text() ${button.text}")

    val viewGroup = ViewGroup()
    viewGroup.addView(button)
    viewGroup.view.click()
}