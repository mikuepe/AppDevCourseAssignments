class Mouse(_name:String="The mouse"):Animal(_name) {
    private var CheeseAmount:Int = 0;

    override fun makeASound(){
        squeak()
    }
    private fun squeak() {
        println("$animalName said meow!")
    }
    public fun stealCheese(x:Int) {
        CheeseAmount += x
    }
    public fun eatCheese() {
        CheeseAmount--
    }
}