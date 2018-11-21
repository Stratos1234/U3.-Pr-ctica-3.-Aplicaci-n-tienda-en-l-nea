package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Imagen  {
    private Bitmap icono;
    private float x, y;
    private boolean visible;



    public Imagen(int resource, float _x, float _y, final Lienzo l) {

        icono = BitmapFactory.decodeResource(l.getResources(), resource);
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

    public void mover(float xp) {

        x = xp - (icono.getWidth() / 2);


    }
    public void movere2(float yp)
    {
        y = yp - (icono.getHeight() / 2);
    }



}
