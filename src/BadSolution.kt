
object BadSolution
{
    fun doIt(service: BigBadService, requestType: Request)
    {
        if (requestType == Request.PAGE_A)
        {
            service.doThis(10,"Alessio")
        }
        else
        {
            service.doThat(25, "Milano", "Roma")
        }
    }
}