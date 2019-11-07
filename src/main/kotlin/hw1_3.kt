// HomeWork 1.3

fun main() {

    var published_ago: Int = 30
    publishedAgo(published_ago)

    published_ago = 90
    publishedAgo(published_ago)

    published_ago = 130
    publishedAgo(published_ago)

    published_ago = 360
    publishedAgo(published_ago)

    published_ago = 600
    publishedAgo(published_ago)

    published_ago = 1800
    publishedAgo(published_ago)

    published_ago = 3600
    publishedAgo(published_ago)

    published_ago = 72000
    publishedAgo(published_ago)

}

fun publishedAgo(published_ago: Int) {

   val text_published_ago = when(published_ago) {

        in 0..59     -> "Менее минуты назад"
        in 60..119   -> "Минуту назад"
        in 120..179  -> "Две минуты назад"
        in 180..239  -> "Три минуты назад"
        in 240..299  -> "Четыре минуты назад"
        in 300..599  -> "Пять минут назад"
        in 600..899  -> "Десять минут назад"

        in 900..1199   -> "Пятнадцать минут назад"
        in 1200..1799  -> "Двадцать минут назад"
        in 1800..2399  -> "Тридцать минут назад"
        in 2400..2999  -> "Сорок минут назад"
        in 3000..3599  -> "Пятьдесят минут назад"
        in 3600..4199  -> "Час назад"

        else -> "Несколько часов назад"
    }

    println(text_published_ago)

}