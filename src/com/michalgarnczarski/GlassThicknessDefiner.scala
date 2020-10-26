package com.michalgarnczarski

class GlassThicknessDefiner(glass: Glass) {

  val thickness: Int = defineThickness

  def defineThickness: Int = {
    if (glass.spacerThickness >= 16) defineThicknessFor16
    else if (glass.spacerThickness >= 12) defineThicknessFor12
    else if (glass.spacerThickness >= 9) defineThicknessFor9
    else if (glass.spacerThickness >= 6) defineThicknessFor6
    else -1
  }

  private def defineThicknessFor16: Int = {
    if (glass.area <= 1.5 && glass.longerDimension <= 1500 && glass.dimensionsRatio > 1/6) 3
    else if (glass.area <= 3.35 && glass.longerDimension <= 2500 && glass.dimensionsRatio > 1/6) 4
    else if (glass.area <= 5 && glass.longerDimension <= 3300) 5
    else if (glass.area <= 7 && glass.longerDimension <= 3500) 6
    else if (glass.area <= 10 && glass.longerDimension <= 5000) 8
    else if (glass.area <= 13.5 && glass.longerDimension <= 5000) 10
    else if (glass.area <= 13.5 && glass.longerDimension <= 6000) 12
    else -1
  }

  private def defineThicknessFor12: Int = {
    if (glass.area <= 1.5 && glass.longerDimension <= 1500 && glass.dimensionsRatio > 1/6) 3
    else if (glass.area <= 3.35 && glass.longerDimension <= 2500 && glass.dimensionsRatio > 1/6) 4
    else if (glass.area <= 5 && glass.longerDimension <= 3300) 5
    else if (glass.area <= 7 && glass.longerDimension <= 3500) 6
    else if (glass.area <= 8.75 && glass.longerDimension <= 3500) 8
    else -1
  }

  private def defineThicknessFor9: Int = {
    if (glass.area <= 1.5 && glass.longerDimension <= 1500 && glass.dimensionsRatio > 1/6) 3
    else if (glass.area <= 2.5 && glass.longerDimension <= 2500 && glass.dimensionsRatio > 1/6) 4
    else if (glass.area <= 3.5 && glass.longerDimension <= 3000) 5
    else if (glass.area <= 4.5 && glass.longerDimension <= 3000) 6
    else if (glass.area <= 6 && glass.longerDimension <= 3000) 8
    else -1
  }

  private def defineThicknessFor6: Int = {
    if (glass.area <= 2 && glass.longerDimension <= 2000 && glass.dimensionsRatio > 1/6) 4
    else if (glass.area <= 2.5 && glass.longerDimension <= 2500) 5
    else if (glass.area <= 3 && glass.longerDimension <= 3000) 6
    else if (glass.area <= 4 && glass.longerDimension <= 3000) 8
    else -1
  }
}
