package WareClasses

import AccClasses.Kunde
import ShopClass.Shop

open class Kuchen(name: String,
                  price: Double,
                  var mehl: Boolean,
                  var zucker: Boolean,
                  var eier: Int,
                  var butter: Boolean,
                  var milch: Boolean,
                  var backpulver: Boolean,
                  var vegan: Boolean): Ware(name, price) {

    var zutatenKuchen: MutableList<String> = mutableListOf()
    var extraList: MutableList<String> = mutableListOf()

    fun kuchenInfo(name: String) {

        println(BLACK_BACKGROUND+YELLOW+"Nachfolgende Zutaten befinden sich im $name:")


        if (mehl) {
            println(BLACK_BACKGROUND+GREEN+"Mehl = Ja")
        } else {
            println(BLACK_BACKGROUND+RED+"Mehl = Nein")
        }

        if (zucker) {
            println(BLACK_BACKGROUND+GREEN+"Zucker = Ja")
        } else {
            println(BLACK_BACKGROUND+RED+"Zucker = Nein")
        }

        if (butter) {
            println(BLACK_BACKGROUND+GREEN+"Butter = Ja")
        } else {
            println(BLACK_BACKGROUND+RED+"Butter = Nein")
        }

        if (milch) {
            println(BLACK_BACKGROUND+GREEN+"Milch = Ja")
        } else {
            println(BLACK_BACKGROUND+RED+"Milch = Nein")
        }

        if (backpulver) {
            println(BLACK_BACKGROUND+GREEN+"Backpulver = Ja")
        } else {
            println(BLACK_BACKGROUND+RED+"Backpulver = Nein")
        }

        if (eier > 0) {
            println(BLACK_BACKGROUND+GREEN+"Eier = Ja")
        } else {
            println(BLACK_BACKGROUND+RED+"Eier = Nein")
        }

        if (vegan) {
            println(BLACK_BACKGROUND+GREEN+"Vegan = Ja")
        } else {
            println(BLACK_BACKGROUND+RED+"Vegan = Nein")
        }
    }

    fun selfmadeCake() {


        try {

            price = 6.00
            println(BLACK_BACKGROUND+YELLOW+"Jeder Preis liegt bei 6,00€, jedes extra kostet 0,50€ mehr!")

            //Teigsorte?
            println(BLACK_BACKGROUND+YELLOW+"Wähle zwichen 1=Vanille oder 2=Schokoladen Teig?")
            var teig: Int = readln().toInt()


            if (teig == 1) {
                println(BLACK_BACKGROUND+GREEN+ "Du hast dich für Vanille Teig entschieden!")
                zutatenKuchen.add("Vanille")
            }
            if (teig == 2) {
                println(BLACK_BACKGROUND+GREEN+"Du hast dich für Schokolade entschieden!")
                zutatenKuchen.add("Schokoladenpulver")
            }
        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Du musst schon eine zahl von 1-2 eingeben!")
        }

        try {
            //Teig Nüsse?
            println(BLACK_BACKGROUND+YELLOW+"Möchtest du Nüsse in deinem Teig? 1=Ja  oder 2=Nein")
            var nuesseWahl: Int = readln().toInt()

            if (nuesseWahl == 1) {
                println(BLACK_BACKGROUND+YELLOW+"Welche Nusssorte möchtest du? 1=Kokosnuss, 2=Haselnuss, 3=Walnuss,4=Erdnuss, 5=Mandel")
                var nussWahl: Int = readln().toInt()

                if (nussWahl == 1) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Kokosnuss in deinem Teig entschieden!")
                    zutatenKuchen.add("Kokosnuss")
                    price += 0.50
                }

                if (nussWahl == 2) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Haselnuss in deinem Teig entschieden!")
                    zutatenKuchen.add("Haselnuss")
                    price += 0.50
                }

                if (nussWahl == 3) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Walnuss in deinem Teig entschieden!")
                    zutatenKuchen.add("Walnuss")
                    price += 0.50
                }

                if (nussWahl == 4) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Erdnuss in deinem Teig entschieden!")
                    zutatenKuchen.add("Erdnuss")
                    price += 0.50
                }

                if (nussWahl == 5) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Mandel in deinem Teig entschieden!")
                    zutatenKuchen.add("Mandel")
                    price += 0.50
                }
            }
        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Du hast keine zahl im richtigen ramen angegeben!")
        }

        try {
            //Teig Früchte?
            println(BLACK_BACKGROUND+YELLOW+"Möchtest du Früchte in deinem Teig haben? 1=Ja oder 2=Nein")
            var fruchtWahl: Int = readln().toInt()

            if (fruchtWahl == 1) {
                println(BLACK_BACKGROUND+YELLOW+"Welche Frucht möchtest du in deinem Teig? 1=Apfel, 2=Birne, 3=Blaubeere, 4=Himbeere, 5=Kirsche oder 6=3 Sorten Johannisbeere")
                var fruechte: Int = readln().toInt()
                price += 0.50

                if (fruechte == 1) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Apfel in deinem Teig entschieden!")
                    zutatenKuchen.add("Apfel")
                    price += 0.50
                }

                if (fruechte == 2) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Birne in deinem Teig entschieden!")
                    zutatenKuchen.add("Birne")
                    price += 0.50
                }

                if (fruechte == 3) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Blaubeere in deinem Teig entschieden!")
                    zutatenKuchen.add("Blaubeere")
                    price += 0.50
                }

                if (fruechte == 4) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Himbeere in deinem Teig entschieden!")
                    zutatenKuchen.add("Himbeere")
                    price += 0.50
                }

                if (fruechte == 5) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Kirsche in deinem Teig entschieden!")
                    zutatenKuchen.add("Kirsche")
                    price += 0.50
                }

                if (fruechte == 6) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für 3 Sorten Johannisbeere in deinem Teig entschieden!")
                    zutatenKuchen.add("3 Sorten Johannisbeere")
                    price += 0.50
                }
            }
        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Du musst eine Zahl im richtigen ramen angeben!")
        }

        try {
            //Mehlsorte?
            println(BLACK_BACKGROUND+YELLOW+"Welches Mehl möchtest du 1=Weizenmehl oder 2=Kokosnussmehl")
            var mehlWahl: Int = readln().toInt()

            if (mehlWahl == 1) {
                println(BLACK_BACKGROUND+GREEN+"Du hast dich für Weizenmehl entschieden!")
                zutatenKuchen.add("Weizenmehl")
            }
            if (mehlWahl == 2) {
                println(BLACK_BACKGROUND+GREEN+"Du hast dich für Kokosnussmehl entschieden!")
                zutatenKuchen.add("Kokosnussmehl")
            }

        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Du musst eine zahl im richtigen ramen angeben!")
        }

        try {
            //Vegan?
            println(BLACK_BACKGROUND+YELLOW+"Soll Der Teig Vegan sein? 1=Ja oder 2=Nein")
            var veganWahl: Int = readln().toInt()

            if (veganWahl == 1) {
                println(BLACK_BACKGROUND+GREEN+"Du hast dich dafür entschieden das der Kuchenteig Vegan sein soll: Eier werden gegen Banane Getauscht, Butter wird gegegn Pflanzenfett getauscht und Milch wird gegen Reismilch getauscht")
                zutatenKuchen.add("Banane")
                zutatenKuchen.add("Pflanzenfett")
                zutatenKuchen.add("Reismilch")

                vegan = true

            }

            if (veganWahl == 2) {
                println(BLACK_BACKGROUND+RED+"Der Kuchen wird nicht Vegan sein!")
                zutatenKuchen.add("Eier")
                zutatenKuchen.add("Butter")
                zutatenKuchen.add("Milch")

                vegan = false
            }
        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Du musst eine zahl im richtigen ramen angeben!")
        }

        try {
            //Zucker?
            println(BLACK_BACKGROUND+YELLOW+"Möchtest du Zucker in deinem Kuchen? 1=Ja oder 2=Nein")
            var zuckerWahl: Int = readln().toInt()

            if (zuckerWahl == 1) {
                println(BLACK_BACKGROUND+GREEN+"Du hast dich für einen Kuchen mit Zucker entschieden!")
                zucker = true
                zutatenKuchen.add("Zucker")
            }
            if (zuckerWahl == 2) {
                println(BLACK_BACKGROUND+RED+"Du möchtst einen Kuchen ohne Zucker!")
                zucker = false
            }

        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Du musst eine zahl im richtigen ramen angeben!")
        }
        extras()
    }

    fun extras() {

        try {
            //Extra
            println(BLACK_BACKGROUND+YELLOW+"Möchtest du noch Extras auf deinem Kuchen? 1=Ja, 2=Nein")
            var extraWahl: Int = readln().toInt()

            if (extraWahl == 1) {
                println(BLACK_BACKGROUND+YELLOW+"Welches Extra möchtest du auf deinem Kuchen? 1=Glasur, 2=Streusel, 3= Schokoraspel, 4=Früchte ")
                var extra: Int = readln().toInt()

                //Glasur
                if (extra == 1) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Glasur auf deinem Kuchen entschieden!")
                    println(BLACK_BACKGROUND+YELLOW+"Welche Sorte Glasur möchtest auf deinem Kuchen? 1=Zuckerguss, 2=Schokoglasur")
                    var glasursorte: Int = readln().toInt()

                    if (glasursorte == 1) {
                        println(BLACK_BACKGROUND+YELLOW+"Welche Sorte Zuckerguss möchtest du? 1=Classic Zuckerguss oder 2=Zitronen Zuckerguss")
                        var zuckerguss: Int = readln().toInt()

                        if (zuckerguss == 1) {
                            println(BLACK_BACKGROUND+GREEN+"Du hast dich für Classic Zuckerguss entschieden!")
                            extraList.add("Classic Zuckerguss")
                            price += 0.50
                            extras()
                        }
                        if (zuckerguss == 2) {
                            println(BLACK_BACKGROUND+GREEN+"Du hast dich für Zitronen Zuckerguss entschieden!")
                            extraList.add("Zitronen Zuckerguss")
                            price += 0.50
                            extras()
                        }
                    }

                    if (glasursorte == 2) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Schokoglasur entschieden!")
                        println(BLACK_BACKGROUND+YELLOW+"Welche Schokolade möchtest du als Glasur? 1=Vollmilch, 2=Zarzbitter oder 3=Weiße")
                        var schoko: Int = readln().toInt()

                        if (schoko == 1) {
                            println(BLACK_BACKGROUND+GREEN+"Du hast dich für Vollmilchglasur entschieden!")
                            extraList.add("Vollmilchglasur")
                            price += 0.50
                            extras()
                        }

                        if (schoko == 2) {
                            println(BLACK_BACKGROUND+GREEN+"Du hast dich für Zartbitterglasur entschieden!")
                            extraList.add("Zartbitterglasur")
                            price += 0.50
                            extras()
                        }

                        if (schoko == 3) {
                            println(BLACK_BACKGROUND+GREEN+"Du hast dich für Weiße Schokoladenglasur entschieden!")
                            extraList.add("Weiße Schokoladenglasur")
                            price += 0.50
                            extras()
                        }
                    }
                }

                //Streusel
                if (extra == 2) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Streusel auf deinem Kuchen entschieden!")
                    println(BLACK_BACKGROUND+YELLOW+"Welche Streuselsorte möchtest du? 1=3 Sorten Schokolade oder 2=Bunt")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für 3 Sorten Schokoladenstreusel entschieden!")
                        extraList.add("3 Sorten Schokoladenstreusel")
                        price += 0.50
                        extras()
                    }
                    if (streuselWahl == 2) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Bunte Streusel entschieden!")
                        extraList.add("Bunte Streusel")
                        price += 0.50
                        extras()
                    }
                }

                //Schokoraspeln
                if (extra == 3) {
                    println(BLACK_BACKGROUND+GREEN+"Du hast dich für Schokoraspeln auf deinem Kuchen entschieden!")
                    println(BLACK_BACKGROUND+YELLOW+"Welche Schokoraspelsorte möchtest du? 1=Vollmilch, 2=Zartbitter oder 3=Weiße")
                    var streuselWahl: Int = readln().toInt()

                    if (streuselWahl == 1) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Vollmilchschokoladenraspeln entschieden!")
                        extraList.add("Vollmilchschokoladenraspeln")
                        price += 0.50
                        extras()
                    }

                    if (streuselWahl == 2) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Zartbitterschokoladenraspeln entschieden!")
                        extraList.add("Vollmilchschokoladenraspeln")
                        price += 0.50
                        extras()
                    }

                    if (streuselWahl == 3) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Weiße Schokoladenraspeln entschieden!")
                        extraList.add("Weiße Schokoladenraspeln")
                        price += 0.50
                        extras()
                    }
                }

                //Früchte
                if (extra == 4) {
                    println(BLACK_BACKGROUND+YELLOW+"Welche Frucht möchtest du auf deinem kuchen? 1=Apfel, 2=Birne, 3=Blaubeere, 4=Himbeere, 5=Kirsche oder 6=3 Sorten Johannisbeere")
                    var extraFrucht: Int = readln().toInt()

                    if (extraFrucht == 1) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Apfel auf deinem Kuchen entschieden!")
                        extraList.add("Apfel")
                        price += 0.50
                        extras()
                    }

                    if (extraFrucht == 2) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Birne auf deinem Kuchen entschieden!")
                        extraList.add("Birne")
                        price += 0.50
                        extras()
                    }

                    if (extraFrucht == 3) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Blaubeere auf deinem Kuchen entschieden!")
                        extraList.add("Blaubeere")
                        price += 0.50
                        extras()
                    }

                    if (extraFrucht == 4) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Himbeere auf deinem Kuchen entschieden!")
                        extraList.add("Himbeere")
                        price += 0.50
                        extras()
                    }

                    if (extraFrucht == 5) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für Kirsche auf deinem Kuchen entschieden!")
                        extraList.add("Kirsche")
                        price += 0.50
                        extras()
                    }

                    if (extraFrucht == 6) {
                        println(BLACK_BACKGROUND+GREEN+"Du hast dich für 3 Sorten Johannisbeere auf deinem Kuchen entschieden!")
                        extraList.add("3 Sorten Johannisbeere")
                        price += 0.50
                        extras()
                    }
                }
            }else if(extraWahl == 2){
                println(BLACK_BACKGROUND+GREEN+"Der Preis deines selbstgemachten Kuchens ist: $price€")
                println(BLACK_BACKGROUND+YELLOW+"Möchtest du den Selbstgemachten Kuchen deinem Warenkorb hinzufügen? 1=Ja, 2=Nein")
                var add = readln().toInt()

                var shop: Shop = Shop()

                if(add == 1){
                    var kunde: Kunde = Kunde("A", "1234", 99,1.00)
                    kunde.shoppingCart["Selbstgemachter Kuchen"] = price
                    println(BLACK_BACKGROUND+GREEN+"Selbstgemachter Kuchen mit dem preis: $price€ wurde dem warenkorb hinzugefügt!")
                    shop.menue()
                }else{
                    println(BLACK_BACKGROUND+RED+"Wird nicht hinzugefügt!")

                    shop.menue()
                }
            }
        } catch (e: Exception) {
            println(BLACK_BACKGROUND+RED+"$e: Du musst eine zahl im richtigen ramen angeben!")
        }
    }
}