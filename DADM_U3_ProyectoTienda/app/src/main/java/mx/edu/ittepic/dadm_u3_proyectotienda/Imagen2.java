package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

import mx.edu.ittepic.dadm_u3_proyectotienda.Lienzo;

public class Imagen2  {
    private Bitmap icono;
    private float x, y;
    private boolean visible;



    public Imagen2(int resource, float _x, float _y, final Lienzo2 o) {

        icono = BitmapFactory.decodeResource(o.getResources(), resource);
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
