package collections

fun createMap(): Map<String, Int> {
    return mapOf("Вася" to 45, "Денис" to 35, "Катя" to 26)
}

val xml = """
    <note>
        <to>Tove</to>
        <from>Jani</from>
        <heading>Reminder</heading>
        <body>Don't forget me this weekend!</body>
    </note>
""".trimIndent()

fun executeSomeCode() {
    //println(xml)
}