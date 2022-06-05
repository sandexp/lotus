package com.ledis.utils.helpers

import com.ledis.config.SQLConf

/**
 * Trait for getting the active SQLConf.
 */
trait SQLConfHelper {

  /**
   * The active config object within the current scope.
   * See [[SQLConf.get]] for more information.
   */
  def conf: SQLConf = SQLConf.get
}
