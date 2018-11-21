package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen5 {
    private Bitmap icono;
    private float x, y;
    private boolean visible;



    public Imagen5(int resource, float _x, float _y, final Lienzo5 a) {

        icono = BitmapFactory.decodeResource(a.getResources(), resource);
        x = _x;
        y = _y;
        visible = true;


    }
    public void pintar(Canvas c, Paint p) {
        if (visible) c.drawBitmap(icono, x, y, p);
    }

    public void hacerVisible(boolean v) {
        visible = v;
    }

    public boolean estEnArea(float xp, float yp) {
        if (!visible) return false;
        float x2, y2;
        x2 = x + icono.getWidth();
        y2 = y + icono.getHeight();
        if (xp >= x && xp <= x2) {
            if (yp >= y && yp <= y2) {
                return true;
            }
        }
        return false;

    }

    public void mover(float yp)
    {
        y = yp - (icono.getHeight() / 2);
    }



}



