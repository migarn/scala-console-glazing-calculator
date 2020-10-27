package com.michalgarnczarski

import scala.io.StdIn.readInt
import scala.util.Try

object InputScanner {

  def scanPositiveInt(): Int = {
    val input: Int = Try(readInt()).orElse(Try(-1)).get
    input.max(-1)
  }
}
