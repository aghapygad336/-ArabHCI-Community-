package camera;

import android.content.Context;
import android.util.AttributeSet;

import app.graphcis.OcrGraphic;

public class OcrGraphicOverlay<U extends OcrGraphic> extends GraphicOverlay {

    public OcrGraphicOverlay(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OcrGraphic getByContent(String text) {

        for (OcrGraphic g : (Iterable<U>) mGraphics) {
            if (g.getValue().equals(text)) {
                return g;
            }
        }

        return null;
    }

    public void add(Graphic graphic) {
        super.add(graphic);
    }

    public void remove(Graphic graphic) {
        super.remove(graphic);
    }
}