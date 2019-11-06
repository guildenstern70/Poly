object ParameterFactory
{

    fun createPage(request: Request, a: Int, b: String): IParameter
    {
        return ParameterFactory.createPage(request, a, b, null)
    }

    fun createPage(request: Request, a: Int, b: String, c: String?): IParameter
    {
        return when (request)
        {
            Request.PAGE_A -> PageAParameter(request, a, b)
            Request.PAGE_B -> PageBParameter(request, a, b, c!!)
        }
    }

}