package AccClasses

import ShopClass.Shop


/* Class Account mit attribute: name als string, passwort als string, alter als Int
* */
open class Account(var name: String, var psw: String, var age: Int) {


    //variable die zeigt das account abgemeldet ist
    var onOff: Boolean = false

    //textfarben
    val GREEN = "\u001B[32m"
    val RED = "\u001B[31m"
    val YELLOW = "\u001B[33m"
    val RESET = "\u001B[0m"

    //hintergrundfarbe
    val BLACK_BACKGROUND = "\u001B[40m"

    //mutable map mit dem keys in string und values in string die den namen und das passwort der accounts abspeichert
    var accountsPsws: MutableMap<String, String> = mutableMapOf("$name" to "$psw")


    //init das bei jedem erstellen eines neuen accounts eine bestätigung der erstellung mit accountname wieder gibt
    //init {
        //println(BLACK_BACKGROUND + GREEN + "Es wurde ein neuer Account erstellt Namen´s: " + RESET + " $name")
    //}

    //methode zum Anmelden mit einer if els verzweigung die prüft ob account existiert un passwort korrekt ist
    open fun login(){

        var shop: Shop = Shop()

        try {

            println(BLACK_BACKGROUND + YELLOW + "Bitte gebe deinen Namen an?")
            name = readln().lowercase()

            println(BLACK_BACKGROUND + YELLOW + "Wie ist dein Password?")
            psw = readln().lowercase()

            if (name in accountsPsws.keys && psw in accountsPsws.values) {

                onOff = true
                println(BLACK_BACKGROUND + GREEN + "Du bist jetzt Angemeldet!")
                shop.menue()

            } else{

                println(BLACK_BACKGROUND + RED + "Login fehlgeschlagen, versuche es erneut!")
                shop.customer()
            }

        } catch (e: Exception) {
            println(BLACK_BACKGROUND + RED + "Dies ist keine korrekte angabe:$e!")
            shop.customer()
        }
    }

    //methode die account abmeldet
    fun logout() {

        var shop: Shop = Shop()


        onOff = false

        if (!onOff) {
            println(BLACK_BACKGROUND + GREEN + "Du bist jetzt Abgemeldet!")
            shop.hello()
        } else {
            println(BLACK_BACKGROUND + RED + "Du bist nicht Angemeldet!")
            shop.hello()
        }
    }

    //methode die es ermöglicht account zu löschen
    fun accDelete() {

        var shop: Shop = Shop()


        if (name in accountsPsws) {
            accountsPsws.remove(name)
            println(BLACK_BACKGROUND + GREEN + "Der Account wurde gelöscht!")
            shop.hello()
        } else {
            println(BLACK_BACKGROUND + RED + "Der account existiert nicht!")
            shop.hello()
        }
    }
}