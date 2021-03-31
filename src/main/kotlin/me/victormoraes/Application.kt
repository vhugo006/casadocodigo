package me.victormoraes

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("me.victormoraes")
		.start()
}

