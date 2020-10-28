package com.michalgarnczarski

import com.michalgarnczarski.InputScanner.scanPositiveIntWithInstruction

object ConsoleApplication {

  def run(): Unit = {
    println("\nThe application defines minimum thickness of glazing for given dimensions.")

    var inLoop = true

    while (inLoop) {

      val width: Int = scanPositiveIntWithInstruction("\nType width:")
      val height: Int = scanPositiveIntWithInstruction("\nType height:")
      val spacerThickness: Int = scanPositiveIntWithInstruction("\nType spacer thickness:")

      val glass = new Glass(width, height, spacerThickness)
      val thickness = new GlassThicknessDefiner(glass).defineThickness
      val surcharge = new GlassSurchargeDefiner(glass).defineSurcharge

      println("Thickness: " + thickness + ", surcharge: " + surcharge)

      // Wprowadzić ograniczenia dla gruości -1 i narzutu -1, zdefiniować opis




      println("\nType:\n1 - to continue\n2 - to exit")
    }








  }



}
