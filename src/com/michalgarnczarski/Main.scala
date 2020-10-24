package com.michalgarnczarski

object Main {
  def main(args: Array[String]): Unit = {

    val glass = new Glass(2001, 1100, 8)
    println(glass.area)
    println(glass.dimensionsRatio)

    val glassThicknessDefiner = new GlassThicknessDefiner(glass)
    println(glassThicknessDefiner.thickness)

  }
}
