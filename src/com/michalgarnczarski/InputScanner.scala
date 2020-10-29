package com.michalgarnczarski

import scala.io.StdIn.readInt
import scala.util.Try

object InputScanner {

  def scanPositiveInt(): Int = {

    // If input is not Int or is negative return -1

    val input: Int = Try(readInt()).orElse(Try(-1)).get
    input.max(-1)
  }

  def scanPositiveIntWithInstruction(instruction: String): Int = {

    // to comment

    var input: Int = 0
    var inLoop = true

    while (inLoop) {
      println(instruction)
      input = scanPositiveInt()

      if (input != -1) inLoop = false
      else println("\nWrong input!")
    }

    input
  }

  def scanIntForSelectionList(instruction: String, allowedInput: Int*): Int = {

    // to comment

    val wrongInputValue: Int = allowedInput.max + 1
    var input: Int = 0
    var inLoop = true

    while (inLoop) {
      println(instruction)
      input = Try(readInt()).orElse(Try(wrongInputValue)).get

      if (allowedInput.contains(input)) inLoop = false
      else println("\nWrong input!")
    }

    input
  }
}
