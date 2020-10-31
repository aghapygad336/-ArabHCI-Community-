
package app.graphcis

import android.graphics.Color
import android.graphics.Paint
import camera.GraphicOverlay
import camera.OcrGraphicOverlay



import com.google.android.gms.vision.text.TextBlock
/**
 * Graphic instance for rendering TextBlock position, size, and ID within an associated graphic
 * overlay view.
 */
class CalibratedOcrGraphic(overlay: GraphicOverlay<*>, text: TextBlock) : OcrGraphic(overlay, text) {

    init {
        if (rectPaint == null) {
            rectPaint = Paint()
            rectPaint!!.color = Color.GREEN
            rectPaint!!.style = Paint.Style.STROKE
            rectPaint!!.strokeWidth = 4.0f
        }

        if (textPaint == null) {
            textPaint = Paint()
            textPaint!!.color = Color.GREEN
            textPaint!!.textSize = 54.0f
        }
    }


    override fun getRectPaint(): Paint {
        return rectPaint!!
    }

    override fun getTextPaint(): Paint {
        return textPaint!!
    }

    companion object {
        private var rectPaint: Paint? = null
        private var textPaint: Paint? = null
    }
}
