
object GoodSolution
{
    private val pageA = ParameterFactory.createPage(Request.PAGE_A, 10, "Alessio")
    private val pageB = ParameterFactory.createPage(Request.PAGE_B, 25, "Milano", "Roma")

    fun doIt(service: BigGoodService, requestType: Request)
    {
        val page = if (requestType == Request.PAGE_A) pageA else pageB
        service.doIt(page)
    }
}