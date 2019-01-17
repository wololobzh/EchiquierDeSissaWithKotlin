fun main(args: Array<String>)
{
    var nombreGrainsDeRiz:Float = 1F
    var total:Float = 0F

    for (i in 1..64)
    {
        total += nombreGrainsDeRiz
        println("$i = $nombreGrainsDeRiz")
        nombreGrainsDeRiz *= 2
    }

    println("Nombre total de grains de riz : $total")
}