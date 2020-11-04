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

    // Function printing an instruction and returning an positive Int.
    // The function works recursively until correct input is typed.

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
    // The function works recursively until correct input is typed.

    println(instruction)

    // wrongInputValue is an Int returned for incorrect inputs. It is an Int which unfailingly is not an allowedInput.

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
