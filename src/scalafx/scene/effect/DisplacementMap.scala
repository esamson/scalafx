/*
* Copyright (c) 2012, ScalaFX Project
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*     * Redistributions of source code must retain the above copyright
*       notice, this list of conditions and the following disclaimer.
*     * Redistributions in binary form must reproduce the above copyright
*       notice, this list of conditions and the following disclaimer in the
*       documentation and/or other materials provided with the distribution.
*     * Neither the name of the ScalaFX Project nor the
*       names of its contributors may be used to endorse or promote products
*       derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
* ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
* WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
* FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
* AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package scalafx.scene.effect

import scalafx.Includes._
import javafx.scene.{ effect => jfxse }
import scalafx.scene.paint._
import scalafx.util.SFXDelegate

object DisplacementMap {
  implicit def sfxDisplacementMap2jfx(dm: DisplacementMap) = dm.delegate
}

class DisplacementMap(override val delegate: jfxse.DisplacementMap = new jfxse.DisplacementMap) extends Effect(delegate) with SFXDelegate[jfxse.DisplacementMap] {

  /**
   * The input for this Effect.
   */
  def input = delegate.inputProperty
  def input_=(v: Effect) {
    input() = v
  }

  /**
   * The map data for this Effect.
   */
  def mapData = delegate.mapDataProperty
  def mapData_=(v: FloatMap) {
    mapData() = v
  }

  /**
   * The offset by which all x coordinate offset values in the FloatMap are displaced after they are scaled.
   */
  def offsetX = delegate.offsetXProperty
  def offsetX_=(v: Double) {
    offsetX() = v
  }

  /**
   * The offset by which all y coordinate offset values in the FloatMap are displaced after they are scaled.
   */
  def offsetY = delegate.offsetYProperty
  def offsetY_=(v: Double) {
    offsetX() = v
  }

  /**
   * The scale factor by which all x coordinate offset values in the FloatMap are multiplied.
   */
  def scaleX = delegate.scaleXProperty
  def scaleX_=(v: Double) {
    scaleX() = v
  }

  /**
   * The scale factor by which all y coordinate offset values in the FloatMap are multiplied.
   */
  def scaleY = delegate.scaleYProperty
  def scaleY_=(v: Double) {
    scaleY() = v
  }

  /**
   * Defines whether values taken from outside the edges of the map "wrap around" or not.
   */
  def wrap = delegate.wrapProperty
  def wrap_=(v: Boolean) {
    wrap() = v
  }

}