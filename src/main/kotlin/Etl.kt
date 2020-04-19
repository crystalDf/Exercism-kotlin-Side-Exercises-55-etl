object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> =
            source.map { it.value.map { value -> value.toLowerCase() to it.key } }
                    .flatten().sortedBy { it.first }
                    .fold(emptyMap()) {
                        acc, pair -> acc.plus(pair)
                    }
}
