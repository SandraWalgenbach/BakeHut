package WareClasses

import AccClasses.Kunde
import ShopClass.Shop

class Cupcake (name: String,
               preis: Double,
               mehl: Boolean,
               zucker: Boolean,
               eier: Int,
               butter: Boolean,
               milch: Boolean,
               backpulver: Boolean,
               vegan: Boolean,
               var fuellung: Boolean = true): Muffin(name, preis, mehl, zucker, eier, butter, milch, backpulver, vegan){

    var zutatenCup: MutableList<String> = mutableListOf()
    var extraCup: MutableList<String> = mutableListOf()

    fun cupcakeInfo(
        name: String,
        mehl: Boolean,
        zucker: Boolean,
        eier: Int,
        butter: Boolean,
        milch: Boolean,
        backpulver: Boolean,
        vegan: Boolean,
        füllung: Boolean

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

    fun selfmadeCup() {

        try {

            price = 4.00
            println("Jeder Preis liegt bei 4,00€, jedes extra kostet 0,50€ mehr!")

            //Teigsorte?
            println("Wähle zwichen 1=Vanille oder 2=Schokoladen Teig?")
            var teig: Int = readln().toInt()

            if (teig == 1) {
                println("Du hast dich für Vanille Teig entschieden!")
                zutatenCup.add("Vanille")
            }
            if (teig == 2) {
                println("Du hast dich für Schokolade entschieden!")
                zutatenCup.add("Schokoladenpulver")
            }

            //Teig Nüsse?
            println("Möchtest du Nüsse in deinem Teig? 1=Ja  oder 2=Nein")
            var nüsseWahl: Int = readln().toInt()

            if (nüsseWahl == 1) {
                println("Welche Nusssorte möchtest du? 1=Kokosnuss, 2=Haselnuss, 3=Walnuss,4=Erdnuss, 5=Mandel")
                var nussWahl: Int = readln().toInt()

                if (nussWahl == 1) {
                    println("Du hast dich für Kokosnuss in deinem Teig entschieden!")
                    zutatenCup.add("Kokosnuss")
                    price += 0.50

                }

                if (nussWahl == 2) {
                    println("Du hast dich für Haselnuss in deinem Teig entschieden!")
                    zutatenCup.add("Haselnuss")
                    price += 0.50

                }

                if (nussWahl == 3) {
                    println("Du hast dich für Walnuss in deinem Teig entschieden!")
                    zutatenCup.add("Walnuss")
                    price += 0.50

                }

                if (nussWahl == 4) {
                    println("Du hast dich für Erdnuss in deinem Teig entschieden!")
                    zutatenCup.add("Erdnuss")
                    price += 0.50

                }

                if (nussWahl == 5) {
                    println("Du hast dich für Mandel in deinem Teig entschieden!")
                    zutatenCup.add("Mandel")
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
                    zutatenCup.add("Apfel")
                    price += 0.50

                }

                if (früchteWahl == 2) {
                    println("Du hast dich für Birne in deinem Teig entschieden!")
                    zutatenCup.add("Birne")
                    price += 0.50

                }

                if (früchteWahl == 3) {
                    println("Du hast dich für Blaubeere in deinem Teig entschieden!")
                    zutatenCup.add("Blaubeere")
                    price += 0.50

                }

                if (früchteWahl == 4) {
                    println("Du hast dich für Himbeere in deinem Teig entschieden!")
                    zutatenCup.add("Himbeere")
                    price += 0.50

                }

                if (früchteWahl == 5) {
                    println("Du hast dich für Kirsche in deinem Teig entschieden!")
                    zutatenCup.add("Kirsche")
                    price += 0.50

                }

                if (früchteWahl == 6) {
                    println("Du hast dich für 3 Sorten Johannisbeere in deinem Teig entschieden!")
                    zutatenCup.add("3 Sorten Johannisbeere")
                    price += 0.50

                }
            }

            //Mehlsorte?
            println("Welches Mehl möchtest du 1=Weizenmehl oder 2=Kokosnussmehl")
            var mehlWahl: Int = readln().toInt()

            if (mehlWahl == 1) {
                println("Du hast dich für Weizenmehl entschieden!")
                zutatenCup.add("Weizenmehl")
            }
            if (mehlWahl == 2) {
                println("Du hast dich für Kokosnussmehl entschieden!")
                zutatenCup.add("Kokosnussmehl")
            }

            //Vegan?
            println("Soll Der Teig Vegan sein? 1=Ja oder 2=Nein")
            var veganWahl: Int = readln().toInt()

            if (veganWahl == 1) {
                println("Du hast dich dafür entschieden das der Cupcaketeig Vegan sein soll: Eier werden gegen Banane Getauscht, Butter wird gegegn Pflanzenfett getauscht und Milch wird gegen Reismilch getauscht")
                zutatenCup.add("Banane")
                zutatenCup.add("Pflanzenfett")
                zutatenCup.add("Reismilch")

                vegan = true

            }
            if (veganWahl == 2) {
                println("Der Teig wird mit Eiern, Milch und Butter zubereitet!")
                zutatenCup.add("Eier")
                zutatenCup.add("Butter")
                zutatenCup.add("Milch")

                vegan = false
            }

            //füllung
            println("Welche Füllung möchtest du in deinem Cupcake? 1=Buttercreme, 2=Sahne")
            var füllungWahl: Int = readln().toInt()

            if (füllungWahl == 1) {
                println("Du hast dich für Buttercreme in deinem Cupcake entschieden!")
                extraCup.add("Buttercreme")
            }
            if (füllungWahl == 2) {
                println("Du hast dich für Sahne in deinem Cupcake entschieden!")
                extraCup.add("Sahnefüllung")
                extrasCup()
            }

            //Zucker?
            println("Möchtest du Zucker in deiner Torte? 1=Ja oder 2=Nein")
            var zuckerWahl: Int = readln().toInt()

            if (zuckerWahl == 1) {
                println("Du hast dich für eine Torte mit Zucker entschieden!")
                zucker = true
                zutatenCup.add("Zucker")
            }
            if (zuckerWahl == 2) {
                println("Du möchtst eine Torte ohne Zucker!")
                zucker = false
            }
            extrasCup()
        } catch (e: Exception) {
            println("$e: Dies ist keine korrekte angabe!")
        }
    }

    fun extrasCup() {

        try {
            //Extra
            println("Möchtest du noch Extras auf deinem Cupcake? 1=Ja oder 2=Nein")
            var extraWahl: Int = readln().toInt()

            if (extraWahl == 1) {
                println("Welches Extra möchtest du auf deinem Cupcake? 1=Glasur, 2=Streusel, 3= Schokoraspel, 4=Früchte")
                var extra: Int = readln().toInt()

                //Glasur
                if (extra == 1) {
                    println("Du hast dich für Glasur auf deinem Cupcake entschieden!")
                    println("Welche Sorte Glasur möchtest auf deinem Cupcake? 1=Zuckerguss, 2=Schokoglasur, 3=Frosting")
                    var glasursorte: Int = readln().toInt()

                    if (glasursorte == 1) {
                        println("Welche Sorte Zuckerguss möchtest du? 1=Classic Zuckerguss oder 2=Zitronen Zuckerguss")
                        var zuckerguss: Int = readln().toInt()

                        if (zuckerguss == 1) {
                            println("Du hast dich für Classic Zuckerguss entschieden!")
                            extraCup.add("Classic Zuckerguss")
                            extrasCup()
                        }
                        if (zuckerguss == 2) {
                            println("Du hast dich für Zitronen Zuckerguss entschieden!")
                            extraCup.add("Zitronen Zuckerguss")
                            extrasCup()
                        }
                    }

                    if (glasursorte == 2) {
                        println("Du hast dich für Schokoglasur entschieden!")
                        println("Welche Schokolade möchtest du als Glasur? 1=Vollmilch, 2=Zarzbitter oder 3=Weiße")
                        var schoko: Int = readln().toInt()

                        if (schoko == 1) {
                            println("Du hast dich für Vollmilchglasur entschieden!")
                            extraCup.add("Vollmilchglasur")
                            extrasCup()
                        }

                        if (schoko == 2) {
                            println("Du hast dich für Zartbitterglasur entschieden!")
                            extraCup.add("Zartbitterglasur")
                            extrasCup()
                        }

                        if (schoko == 3) {
                            println("Du hast dich für Weiße Schokoladenglasur entschieden!")
                            extraCup.add("Weiße Schokoladenglasur")
                            extrasCup()
                        }
                    }

                    if (glasursorte == 3) {
                        println("Welches Frosting möchtest du auf deinem Cupcake? 1=Vanille, 2=Erdbeere")
                        var frost: Int = readln().toInt()

                        if (frost == 1) {
                            println("Du hast dich für Vanille Frosting entschieden!")
                            zutatenCup.add("Vanille Frosting")
                            extrasCup()

                        }
                        if (frost == 2) {
                            println("Du hast dich für Erdbeer Frosting entschieden!")
                            zutatenCup.add("Erdbeer Frosting")
                            extrasCup()

                        }
                    }
                }

                //Streusel
                if (extra == 2) {
                    println("Du hast dich für Streusel auf deinem Cupcake entschieden!")
                    println("Welche Streuselsorte möchtest du? 1=3 Sorten Schokolade oder 2=Bunt")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println("Du hast dich für 3 Sorten Schokoladenstreusel entschieden!")
                        extraCup.add("3 Sorten Schokoladenstreusel")
                        price += 0.50

                        extrasCup()
                    }
                    if (streuselWahl == 2) {
                        println("Du hast dich für Bunte Streusel entschieden!")
                        extraCup.add("Bunte Streusel")
                        price += 0.50

                        extrasCup()
                    }
                }

                //Schokoraspeln
                if (extra == 3) {
                    println("Du hast dich für Schokoraspeln auf deinem Cupcake entschieden!")
                    println("Welche Schokoraspelsorte möchtest du? 1=Vollmilch, 2=Zartbitter oder 3=Weiße")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println("Du hast dich für Vollmilchschokoladenraspeln entschieden!")
                        extraCup.add("Vollmilchschokoladenraspeln")
                        price += 0.50

                        extrasCup()
                    }

                    if (streuselWahl == 2) {
                        println("Du hast dich für Zartbitterschokoladenraspeln entschieden!")
                        extraCup.add("Vollmilchschokoladenraspeln")
                        price += 0.50

                        extrasCup()
                    }

                    if (streuselWahl == 3) {
                        println("Du hast dich für Weiße Schokoladenraspeln entschieden!")
                        extraCup.add("Weiße Schokoladenraspeln")
                        price += 0.50

                        extrasCup()
                    }
                }

                //Früchte
                if (extra == 4) {
                    println("Welche Frucht möchtest du auf deinem Cupcake? 1=Apfel, 2=Birne, 3=Blaubeere, 4=Himbeere, 5=Kirsche oder 6=3 Sorten Johannisbeere")
                    var extraFrucht: Int = readln().toInt()

                    if (extraFrucht == 1) {
                        println("Du hast dich für Apfel entschieden!")
                        extraCup.add("Apfel")
                        price += 0.50

                        extrasCup()
                    }

                    if (extraFrucht == 2) {
                        println("Du hast dich für Birne entschieden!")
                        extraCup.add("Birne")
                        price += 0.50

                        extrasCup()
                    }

                    if (extraFrucht == 3) {
                        println("Du hast dich für Blaubeere entschieden!")
                        extraCup.add("Blaubeere")
                        price += 0.50

                        extrasCup()
                    }

                    if (extraFrucht == 4) {
                        println("Du hast dich für Himbeere entschieden!")
                        extraCup.add("Himbeere")
                        price += 0.50

                        extrasCup()
                    }

                    if (extraFrucht == 5) {
                        println("Du hast dich für Kirsche entschieden!")
                        extraCup.add("Kirsche")
                        price += 0.50

                        extrasCup()
                    }

                    if (extraFrucht == 6) {
                        println("Du hast dich für 3 Sorten Johannisbeere entschieden!")
                        extraCup.add("3 Sorten Johannisbeere")
                        price += 0.50

                        extrasCup()
                    }
                }
            }else if(extraWahl == 2){
                println("Der Preis deines selbstgemachten Cupcake ist: $price€")
                println("Möchtest du den Selbstgemachten Cupcake deinem Warenkorb hinzufügen? 1=Ja, 2=Nein")
                var add = readln().toInt()

                var shop: Shop = Shop()

                if(add == 1){
                    var kunde: Kunde = Kunde("A", "1234", 99,1.00)
                    kunde.shoppingCart["Selbstgemachter Cupcake"] = price
                    println("Selbstgemachter Cupcake mit dem preis: $price€ wurde dem warenkorb hinzugefügt!")
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