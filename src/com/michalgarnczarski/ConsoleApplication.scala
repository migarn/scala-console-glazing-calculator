package com.michalgarnczarski

import com.michalgarnczarski.InputScanner.scanPositiveIntWithInstruction
import com.sun.org.glassfish.external.amx.AMXGlassfish

object ConsoleApplication {

  def run(): Unit = {
    println("\nThe application defines minimum thickness of glazing for given dimensions.")

    while (true) {
      val width: Int = scanPositiveIntWithInstruction("\nType width:")
      val height: Int = scanPositiveIntWithInstruction("\nType height:")
      val spacerThickness: Int = scanPositiveIntWithInstruction("\nType spacer thickness:")

      val glass = new Glass(width, height, spacerThickness)
      val thickness = new GlassThicknessDefiner(glass).defineThickness
      val surcharge = new GlassSurchargeDefiner(glass).defineSurcharge




    }








  }



}
