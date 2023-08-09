fun main(args: Array<String>) {
    println("Ingrese el dividendo:")
    val dividendoInput = readLine()
    val dividendo = dividendoInput?.toIntOrNull()

    println("Ingrese el divisor:")
    val divisorInput = readLine()
    val divisor = divisorInput?.toIntOrNull()

    if (dividendo != null && divisor != null) {
        try {
            val result = dividir(dividendo, divisor)
            println("$dividendo / $divisor = $result")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    } else {
        println("Debe ingresar valores numéricos válidos para dividendo y divisor.")
    }
}

/**
 * Realiza la división de dos números enteros utilizando recursión.
 *
 * @param dividendo El número que se va a dividir.
 * @param divisor El divisor.
 * @return El resultado de la división.
 * @throws IllegalArgumentException Si el divisor es cero.
 */
fun dividir(dividendo: Int, divisor: Int): Int {
    if (divisor == 0) {
        throw IllegalArgumentException("El divisor no puede ser cero")
    } else if (dividendo < divisor) {
        return 0
    }
    return 1 + dividir(dividendo - divisor, divisor)
}
