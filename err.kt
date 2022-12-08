
fun String.index_Split(Dex: String = "\\n"): ArrayList<String> {
    Log.e("skinp", this)
    var Checker = 0
    var Stemp = 0
    var pizza = ""
    val jip = ArrayList<String>()
    while (this.length > Checker + 1) {
        Checker = this.indexOf(Dex, Stemp+1)
        Log.e("skpx", Checker.toString())
        if (Checker < 0 || Stemp == Checker) {
            break
        }

        pizza = this.substring(Stemp, Checker)
        Stemp = Checker
        if (pizza.length > 0) {
            jip.add(pizza)

        }
    }
    Log.e("skpix", jip.toString())
    return jip
}

fun String.index_N(Dex: String = "\n"): ByteArray {
    var Checker = 0
    var Stemp = 0
    var Last_S = ""
    val jip = ArrayList<String>()
    while (this.length > Checker + 1) {
        Checker = this.indexOf(Dex, Stemp+1)
        if (Checker < 0) {
            Last_S = this.substring(Stemp+1, this.length)
            break
        }
        Stemp = Checker

    }
    val Yu = Last_S.toByteArray()
    return Yu
}

fun String._index_N(Dex: String = "\\n"): ArrayList<String> {
    Log.e("skinp", this)
    var Checker = 0
    var Stemp = 0
    var pizza = ""
    val jip = ArrayList<String>()
    while (this.length > Checker + 1) {
        Checker = this.indexOf(Dex, Stemp+1)
        Log.e("skpx", Checker.toString())
        if (Checker < 0 || Stemp == Checker) {
            break
        }

        pizza = this.substring(Stemp+1, Checker)
        Stemp = Checker
        if (pizza.length > 1) {
            jip.add(pizza)

        }
    }
    Log.e("skpx", jip.toString())
    return jip
}


fun String._index_IN(Dex: String = "\\n"): ArrayList<String> {
    Log.e("skinp", this)
    var Checker = 0
    var Stemp = 0
    var pizza = ""
    val jip = ArrayList<String>()
    while (true) {
        Checker = this.indexOf(Dex, Stemp+1)
        Log.e("skpx", Checker.toString())
        if (Checker < 0 || Stemp == Checker) {
            break
        }

        pizza = this.substring(Stemp, Checker)
        Stemp = Checker
        if (pizza.length > 0) {
            jip.add(pizza)

        }
    }
    Log.e("skpx", jip.toString())
    return jip
