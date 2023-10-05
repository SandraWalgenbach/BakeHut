package WareClasses

import AccClasses.Kunde
import ShopClass.Shop

open class Muffin (name: String,
                   preis: Double,
                   var mehl: Boolean,
                   var zucker: Boolean,
                   var eier: Int,
                   var butter: Boolean,
                   var milch: Boolean,
                   var backpulver: Boolean,
                   var vegan: Boolean): Ware(name, preis){

    var zutatenMuffin: MutableList<String> = mutableListOf()
    var extraMuffin: MutableList<String> = mutableListOf()

    fun muffinInfo(
        name: String,
        mehl: Boolean,
        zucker: Boolean,
        eier: Int,
        butter: Boolean,
        milch: Boolean,
        backpulver: Boolean,
        vegan: Boolean
    ) {

        println("Nachfolgende Zutaten befinden sich im $name:")

        if (mehl) {
            println("Mehl = Ja")
        } else {
            println("Mehl = Nein")
        }

        if (zucker) {
            println("Zucker = Ja")
        } else {
            println("Zucker = Nein")
        }

        if (butter) {
            println("Butter = Ja")
        } else {
            println("Butter = Nein")
        }

        if (milch) {
            println("Milch = Ja")
        } else {
            println("Milch = Nein")
        }

        if (backpulver) {
            println("Backpulver = Ja")
        } else {
            println("Backpulver = Nein")
        }

        if (eier > 0) {
            println("Eier = Ja")
        } else {
            println("Eier = Nein")
        }
    }

    fun selfmadeMuffin() {

        try {

            price = 3.00
            println("Jeder Preis liegt bei 3,00€, jedes extra kostet 0,50€ mehr!")

            //Teigsorte?
            println("Wähle zwichen 1=Vanille oder 2=Schokoladen Teig?")
            var teig: Int = readln().toInt()

            if (teig == 1) {
                println("Du hast dich für Vanille Teig entschieden!")
                zutatenMuffin.add("Vanille")
            }
            if (teig == 2) {
                println("Du hast dich für Schokolade entschieden!")
                zutatenMuffin.add("Schokoladenpulver")
            }

            //Teig Nüsse?
            println("Möchtest du Nüsse in deinem Teig? 1=Ja  oder 2=Nein")
            var nüsseWahl: Int = readln().toInt()

            if (nüsseWahl == 1) {
                println("Welche Nusssorte möchtest du? 1=Kokosnuss, 2=Haselnuss, 3=Walnuss,4=Erdnuss, 5=Mandel")
                var nussWahl: Int = readln().toInt()

                if (nussWahl == 1) {
                    println("Du hast dich für Kokosnuss in deinem Teig entschieden!")
                    zutatenMuffin.add("Kokosnuss")
                    price += 0.50
                }

                if (nussWahl == 2) {
                    println("Du hast dich für Haselnuss in deinem Teig entschieden!")
                    zutatenMuffin.add("Haselnuss")
                    price += 0.50
                }

                if (nussWahl == 3) {
                    println("Du hast dich für Walnuss in deinem Teig entschieden!")
                    zutatenMuffin.add("Walnuss")
                    price += 0.50
                }

                if (nussWahl == 4) {
                    println("Du hast dich für Erdnuss in deinem Teig entschieden!")
                    zutatenMuffin.add("Erdnuss")
                    price += 0.50
                }

                if (nussWahl == 5) {
                    println("Du hast dich für Mandel in deinem Teig entschieden!")
                    zutatenMuffin.add("Mandel")
                    price += 0.50
                }
            }

            //Teig Früchte?
            println("Möchtest du Früchte in deinem Teig haben? 1=Ja oder 2=Nein")
            var fruchtWahl: Int = readln().toInt()

            if (fruchtWahl == 1) {
                println("Welche Frucht möchtest du in deinem Teig? 1=Apfel, 2=Birne, 3=Blaubeere, 4=Himbeere, 5=Kirsche oder 6=3 Sorten Johannisbeere")
                var früchteWahl: Int = readln().toInt()

                if (früchteWahl == 1) {
                    println("Du hast dich für Apfel in deinem Teig entschieden!")
                    zutatenMuffin.add("Apfel")
                    price += 0.50
                }

                if (früchteWahl == 2) {
                    println("Du hast dich für Birne in deinem Teig entschieden!")
                    zutatenMuffin.add("Birne")
                    price += 0.50
                }

                if (früchteWahl == 3) {
                    println("Du hast dich für Blaubeere in deinem Teig entschieden!")
                    zutatenMuffin.add("Blaubeere")
                    price += 0.50
                }

                if (früchteWahl == 4) {
                    println("Du hast dich für Himbeere in deinem Teig entschieden!")
                    zutatenMuffin.add("Himbeere")
                    price += 0.50
                }

                if (früchteWahl == 5) {
                    println("Du hast dich für Kirsche in deinem Teig entschieden!")
                    zutatenMuffin.add("Kirsche")
                    price += 0.50
                }

                if (früchteWahl == 6) {
                    println("Du hast dich für 3 Sorten Johannisbeere in deinem Teig entschieden!")
                    zutatenMuffin.add("3 Sorten Johannisbeere")
                    price += 0.50
                }
            }

            //Mehlsorte?
            println("Welches Mehl möchtest du 1=Weizenmehl oder 2=Kokosnussmehl")
            var mehlWahl: Int = readln().toInt()

            if (mehlWahl == 1) {
                println("Du hast dich für Weizenmehl entschieden!")
                zutatenMuffin.add("Weizenmehl")
            }
            if (mehlWahl == 2) {
                println("Du hast dich für Kokosnussmehl entschieden!")
                zutatenMuffin.add("Kokosnussmehl")
            }

            //Vegan?
            println("Soll Der Teig Vegan sein? 1=Ja oder 2=Nein")
            var veganWahl: Int = readln().toInt()

            if (veganWahl == 1) {
                println("Du hast dich dafür entschieden das der Kuchenteig Vegan sein soll: Eier werden gegen Banane Getauscht, Butter wird gegegn Pflanzenfett getauscht und Milch wird gegen Reismilch getauscht")
                zutatenMuffin.add("Banane")
                zutatenMuffin.add("Pflanzenfett")
                zutatenMuffin.add("Reismilch")

                vegan = true

            }
            if (veganWahl == 2) {
                println("Es bleibt bei Eiern, Butter und Milch im Teig!")
                zutatenMuffin.add("Eier")
                zutatenMuffin.add("Butter")
                zutatenMuffin.add("Milch")

                vegan = false
            }

            //Zucker?
            println("Möchtest du Zucker in deinem Muffin? 1=Ja oder 2=Nein")
            var zuckerWahl: Int = readln().toInt()

            if (zuckerWahl == 1) {
                println("Du hast dich für einen Muffin mit Zucker entschieden!")
                zucker = true
                zutatenMuffin.add("Zucker")
            }
            if (zuckerWahl == 2) {
                println("Du möchtst einen Muffin ohne Zucker!")
                zucker = false
            }
            extrasMuffin()
        } catch (e: Exception) {
            println("$e: Dies ist keine korrekte angabe!")
        }
    }

    fun extrasMuffin() {

        try {
            //Extra
            println("Möchtest du noch Extras auf deinem Muffin? 1=Ja oder 2=Nein")
            var extraWahl: Int = readln().toInt()

            if (extraWahl == 1) {
                println("Welches Extra möchtest du auf deinem Muffin? 1=Streusel, 2=Schokoraspel, 3=Früchte")
                var extra: Int = readln().toInt()

                //Streusel
                if (extra == 1) {
                    println("Du hast dich für Streusel auf deinem Muffin entschieden!")
                    println("Welche Streuselsorte möchtest du? 1=3 Sorten Schokolade oder 2=Bunt")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println("Du hast dich für 3 Sorten Schokoladenstreusel entschieden!")
                        extraMuffin.add("3 Sorten Schokoladenstreusel")
                        price += 0.50
                        extrasMuffin()
                    }
                    if (streuselWahl == 2) {
                        println("Du hast dich für Bunte Streusel entschieden!")
                        extraMuffin.add("Bunte Streusel")
                        price += 0.50
                        extrasMuffin()
                    }
                }

                //Schokoraspeln
                if (extra == 2) {
                    println("Du hast dich für Schokoraspeln auf deinem Muffin entschieden!")
                    println("Welche Schokoraspelsorte möchtest du? 1=Vollmilch, 2=Zartbitter oder 3=Weiße")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println("Du hast dich für Vollmilchschokoladenraspeln entschieden!")
                        extraMuffin.add("Vollmilchschokoladenraspeln")
                        price += 0.50
                        extrasMuffin()
                    }

                    if (streuselWahl == 2) {
                        println("Du hast dich für Zartbitterschokoladenraspeln entschieden!")
                        extraMuffin.add("Vollmilchschokoladenraspeln")
                        price += 0.50
                        extrasMuffin()
                    }

                    if (streuselWahl == 3) {
                        println("Du hast dich für Weiße Schokoladenraspeln entschieden!")
                        extraMuffin.add("Weiße Schokoladenraspeln")
                        price += 0.50
                        extrasMuffin()
                    }
                }

                //Früchte
                if (extra == 3) {
                    println("Welche Frucht möchtest du auf deinem Muffin? 1=Apfel, 2=Birne, 3=Blaubeere, 4=Himbeere, 5=Kirsche oder 6=3 Sorten Johannisbeere")
                    var extraFrucht: Int = readln().toInt()

                    if (extraFrucht == 1) {
                        println("Du hast dich für Apfel auf deinem Muffin entschieden!")
                        extraMuffin.add("Apfel")
                        price += 0.50
                        extrasMuffin()
                    }

                    if (extraFrucht == 2) {
                        println("Du hast dich für Birne auf deinem Muffin entschieden!")
                        extraMuffin.add("Birne")
                        price += 0.50
                        extrasMuffin()
                    }

                    if (extraFrucht == 3) {
                        println("Du hast dich für Blaubeere auf deinem Muffin entschieden!")
                        extraMuffin.add("Blaubeere")
                        price += 0.50
                        extrasMuffin()
                    }

                    if (extraFrucht == 4) {
                        println("Du hast dich für Himbeere auf deinem Muffin entschieden!")
                        extraMuffin.add("Himbeere")
                        price += 0.50
                        extrasMuffin()
                    }

                    if (extraFrucht == 5) {
                        println("Du hast dich für Kirsche auf deinem Muffin entschieden!")
                        extraMuffin.add("Kirsche")
                        price += 0.50
                        extrasMuffin()
                    }

                    if (extraFrucht == 6) {
                        println("Du hast dich für 3 Sorten Johannisbeere auf deinem Muffin entschieden!")
                        extraMuffin.add("3 Sorten Johannisbeere")
                        price += 0.50
                        extrasMuffin()
                    }
                }
            }else if(extraWahl == 2){
                println("Der Preis deines selbstgemachten Muffin ist: $price€")
                println("Möchtest du den Selbstgemachten Muffin deinem Warenkorb hinzufügen? 1=Ja, 2=Nein")
                var add = readln().toInt()

                var shop: Shop = Shop()

                if(add == 1){
                    var kunde: Kunde = Kunde("A", "1234", 99,1.00)
                    kunde.shoppingCart["Selbstgemachter Muffin"] = price
                    println("Selbstgemachter Muffin mit dem preis: $price€ wurde dem warenkorb hinzugefügt!")
                    shop.menue()
                }else{
                    println("Wird nicht hinzugefügt!")

                    shop.menue()
                }
            }
        } catch (e: Exception) {
            println("$e: Dies ist keine korrekte angabe!")
        }
    }
}