package com.michalgarnczarski

import scala.annotation.tailrec
import scala.io.StdIn.readInt
import scala.util.Try

object InputScanner {

  def scanPositiveInt(): Int = {

    // If the input is not an Int or is not positive return 0

    val input: Int = Try(readInt()).orElse(Try(0)).get
    input.max(0)
  }

  @tailrec
  def scanPositiveIntWithInstruction(instruction: String): Int = {

    println(instruction)

    val input: Int = scanPositiveInt()

    if (input != 0)
      input

    else {
      println("\nWrong input!")
      scanPositiveIntWithInstruction(instruction)
    }
  }

  @tailrec
  def scanIntForSelectionList(instruction: String, allowedInput: Int*): Int = {

    // Function printing an instruction and returning an Int limited by parameters.

    println(instruction)

    // wrongInputValue is an Int not belonging to allowedInput.

    val wrongInputValue: Int = allowedInput.max + 1
    val input: Int = Try(readInt()).orElse(Try(wrongInputValue)).get

    if (allowedInput.contains(input))
      input

    else {
      println("\nWrong input!")
      scanIntForSelectionList(instruction, allowedInput: _*)
    }
  }
}
