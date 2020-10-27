package com.michalgarnczarski

import com.michalgarnczarski.InputScanner.scanPositiveIntWithInstruction

object ConsoleApplication {

  def run(): Unit = {
    println("\nThe application defines minimum thickness of glazing for given dimensions.")
    val firstDimension: Int = scanPositiveIntWithInstruction("\nType first dimension:")

    println(firstDimension)



  }



}
