package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo2 extends View {

    String mensaje;
    Imagen2 mandocubo, fondo, barra2, mando64, snes, nes, patnes, puntero;
    Imagen2 descripcionmandocubo, descripcionn64, descripcionsnes, descripcionnes, sticksnes, retorno,logo;
    Principal2 puntero3;
    Imagen2 mandocubo3,mando64tres,mandosnes3,patsnes3,mandones3;
    int numeros = 0;

    public Lienzo2(Context context) {
        super(context);


        fondo = new Imagen2(R.drawable.fondo, 0, 0, this);
        logo = new Imagen2(R.drawable.logoman,-10,-10,this);
        mandocubo = new Imagen2(R.drawable.gamecubemando2, -50, 10, this);
        barra2 = new Imagen2(R.drawable.barra2, -10, 1, this);
        mando64 = new Imagen2(R.drawable.mando64dos, -20, 400, this);
        snes = new Imagen2(R.drawable.mandosnes2, -20, 700, this);
        nes = new Imagen2(R.drawable.mandones, -20, 1000, this);
        patnes = new Imagen2(R.drawable.mandosnespro, -20, 1300, this);

        descripcionmandocubo = new Imagen2(R.drawable.descipcionmandocubo2, 400, 650, this);
        descripcionn64 = new Imagen2(R.drawable.descripcionn64, 400, 650, this);
        descripcionsnes = new Imagen2(R.drawable.descipcionsnes, 400, 650, this);
        descripcionnes = new Imagen2(R.drawable.descripcionnes, 400, 650, this);
        sticksnes = new Imagen2(R.drawable.joysticksnes, 400, 650, this);
      //  retorno = new Imagen2(R.drawable.retorno2, 800, 1235, this);

        mandocubo3=new Imagen2(R.drawable.gamecubemando4,400,200,this);
        mando64tres=new Imagen2(R.drawable.mandon64cuatro,400,200,this);
        mandosnes3=new Imagen2(R.drawable.mandonintendones3,400,200,this);
        patsnes3=new Imagen2(R.drawable.mandosnespro2,400,200,this);
        mandones3=new Imagen2(R.drawable.mandones3,450,150,this);

        descripcionmandocubo.hacerVisible(false);
        descripcionn64.hacerVisible(false);
        descripcionsnes.hacerVisible(false);
        descripcionnes.hacerVisible(false);
        sticksnes.hacerVisible(false);
        mandocubo3.hacerVisible(false);
        mando64tres.hacerVisible(false);
        mandosnes3.hacerVisible(false);
        patsnes3.hacerVisible(false);
        mandones3.hacerVisible(false);
        puntero = null;
        puntero3 = (Principal2) context;


    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        fondo.pintar(canvas, p);
        barra2.pintar(canvas, p);
        mandocubo.pintar(canvas, p);
        mando64.pintar(canvas, p);
        snes.pintar(canvas, p);
        nes.pintar(canvas, p);
        patnes.pintar(canvas, p);
        descripcionmandocubo.pintar(canvas, p);
        descripcionn64.pintar(canvas, p);
        descripcionsnes.pintar(canvas, p);
        descripcionnes.pintar(canvas, p);
        sticksnes.pintar(canvas, p);
       // retorno.pintar(canvas, p);
        mandocubo3.pintar(canvas, p);
        mando64tres.pintar(canvas, p);
        mandosnes3.pintar(canvas, p);
        patsnes3.pintar(canvas, p);
        mandones3.pintar(canvas, p);
        logo.pintar(canvas, p);


    }

    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:
                //Entra si e.getAction esta presionado

                if (mandocubo.estEnArea(xp, yp)) {

                    puntero = mandocubo;
                    numeros = 1;
                    descripcionmandocubo.hacerVisible(true);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(false);
                    mandocubo3.hacerVisible(true);
                    mando64tres.hacerVisible(false);
                    mandosnes3.hacerVisible(false);
                    patsnes3.hacerVisible(false);
                    mandones3.hacerVisible(false);
                }

                if (mando64.estEnArea(xp, yp)) {

                    puntero = mando64;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(true);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(false);
                    mandocubo3.hacerVisible(false);
                    mando64tres.hacerVisible(true);
                    mandosnes3.hacerVisible(false);
                    patsnes3.hacerVisible(false);
                    mandones3.hacerVisible(false);
                }
                if (snes.estEnArea(xp, yp)) {

                    puntero = snes;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(true);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(false);
                    mandocubo3.hacerVisible(false);
                    mando64tres.hacerVisible(false);
                    mandosnes3.hacerVisible(true);
                    patsnes3.hacerVisible(false);
                    mandones3.hacerVisible(false);
                }
                if (nes.estEnArea(xp, yp)) {

                    puntero = nes;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(true);
                    sticksnes.hacerVisible(false);
                    mandocubo3.hacerVisible(false);
                    mando64tres.hacerVisible(false);
                    mandosnes3.hacerVisible(false);
                    patsnes3.hacerVisible(false);
                    mandones3.hacerVisible(true);
                }
                if (patnes.estEnArea(xp, yp)) {

                    puntero = patnes;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(true);
                    mandocubo3.hacerVisible(false);
                    mando64tres.hacerVisible(false);
                    mandosnes3.hacerVisible(false);
                    patsnes3.hacerVisible(true);
                    mandones3.hacerVisible(false);
                }

                break;

            case MotionEvent.ACTION_MOVE: //no es eficiente el if en mover

                if (puntero == mandocubo) {
                    mandocubo.mover(yp + 20);
                    mando64.mover(yp + 400);
                    snes.mover(yp + 700);
                    nes.mover(yp + 1000);
                    patnes.mover(yp + 1300);
                }
                if (puntero == mando64) {
                    mandocubo.mover(yp - 300);
                    mando64.mover(yp);
                    snes.mover(yp + 300);
                    nes.mover(yp + 600);
                    patnes.mover(yp + 900);
                }
                if (puntero == snes) {
                    mandocubo.mover(yp - 600);
                    mando64.mover(yp - 300);
                    snes.mover(yp);
                    nes.mover(yp + 300);
                    patnes.mover(yp + 600);
                }
                if (puntero == nes) {
                    mandocubo.mover(yp - 900);
                    mando64.mover(yp - 600);
                    snes.mover(yp - 300);
                    nes.mover(yp);
                    patnes.mover(yp + 300);
                }
                if (puntero == patnes) {
                    mandocubo.mover(yp - 1200);
                    mando64.mover(yp - 900);
                    snes.mover(yp - 600);
                    nes.mover(yp - 300);
                    patnes.mover(yp);
                }


                break;
            case MotionEvent.ACTION_UP:
                puntero = null;
                break;


        }
        invalidate();//manda llamar a onDraw
        return true;
    }


}
