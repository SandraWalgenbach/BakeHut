package AccClasses

import ShopClass.Shop

//claas kunde mit attribut bank und der vererbung von name passwort und alter aus class account
class Kunde(name: String, psw: String, age: Int, var bank: Double) : Account(name, psw, age) {

    var shoppingCart: MutableMap<String, Double> = mutableMapOf()

    //methode die es ermöglicht mit der konsole einen neuen account zu erstellen
    //und einer if else verzweigung die prüft ob es einen account mit dem namen gibt und ob alt genug ist
    fun newAcc() {

        var shop: Shop = Shop()


        try {

            println(BLACK_BACKGROUND + YELLOW + "Gebe einen neuen Accountnamen an?")
            name = readln().lowercase()

            println(BLACK_BACKGROUND + YELLOW + "Gebe ein Password an?")
            psw = readln().lowercase()

            println(BLACK_BACKGROUND + YELLOW + "Gebe dein Alter an?")
            age = readln().toInt()

            println(BLACK_BACKGROUND + YELLOW +"Wie viel Geld hast du zur verfügung?")
            bank = readln().replace(",", ".").toDouble()

            if (name !in accountsPsws.keys && age >= 12) {

                accountsPsws[name] = psw
                println(BLACK_BACKGROUND + GREEN + "Neuer Account wurde erstellt!")
                login()

            } else{
                println(BLACK_BACKGROUND + RED + "Einen Account mit dem Namen: $name gibt es bereits oder du bist zu jung!")
                shop.hello()
            }

        } catch (e: Exception) {

            println(BLACK_BACKGROUND + RED + "Dies ist keine Korrekte angabe:$e!")
            shop.hello()
        }
    }

    //fun pay(): Double {

    //var totalPrice = 0.0

    //for (ware in kunde.shoppingCart) {
    //totalPrice + ware.price

    //}

    //if (kunde.bank > totalPrice) {

    //var total = kunde.bank - totalPrice
    //kunde.bank = total

    //println("Du hast soeben $totalPrice € bezahlt!")
    //} else {

    //println("Du hast nicht genug Geld auf deinem Konto!")
    //}

    //return totalPrice
    //}
}