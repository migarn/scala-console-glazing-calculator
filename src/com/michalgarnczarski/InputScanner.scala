package com.michalgarnczarski

import scala.io.StdIn.readInt
import scala.util.Try

object InputScanner {

  private def scanPositiveInt(): Int = {

    // If input is not Int or is negative return -1

    val input: Int = Try(readInt()).orElse(Try(-1)).get
    input.max(-1)
  }

  def scanPositiveIntWithInstruction(instruction: String): Int = {

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
}
