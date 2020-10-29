package com.michalgarnczarski

class Glass(width: Int, height: Int, val spacerThickness: Int) {
  require(width > 0 && height > 0 && spacerThickness > 0)

  val longerDimension: Int = width.max(height)
  val shorterDimension: Int = width.min(height)

  // "(a * 100).round / 100.0" done to have desired precision of 2 decimal places

  val area: Double = (longerDimension.toDouble * shorterDimension / 1000000 * 100).round / 100.0

  val dimensionsRatio: Double = shorterDimension.toDouble / longerDimension
}
