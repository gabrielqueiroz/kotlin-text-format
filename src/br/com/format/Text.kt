package br.com.format

/**
 * Created by gabriel on 07/04/17.
 */
class Text(){

    var value: String = ""
    var size: Int = 0

    fun value( value: String ): Text {
        this.value = value
        return this
    }

    fun size( size: Int ): Text {
        this.size = size
        return this
    }

    fun isAlphanumeric(): Boolean = Regex("^[a-zA-Z0-9\\s]*$").matches(this.value)

    fun isNumeric(): Boolean = Regex("^[0-9]*$").matches(this.value)

    fun isEmpty(): Boolean = this.value.isEmpty()

    fun isOversized(): Boolean = this.value.length > this.size
}