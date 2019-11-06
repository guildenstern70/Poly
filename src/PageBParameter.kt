class PageBParameter(val requestType: Request,
                     private val a: Int,
                     private val b: String,
                     private val c: String) : IParameter
{
    override fun doIt()
    {
        println("Do that: $b $a $c")
    }
}
