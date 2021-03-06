package com.michalgarnczarski

class GlassSurchargeDefiner(glass: Glass) {

  def defineSurcharge: Int = {

    if (conditionFor0) 0
    else if (conditionFor50) 50
    else if (conditionFor75) 75
    else if (conditionFor100) 100
    else if (conditionFor125) 125
    else if (conditionFor150) 150
    else -1
  }

  // Auxiliary functions defining conditions for particular levels of surcharge for oversizing

  private def conditionFor0: Boolean = glass.longerDimension <= 3000 && glass.shorterDimension <= 2400

  private def conditionFor50: Boolean = (glass.longerDimension > 2400 && glass.longerDimension <= 3000 &&
    glass.shorterDimension > 2400 && glass.shorterDimension <= 2700) ||
    (glass.longerDimension > 3000 && glass.longerDimension <= 4000 && glass.shorterDimension < 2700)

  private def conditionFor75: Boolean = (glass.longerDimension > 3000 && glass.longerDimension <= 4000 &&
    glass.shorterDimension > 2000 && glass.shorterDimension <= 2400) ||
    (glass.longerDimension > 4000 && glass.longerDimension <= 5000 && glass.shorterDimension < 2000)

  private def conditionFor100: Boolean = (glass.longerDimension > 3000 && glass.longerDimension <= 4000 &&
    glass.shorterDimension > 2400 && glass.shorterDimension <= 2700) ||
    (glass.longerDimension > 4000 && glass.longerDimension <= 5000 &&
    glass.shorterDimension > 2000 && glass.shorterDimension <= 2400) ||
    (glass.longerDimension > 5000 && glass.longerDimension <= 6000 && glass.shorterDimension < 2000)

  private def conditionFor125: Boolean = (glass.longerDimension > 4000 && glass.longerDimension <= 5000 &&
    glass.shorterDimension > 2400 && glass.shorterDimension <= 2700) ||
    (glass.longerDimension > 5000 && glass.longerDimension <= 6000 &&
    glass.shorterDimension > 2000 && glass.shorterDimension <= 2400)

  private def conditionFor150: Boolean = glass.longerDimension > 5000 && glass.longerDimension <= 6000 &&
    glass.shorterDimension > 2400 && glass.shorterDimension <= 2700
}
