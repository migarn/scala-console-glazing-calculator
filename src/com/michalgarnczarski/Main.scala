package com.michalgarnczarski

object Main {
  def main(args: Array[String]): Unit = {

    val glass = new Glass(1250, 1100, 16)
    println(glass.area)
    println(glass.dimensionsRatio)

    val glassThicknessDefiner = new GlassThicknessDefiner(glass)
    println(glassThicknessDefiner.thickness)

  }
}
