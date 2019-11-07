// HomeWork 1.2

fun main() {

    val weight: Double = 70.0
    val height: Double = 1.7

    val index = bodyMassIndex(weight, height)
    val verdict = when(index) {

        in 0..16   -> "Выраженный дефицит массы тела"
        in 16..18  -> "Дефицит массы тела"
        in 18..25  -> "Номра"
        in 25..30  -> "Избыточная масса тела"
        in 30..35  -> "Ожирение"
        in 35..40  -> "Ожирение резкое"
        in 40..100 -> "Очень резкое ожирение"
        else -> "Попробуйте еще раз"
    }

    print(verdict)

}

fun bodyMassIndex(

    weight: Double,
    height: Double

    ): Int {

    val body_mass_index = weight/(height*height)

    // Публикация данных вычислений
    print("\nРост: $height м")
    print("\nВес:  $weight кг")
    print("\nИМТ:  ${body_mass_index.toInt()}\n")

    return body_mass_index.toInt()

}


