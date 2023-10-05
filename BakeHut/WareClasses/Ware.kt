package WareClasses

open class Ware( var name: String, var price: Double) {

    //textfarbe
    val YELLOW = "\u001B[33m"
    val GREEN = "\u001B[32m"
    val RED = "\u001B[31m"

    //hintergrundfarbe
    val BLACK_BACKGROUND = "\u001B[40m"

    //Liste der waren
    var warenListe: MutableList<String> = mutableListOf()

    //init das bei jedem erstellen einer neuen ware das erstellen bestätigt
    //init{
        //println(BLACK_BACKGROUND+GREEN+"Neue Ware $name mit dem Preis $price € wurde erstellt!")
    //}

    //info der ware(name und preis)
    fun Info() {

        println(BLACK_BACKGROUND+YELLOW+"Der/Die $name kostet $price€!")
    }

    //methode in der man eine neue ware erstellen kann
    fun newWare() {

        //namen angabe
        try {
            println(BLACK_BACKGROUND+YELLOW+"Gib einen Namen an?")
            name = readln()
            warenListe.add(name)

        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e")
        }

        //Preis angabe
        try {
            println(BLACK_BACKGROUND+YELLOW+"Gib jetzt noch einen Preis an?")
            price = readln().replace(",", ".").toDouble()
            println(BLACK_BACKGROUND+GREEN+"Die Ware $name mit dem Preis $price wurde erstellt!")

        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Dies ist keine Zahl mit 2 stellen nach dem komma!")
        }
    }
}