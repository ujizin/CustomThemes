package br.com.yujiyoshimine.customthemes.extensions


fun String.capitalize() = replaceFirstChar { it.uppercase() }