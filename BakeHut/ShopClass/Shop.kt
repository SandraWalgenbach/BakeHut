package ShopClass

import AccClasses.Kunde
import WareClasses.*

public final class Shop {

    //textfarbe
    val BLUE = "\u001B[34m"
    val GREEN = "\u001B[32m"
    val CYAN = "\u001B[36m"
    val YELLOW = "\u001B[33m"
    val RED = "\u001B[31m"
    val RESET = "\u001B[0m"

    //hintergrundfarbe
    val BLACK_BACKGROUND = "\u001B[40m"

    var kunde: Kunde = Kunde("Kiara", "1234", 15, 150.00)

    //initialisierte kuchen
    var kuchenVegan: Kuchen = Kuchen("Veganer Kuchen", 7.99, true, true, 0, false, false, true, true)
    var kuchenSchoko: Kuchen = Kuchen("Schokokuchen", 6.99, true, true, 3, true, true, true, false)
    var kuchenVanille: Kuchen = Kuchen("Vanillekuchen", 6.99, true, true, 3, true, true, true, false)

    //kuchenliste
    var kuchenList: MutableList<String> = mutableListOf(kuchenVegan.name, kuchenSchoko.name, kuchenVanille.name)

    //initialisierte torten
    var torteKirsch: Torte = Torte("Schwarzwälder Kirschtorte", 9.99, true, true, 4, true, true, true, false, true, 2)
    var torteVegan: Torte = Torte("Vegane Torte", 10.99, true, true, 0, false, false, true, true, true, 3)
    var torteSchoko: Torte = Torte("Schokoladentorte", 8.99, true, true, 4, true, true, true, false, true, 3)

    //tortenliste
    var tortenList: MutableList<String> = mutableListOf(torteKirsch.name, torteVegan.name, torteSchoko.name)

    //initialisierte muffins
    var muffinVegan: Muffin = Muffin("Veganger Muffin", 3.99, true, true, 0, false, false, true, true)
    var muffinSchoko: Muffin = Muffin("Schokoladen Muffin", 2.99, true, true, 1, true, true, true, false)
    var muffinVanille: Muffin = Muffin("Vanille Muffin", 2.99, true, true, 1, true, true, true, false)

    //muffinliste
    var muffinList: MutableList<String> = mutableListOf(muffinVegan.name, muffinSchoko.name, muffinVanille.name)

    //initialisierte cupcakes
    var cupVegan: Cupcake = Cupcake("Veganer Cupcake", 4.99, true, true, 0, false, false, true, true)
    var cupSchoko: Cupcake = Cupcake("Schokoladen Cupcake", 3.99, true, true, 4, true, true, true, false)
    var cupVanille: Cupcake = Cupcake("Vanille Cupcake", 3.99, true, true, 4, true, true, true, false)

    //cupcakeliste
    var cupcakeList: MutableList<String> = mutableListOf(cupVegan.name, cupSchoko.name, cupVanille.name)

    //methode namens hello, die eine begrüßung für den kunden wiedergibt und in die methode customer weiterleitet
    fun hello() {
        println(BLACK_BACKGROUND + CYAN + "Willkommen bei Cake Hut!")
        customer()
    }

    //methode namens customer, die mit der konsole abfragt ob man schon kunde ist oder nicht, wenn schon kunde dann wird zu methode login, wenn nicht dann zur methode newAcc weitergeleitet
    fun customer() {

        try {

            println(BLACK_BACKGROUND + YELLOW + "Hast du schon ein Account bei uns?" + RESET + " //1=Ja, 2=Nein")
            var acc: Int = readln().toInt()

            when (acc) {
                1 -> kunde.login()
                2 -> kunde.newAcc()
                else -> customer()
            }
        } catch (e: Exception) {
            println(BLACK_BACKGROUND + RED + "$e: Dies ist keine 1 oder 2!")
        }
    }

    //methode mit dem namen menue mit derman durch den shop navigieren kann
    fun menue() {

        try {
            println(BLACK_BACKGROUND + YELLOW + "Was möchtest du machen?" + RESET + "1=Stöbern, 2=Selbst erstellen, //3=Warenkorb, 4=Logout, 5=Löschen")
            var wahl = readln().toInt()

            when (wahl) {
                1 -> browse()
                2 -> selfemade()
                3 -> println(kunde.shoppingCart)
                4 -> kunde.logout()
                5 -> kunde.accDelete()
                else -> menue()
            }
        } catch (e: Exception) {
            println(BLACK_BACKGROUND + RED + "Dies ist keine Zahl zwichen 1 und 5!")
        }
    }

    //methode namens browse, in der man sich bestehende ware anschauen kann
    fun browse() {

        try {
            println(BLACK_BACKGROUND + YELLOW + "Was möchtest du dir anschauen?" + RESET + "1=Kuchen, 2=Torten, 3=Muffins, 4=Cupcakes, 5=Zurück")
            var kategorie = readln().toInt()

            when (kategorie) {
                1 -> println(BLACK_BACKGROUND+BLUE + kuchenList)
                2 -> println(BLACK_BACKGROUND+BLUE + tortenList)
                3 -> println(BLACK_BACKGROUND+BLUE + muffinList)
                4 -> print(BLACK_BACKGROUND+BLUE + cupcakeList)
                5 -> menue()
                else -> browse()
            }

        } catch (e: Exception){
            println(BLACK_BACKGROUND + RED + "Dies ist keine Zahl zwichen 1 und 4!")
        }
    }


    fun selfemade(){

         try{
             println(BLACK_BACKGROUND+YELLOW+"Welches gebäck möchtest du dir selbst gestallten? 1=Kuchen, 2= Torte, 3=Muffin, 4=Cupcacke")
             var selfe = readln().toInt()

             when(selfe){
                 1 -> kuchenVanille.selfmadeCake()
                 2 -> torteKirsch.selfmadeTort()
                 3 -> muffinSchoko.selfmadeMuffin()
                 4 -> cupSchoko.selfmadeCup()
            }

        }catch(e: Exception){
            println(BLACK_BACKGROUND+RED+"$e: Dies ist keine korrekte angabe!")
        }
    }
}
