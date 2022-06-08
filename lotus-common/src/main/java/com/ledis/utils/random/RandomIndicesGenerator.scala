package com.ledis.utils.random

import org.apache.commons.math3.random.MersenneTwister
/**
 * This class is used to generate a random indices of given length.
 *
 * This implementation uses the "inside-out" version of Fisher-Yates algorithm.
 * Reference:
 *   https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#The_%22inside-out%22_algorithm
 */

case class RandomIndicesGenerator(randomSeed: Long) {
  private val random = new MersenneTwister(randomSeed)

  def getNextIndices(length: Int): Array[Int] = {
    val indices = new Array[Int](length)
    var i = 0
    while (i < length) {
      val j = random.nextInt(i + 1)
      if (j != i) {
        indices(i) = indices(j)
      }
      indices(j) = i
      i += 1
    }
    indices
  }
}
