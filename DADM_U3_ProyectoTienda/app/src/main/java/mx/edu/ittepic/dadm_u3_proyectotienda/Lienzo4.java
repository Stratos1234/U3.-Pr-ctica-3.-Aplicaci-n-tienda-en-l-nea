package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo4 extends View {
    String mensaje;
    Imagen4 fondo, barra2, puntero;
    Imagen4 logo, controlpack, memoriacubo, multitap, rumblepack;
    Imagen4 descripcionmandocubo,
            descripcionn64, descripcionsnes,
            descripcionnes, sticksnes, retorno;
    Principal4 puntero4;
    Imagen4 controlpack2, memoriacubo2,multi2,rumble2;


    public Lienzo4(Context context) {
        super(context);


        fondo = new Imagen4(R.drawable.fondo, 0, 0, this);
        barra2 = new Imagen4(R.drawable.barr4, -10, 1, this);

        logo = new Imagen4(R.drawable.logoacce, -10, -10, this);
        controlpack = new Imagen4(R.drawable.controlpack, -30, 300, this);
        memoriacubo = new Imagen4(R.drawable.memoriacubos, -50, 600, this);
        multitap = new Imagen4(R.drawable.multi2, -90, 950, this);
        rumblepack = new Imagen4(R.drawable.rumblepack, -20, 1200, this);

        descripcionmandocubo = new Imagen4(R.drawable.controllerpack, 400, 650, this);
        descripcionn64 = new Imagen4(R.drawable.c, 400, 650, this);
        descripcionsnes = new Imagen4(R.drawable.multitapnes, 400, 650, this);
        descripcionnes = new Imagen4(R.drawable.rumble, 400, 650, this);

        controlpack2 = new Imagen4(R.drawable.controlpack2, 500, 300, this);
        memoriacubo2 = new Imagen4(R.drawable.memoriacubos2, 500, 200, this);
        multi2 = new Imagen4(R.drawable.multi3, 500, 200, this);
        rumble2= new Imagen4(R.drawable.rumblepack2, 500, 200, this);


        descripcionmandocubo.hacerVisible(false);
        descripcionn64.hacerVisible(false);
        descripcionsnes.hacerVisible(false);
        descripcionnes.hacerVisible(false);
        controlpack2.hacerVisible(false);
        memoriacubo2.hacerVisible(false);
        multi2.hacerVisible(false);
        rumble2.hacerVisible(false);


        puntero = null;
        puntero4 = (Principal4) context;


    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        fondo.pintar(canvas, p);
        barra2.pintar(canvas, p);

        controlpack.pintar(canvas, p);
        memoriacubo.pintar(canvas, p);
        multitap.pintar(canvas, p);
        rumblepack.pintar(canvas, p);
        descripcionmandocubo.pintar(canvas, p);
        descripcionn64.pintar(canvas, p);
        descripcionsnes.pintar(canvas, p);
        descripcionnes.pintar(canvas, p);

        controlpack2.pintar(canvas, p);
        memoriacubo2.pintar(canvas, p);
        multi2.pintar(canvas, p);
        rumble2.pintar(canvas, p);
        logo.pintar(canvas, p);



    }

    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:
                //Entra si e.getAction esta presionado



                if (controlpack.estEnArea(xp, yp)) {

                    puntero = controlpack;
                    descripcionmandocubo.hacerVisible(true);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    controlpack2.hacerVisible(true);
                    memoriacubo2.hacerVisible(false);
                    multi2.hacerVisible(false);
                    rumble2.hacerVisible(false);

                }
                if (memoriacubo.estEnArea(xp, yp)) {


                    puntero = memoriacubo;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(true);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    controlpack2.hacerVisible(false);
                    memoriacubo2.hacerVisible(true);
                    multi2.hacerVisible(false);
                    rumble2.hacerVisible(false);
                }
                if (multitap.estEnArea(xp, yp)) {


                    puntero = multitap;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(true);
                    descripcionnes.hacerVisible(false);
                    controlpack2.hacerVisible(false);
                    memoriacubo2.hacerVisible(false);
                    multi2.hacerVisible(true);
                    rumble2.hacerVisible(false);

                }
                if (rumblepack.estEnArea(xp, yp)) {

                    puntero = rumblepack;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(true);
                    controlpack2.hacerVisible(false);
                    memoriacubo2.hacerVisible(false);
                    multi2.hacerVisible(false);
                    rumble2.hacerVisible(true);
                }

                break;

            case MotionEvent.ACTION_MOVE: //no es eficiente el if en mover


                if (puntero == controlpack) {

                    controlpack.mover(yp);
                    memoriacubo.mover(yp + 300);
                    multitap.mover(yp + 600);
                    rumblepack.mover(yp + 900);
                }
                if (puntero == memoriacubo) {

                    controlpack.mover(yp - 300);
                    memoriacubo.mover(yp);
                    multitap.mover(yp + 300);
                    rumblepack.mover(yp + 600);
                }
                if (puntero == multitap) {
                    controlpack.mover(yp - 600);
                    memoriacubo.mover(yp - 300);
                    multitap.mover(yp);
                    rumblepack.mover(yp + 300);
                }
                if (puntero == rumblepack) {
                    controlpack.mover(yp - 900);
                    memoriacubo.mover(yp - 600);
                    multitap.mover(yp - 300);
                    rumblepack.mover(yp);
                }
                break;


        }
        invalidate();//manda llamar a onDraw
        return true;
    }


}




