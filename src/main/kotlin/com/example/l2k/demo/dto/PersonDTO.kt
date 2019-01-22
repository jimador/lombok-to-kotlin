package com.example.l2k.demo.dto

/**
 * @author James Dunnam
 */
data class PersonDTO(val name: String = "John", val age: Int = 22, var nickName: String = "") {
    constructor(name: String, age: Int): this()
}

