package com.leetcode

object NameMatch {
    fun nameMatch(knownAliases: List<String>, name: String): Boolean {
        val transformedAliases = knownAliases.map { createName(it) }
        val transformedName = createName(name)
        transformedAliases.forEach {
            return if (it.numberOfNameFields() <= transformedName.numberOfNameFields()) {
                transformedAliases.any { alias -> alias == transformedName }
            } else {
                transformedAliases.map { transformed -> Name(first = transformed.first, last = transformed.last) }
                    .any { other -> other == transformedName }
            }
        }
        return false
    }

    private fun createName(name: String): Name {
        val nameFields = name.split(" ")
        return when (nameFields.size) {
            2 -> Name(first = nameFields.first(), last = nameFields.last())
            else -> Name(first = nameFields.first(), middle = nameFields[1], last = nameFields.last())
        }
    }
}

data class Name(
    val first: String = "",
    val middle: String = "",
    val last: String = ""
) {

    fun numberOfNameFields(): Int {
        return when {
            this.first.isNotBlank() && this.middle.isNotBlank() && this.last.isNotBlank() -> 3
            else -> 2
        }
    }

    override fun equals(other: Any?): Boolean {
        other as Name
        return when {
            hasFirstAndLastNameOnly() -> this.first == other.first && this.last == other.last
            else -> this.first == other.first && middleNameCompare(other) && this.last == other.last
        }
    }

    private fun hasFirstAndLastNameOnly() = this.first.isNotBlank() && this.middle.isBlank() && this.last.isNotBlank()

    private fun middleNameCompare(other: Name) =
        this.middle == other.middle ||
        this.middle.startsWith(other.middle) ||
        other.middle.startsWith(this.middle)

    override fun hashCode(): Int {
        var result = first.hashCode()
        result = 31 * result + middle.hashCode()
        result = 31 * result + last.hashCode()
        return result
    }
}