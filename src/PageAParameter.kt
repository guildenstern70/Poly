class PageAParameter(val requestType: Request,
                     private val a: Int,
                     private val b: String) : IParameter
{
    override fun doIt()
    {
        println("Do this: $b $a")
    }
}