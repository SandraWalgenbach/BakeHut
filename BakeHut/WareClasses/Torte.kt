package WareClasses

import AccClasses.Kunde
import ShopClass.Shop

class Torte( name: String,
             preis: Double,
             mehl: Boolean,
             zucker: Boolean,
             eier: Int,
             butter: Boolean,
             milch: Boolean,
             backpulver: Boolean,
             vegan: Boolean,
             var füllung: Boolean = true,
             var schichten: Int) : Kuchen(name, preis, mehl, zucker, eier, butter, backpulver, milch, vegan){

    var zutatenTorte: MutableList<String> = mutableListOf()
    var extraTorte: MutableList<String> = mutableListOf()

    fun torteInfo(name: String) {

        println("Folgende Zutaten befinden sich in $name:")

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

        if (schichten > 1){
            println("Schichten = $schichten")
        }
    }

    open fun selfmadeTort() {

        price = 7.00
        println("Jeder Preis liegt bei 7,00€, jedes extra kostet 0,50€ mehr!")

        try {
            println("Wie viele schichten soll die Torte haben? (zwichen 2 und 4")
            schichten = readln().toInt()
            //Teigsorte?
            println("Wähle zwichen 1=Vanille oder 2=Schokoladen Teig?")
            var teig: Int = readln().toInt()

            if (teig == 1) {
                println("Du hast dich für Vanille Teig entschieden!")
                zutatenTorte.add("Vanille")
            }
            if (teig == 2) {
                println("Du hast dich für Schokolade entschieden!")
                zutatenTorte.add("Schokoladenpulver")
            }

            //Teig Nüsse?
            println("Möchtest du Nüsse in deinem Teig? 1=Ja  oder 2=Nein")
            var nüsseWahl: Int = readln().toInt()

            if (nüsseWahl == 1) {
                println("Welche Nusssorte möchtest du? 1=Kokosnuss, 2=Haselnuss, 3=Walnuss,4=Erdnuss, 5=Mandel")
                var nussWahl: Int = readln().toInt()

                if (nussWahl == 1) {
                    println("Du hast dich für Kokosnuss in deinem Teig entschieden!")
                    zutatenTorte.add("Kokosnuss")
                    price += 0.50
                }

                if (nussWahl == 2) {
                    println("Du hast dich für Haselnuss in deinem Teig entschieden!")
                    zutatenTorte.add("Haselnuss")
                    price += 0.50
                }

                if (nussWahl == 3) {
                    println("Du hast dich für Walnuss in deinem Teig entschieden!")
                    zutatenTorte.add("Walnuss")
                    price += 0.50
                }

                if (nussWahl == 4) {
                    println("Du hast dich für Erdnuss in deinem Teig entschieden!")
                    zutatenTorte.add("Erdnuss")
                    price += 0.50
                }

                if (nussWahl == 5) {
                    println("Du hast dich für Mandel in deinem Teig entschieden!")
                    zutatenTorte.add("Mandel")
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
                    zutatenTorte.add("Apfel")
                    price += 0.50
                }

                if (früchteWahl == 2) {
                    println("Du hast dich für Birne in deinem Teig entschieden!")
                    zutatenTorte.add("Birne")
                    price += 0.50
                }

                if (früchteWahl == 3) {
                    println("Du hast dich für Blaubeere in deinem Teig entschieden!")
                    zutatenTorte.add("Blaubeere")
                    price += 0.50
                }

                if (früchteWahl == 4) {
                    println("Du hast dich für Himbeere in deinem Teig entschieden!")
                    zutatenTorte.add("Himbeere")
                    price += 0.50
                }

                if (früchteWahl == 5) {
                    println("Du hast dich für Kirsche in deinem Teig entschieden!")
                    zutatenTorte.add("Kirsche")
                    price += 0.50
                }

                if (früchteWahl == 6) {
                    println("Du hast dich für 3 Sorten Johannisbeere in deinem Teig entschieden!")
                    zutatenTorte.add("3 Sorten Johannisbeere")
                    price += 0.50
                }
            }

            //Mehlsorte?
            println("Welches Mehl möchtest du 1=Weizenmehl oder 2=Kokosnussmehl")
            var mehlWahl: Int = readln().toInt()

            if (mehlWahl == 1) {
                println("Du hast dich für Weizenmehl entschieden!")
                zutatenTorte.add("Weizenmehl")
            }
            if (mehlWahl == 2) {
                println("Du hast dich für Kokosnussmehl entschieden!")
                zutatenTorte.add("Kokosnussmehl")
            }

            //Vegan?
            println("Soll Der Teig Vegan sein? 1=Ja oder 2=Nein")
            var veganWahl: Int = readln().toInt()

            if (veganWahl == 1) {
                println("Du hast dich dafür entschieden das der Kuchenteig Vegan sein soll: Eier werden gegen Banane Getauscht, Butter wird gegegn Pflanzenfett getauscht und Milch wird gegen Reismilch getauscht")
                zutatenTorte.add("Banane")
                zutatenTorte.add("Pflanzenfett")
                zutatenTorte.add("Reismilch")

                vegan = true

            }
            if (veganWahl == 2) {
                println("Es bleibt bei Eiern, Milch und Butter im Teig!")
                zutatenTorte.add("Eier")
                zutatenTorte.add("Butter")
                zutatenTorte.add("Milch")

                vegan = false
            }

            //füllung
            println("Welche Füllung möchtest du in deiner Torte? 1=Buttercreme, 2=Sahne")
            var füllungWahl: Int = readln().toInt()

            if (füllungWahl == 1) {
                println("Du hast dich für Buttercreme in deiner Torte entschieden!")
                extraTorte.add("Buttercreme")
                extrasTorte()

            }
            if (füllungWahl == 2) {
                println("Du hast dich für Sahne in deiner Torte entschieden!")
                extraTorte.add("Sahnefüllung")
                extrasTorte()
            }

            //Zucker?
            println("Möchtest du Zucker in deiner Torte? 1=Ja oder 2=Nein")
            var zuckerWahl: Int = readln().toInt()

            if (zuckerWahl == 1) {
                println("Du hast dich für eine Torte mit Zucker entschieden!")
                zucker = true
                zutatenTorte.add("Zucker")
            }
            if (zuckerWahl == 2) {
                println("Du möchtst eine Torte ohne Zucker!")
                zucker = false
            }
            extrasTorte()
        } catch (e: Exception) {
            println("$e: Dies ist keine korrekte angabe!")
        }
    }


    fun extrasTorte() {

        try {
            //Extra
            println("Möchtest du noch Extras auf deiner Torte? 1=Ja oder 2=Nein")
            var extraWahl: Int = readln().toInt()

            if (extraWahl == 1) {
                println("Welches Extra möchtest du auf deiner Torte? 1=Glasur, 2=Streusel, 3= Schokoraspel, 4=Früchte")
                var extra: Int = readln().toInt()

                //Glasur
                if (extra == 1) {
                    println("Du hast dich für Glasur auf deiner Torte entschieden!")
                    println("Welche Sorte Glasur möchtest auf deiner Torte? 1=Zuckerguss, 2=Schokoglasur, 3=Buttercreme")
                    var glasursorte: Int = readln().toInt()

                    if (glasursorte == 1) {
                        println("Welche Sorte Zuckerguss möchtest du? 1=Classic Zuckerguss oder 2=Zitronen Zuckerguss")
                        var zuckerguss: Int = readln().toInt()

                        if (zuckerguss == 1) {
                            println("Du hast dich für Classic Zuckerguss entschieden!")
                            extraTorte.add("Classic Zuckerguss")
                            extrasTorte()
                        }
                        if (zuckerguss == 2) {
                            println("Du hast dich für Zitronen Zuckerguss entschieden!")
                            extraTorte.add("Zitronen Zuckerguss")
                            extrasTorte()
                        }
                    }

                    if (glasursorte == 2) {
                        println("Du hast dich für Schokoglasur entschieden!")
                        println("Welche Schokolade möchtest du als Glasur? 1=Vollmilch, 2=Zarzbitter oder 3=Weiße")
                        var schoko: Int = readln().toInt()

                        if (schoko == 1) {
                            println("Du hast dich für Vollmilchglasur entschieden!")
                            extraTorte.add("Vollmilchglasur")
                            extrasTorte()
                        }

                        if (schoko == 2) {
                            println("Du hast dich für Zartbitterglasur entschieden!")
                            extraTorte.add("Zartbitterglasur")
                            extrasTorte()
                        }

                        if (schoko == 3) {
                            println("Du hast dich für Weiße Schokoladenglasur entschieden!")
                            extraTorte.add("Weiße Schokoladenglasur")
                            extrasTorte()
                        }
                    }

                    if (glasursorte == 3) {
                        println("Du hast dich für Buttercreme auf deiner Torte entschieden!")
                        extraTorte.add("Buttercreme Glasur")
                        extrasTorte()
                    }
                }

                //Streusel
                if (extra == 2) {
                    println("Du hast dich für Streusel auf deiner Torte entschieden!")
                    println("Welche Streuselsorte möchtest du? 1=3 Sorten Schokolade oder 2=Bunt")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println("Du hast dich für 3 Sorten Schokoladenstreusel entschieden!")
                        extraTorte.add("3 Sorten Schokoladenstreusel")
                        price += 0.50
                        extrasTorte()
                    }
                    if (streuselWahl == 2) {
                        println("Du hast dich für Bunte Streusel entschieden!")
                        extraTorte.add("Bunte Streusel")
                        price += 0.50
                        extrasTorte()
                    }
                }

                //Schokoraspeln
                if (extra == 3) {
                    println("Du hast dich für Schokoraspeln auf deiner Torte entschieden!")
                    println("Welche Schokoraspelsorte möchtest du? 1=Vollmilch, 2=Zartbitter oder 3=Weiße")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println("Du hast dich für Vollmilchschokoladenraspeln entschieden!")
                        extraTorte.add("Vollmilchschokoladenraspeln")
                        price += 0.50
                        extrasTorte()
                    }

                    if (streuselWahl == 2) {
                        println("Du hast dich für Zartbitterschokoladenraspeln entschieden!")
                        extraTorte.add("Vollmilchschokoladenraspeln")
                        price += 0.50
                        extrasTorte()
                    }

                    if (streuselWahl == 3) {
                        println("Du hast dich für Weiße Schokoladenraspeln entschieden!")
                        extraTorte.add("Weiße Schokoladenraspeln")
                        price += 0.50
                        extrasTorte()
                    }
                }

                //Früchte
                if (extra == 4) {
                    println("Welche Frucht möchtest du auf deiner Torte? 1=Apfel, 2=Birne, 3=Blaubeere, 4=Himbeere, 5=Kirsche oder 6=3 Sorten Johannisbeere")
                    var extraFrucht: Int = readln().toInt()

                    if (extraFrucht == 1) {
                        println("Du hast dich für Apfel auf deiner Torte entschieden!")
                        extraTorte.add("Apfel")
                        price += 0.50
                        extrasTorte()
                    }

                    if (extraFrucht == 2) {
                        println("Du hast dich für Birne auf deiner Torte entschieden!")
                        extraTorte.add("Birne")
                        price += 0.50
                        extrasTorte()
                    }

                    if (extraFrucht == 3) {
                        println("Du hast dich für Blaubeere auf deiner Torte entschieden!")
                        extraTorte.add("Blaubeere")
                        price += 0.50
                        extrasTorte()
                    }

                    if (extraFrucht == 4) {
                        println("Du hast dich für Himbeere auf deiner Torte entschieden!")
                        extraTorte.add("Himbeere")
                        price += 0.50
                        extrasTorte()
                    }

                    if (extraFrucht == 5) {
                        println("Du hast dich für Kirsche auf deiner Torte entschieden!")
                        extraTorte.add("Kirsche")
                        price += 0.50
                        extrasTorte()
                    }

                    if (extraFrucht == 6) {
                        println("Du hast dich für 3 Sorten Johannisbeere auf deiner Torte entschieden!")
                        extraTorte.add("3 Sorten Johannisbeere")
                        price += 0.50
                        extrasTorte()
                    }
                }
            }else if(extraWahl == 2){
                println("Der Preis deiner selbstgemachten Torte ist: $price€")
                println("Möchtest du die Selbstgemachte Torte deinem Warenkorb hinzufügen? 1=Ja, 2=Nein")
                var add = readln().toInt()

                var shop: Shop = Shop()

                if(add == 1){
                    var kunde: Kunde = Kunde("A", "1234", 99,1.00)
                    kunde.shoppingCart["Selbstgemachte Torte"] = price
                    println("Selbstgemachte Torte mit dem preis: $price€ wurde dem warenkorb hinzugefügt!")
                    shop.menue()
                }else{
                    println("Wird nicht hinzugefügt!")

                    shop.menue()
                }
            }
        } catch (e: Exception) {
            println("$e Das ist keine korrekte angabe!")
        }
    }
}