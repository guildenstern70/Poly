

fun main(args: Array<String>)
{
    println()
    println("Kotlin Poly")
    println()

    println("BAD:")
    bad();

    println("GOOD:")
    good();
}

fun bad()
{
    val service = BigBadService()
    BadSolution.doIt(service, Request.PAGE_B)
}

fun good()
{
    val service = BigGoodService()
    GoodSolution.doIt(service, Request.PAGE_B)
}

