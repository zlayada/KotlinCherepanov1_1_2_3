// HomeWork 1.1

fun main() {

    println("Hello World")

    val amount = 200                                        // стоимость текущей продажи
    var total = 900                                         // сумма предыдущих продаж
    calculateFee(amount, total)                             // exclusive по умолчанию = false

    total = 1_001
    calculateFee(amount, total)

    total = 10_001
    calculateFee(amount, total)

    total = 50_001
    calculateFee(amount, total)

    total = 50_001
    calculateFee(amount, total, true)

}

// Расчет размера комиссии за услуги сервиса
fun calculateFee(

    amount: Int,
    total: Int,
    exclusive: Boolean  = false

    ): Double {

    // Уровни комиссии сервиса
    val level_one: Double = 0.3
    val level_two: Double = 0.25
    val level_three: Double = 0.2
    val level_four: Double = 0.15
    val fee_exclusive: Double = -0.05

    // Лимиты для уменьшения комиссии сервиса
    val limit_one: Int = 1_000
    val limit_two: Int = 10_000
    val limit_three: Int = 50_000

    var total_percent: Double = 0.0  // Итоговый процент комиссии
    var total_fee: Double = 0.0      // Итоговая комисия за текущую продажу
    var status_exclusive: String = "Нет"


    // Вычистление комиссии сервсиса от накопленных продаж
    if (total<=limit_one)        { total_percent = level_one }
    else if (total<=limit_two)   { total_percent = level_two }
    else if (total<=limit_three) { total_percent = level_three }
    else                         { total_percent = level_four }

    // Проверка на дополнительный вычет из комиссии за статус "exclusive"
    if (exclusive==true)  {

        total_percent += fee_exclusive
        status_exclusive = "Есть"

    }

    // Вычисление комиссии за текущую продажу
    total_fee = amount * total_percent

    // Публикация данных вычислений
    print("\n\nСкачено контента за текущий период на сумму: $total")
    print("\nНаличие статуса Exclusive и дополнительной скидки: $status_exclusive")
    print("\nТекущая продажа: $amount")
    print("\nИтоговая комиссия за использование сервиса в процентах: ${total_percent*100}%")
    print("\nИтоговая комиссия за использование сервиса в деньгах: $total_fee")

    return total_fee

    }


