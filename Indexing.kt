var sample = "ABCDEF\nHello_World!\nKotlin" 

fun main() {
    println(sample.Index_c().toString())
    println(sample.Index_s())
}


//code is BLE protocol!

fun String.Index_c(Dex:String = "\n"):ArrayList<String> {
    var Sc = 0
    var Ec = 0
    var Stens = ArrayList<String>()
    while(true) 
    {
        Ec = this.indexOf(Dex, Sc)
        if(Ec < 0) {
//             println("\n Fnishi")
          return Stens
          break
        }
//		println(this.substring(Sc,Ec))
        Stens.add(this.substring(Sc,Ec))
        Sc = Ec + 1
    }
}

fun String.Index_s(Dex:String = "\n") : String {
    var Sc = 0
    var Ec = 0
    while(true) 
    {
        Ec = this.indexOf(Dex, Sc)
        //println(Ec)
        if(Ec < 0) {
            
            //println(this.substring(Sc, this.length))
            return this.substring(Sc, this.length)
            break
        }
        Sc = Ec + 1
    }
}
