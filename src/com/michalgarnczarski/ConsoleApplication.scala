package com.michalgarnczarski

import com.michalgarnczarski.InputScanner._

import scala.annotation.tailrec

object ConsoleApplication {

  def run(): String = {

    // Function launching console user interface

    // An auxiliary function working recursively until the application terminates.

    @tailrec
    def auxiliaryRun(controller: Int): String = {

      if (controller == 2) "\nThe application has been terminated..."

      else {
        val width: Int = scanPositiveIntWithInstruction("\nType width:")
        val height: Int = scanPositiveIntWithInstruction("\nType height:")
        val spacerThickness: Int = scanPositiveIntWithInstruction("\nType spacer thickness:")

        val glass = new Glass(width, height, spacerThickness)

        println(createReport(glass))

        val controller: Int = scanIntForSelectionList("\nType:\n1 - to continue\n2 - to exit",1,2)
        auxiliaryRun(controller)
      }
    }

    println("\nThe application defines minimum thickness of a glazing for given dimensions.")
    auxiliaryRun(1)
  }

  private def createReport(glass: Glass): String = {

    // An auxiliary function creating report for given glazing parameters

    val thickness = new GlassThicknessDefiner(glass).defineThickness
    val surcharge = new GlassSurchargeDefiner(glass).defineSurcharge

    val report: StringBuilder = new StringBuilder

    report.append("\n-------------------------------------------")
    report.append("\n\nAssumed parameters:")
    report.append("\n\t- dimensions: " + glass.width + " mm x " + glass.height + " mm,")
    report.append("\n\t- area: " + glass.area + " m2,")
    report.append("\n\t- spacer thickness: " + glass.spacerThickness + " mm.")

    if (thickness == -1 || surcharge == -1) {
      report.append("\n\nPlease consult assumed parameters with the glazing manufacturer!")
    }

    else {
      val vsgThickness: String = thickness match {
        case 3 => "33.1"
        case 4 => "33.1"
        case 5 => "44.1"
        case 6 => "55.1"
        case 8 => "66.1"
        case 10 => "88.1"
        case 12 => "10.10.1"
      }

      report.append("\n\nFor assumed parameters minimum glazing width is:")
      report.append("\n\t- " + thickness + " mm - for single glass,")
      report.append("\n\t- " + vsgThickness + " - for laminated glass.")

      if (surcharge == 0)
        report.append("\n\nFor assumed parameters there is no surcharge for oversizing.")

      else
        report.append("\n\nFor assumed parameters there is " + surcharge + "% surcharge for oversizing!")

      if (glass.dimensionsRatio < 0.1)
        report.append("\n\nAttention! Glazing dimensions ratio is lower than 1:10!")
    }

    report.append("\n\n-------------------------------------------")
    report.toString()
  }
}
