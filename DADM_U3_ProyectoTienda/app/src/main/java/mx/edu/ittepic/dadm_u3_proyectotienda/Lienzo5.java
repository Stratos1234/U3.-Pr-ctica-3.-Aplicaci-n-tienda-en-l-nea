package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo5 extends View {
    String mensaje;
    Imagen5 fondo, barra2, puntero;
    Imagen5 logo, metal, contra,majoras, metroid;
    Imagen5 descripcionmandocubo,
            descripcionn64, descripcionsnes,
            descripcionnes, sticksnes, retorno;
    Imagen5 metalg,contra2,mask2,metroid2;



    public Lienzo5(Context context) {
        super(context);


        fondo = new Imagen5(R.drawable.fondo, 0, 0, this);
        barra2 = new Imagen5(R.drawable.barra5, -10, 1, this);

        logo = new Imagen5(R.drawable.logochido, -10, -10, this);
        metal = new Imagen5(R.drawable.metalgearsolid2, 30, 300, this);
        contra = new Imagen5(R.drawable.casetcontra, -10, 700, this);
        majoras = new Imagen5(R.drawable.majorasmask, -10, 1100, this);
        metroid= new Imagen5(R.drawable.metroid, -20, 1300, this);

        descripcionmandocubo = new Imagen5(R.drawable.descripcionmetal, 400, 650, this);
        descripcionn64 = new Imagen5(R.drawable.descripcioncontra, 400, 650, this);
        descripcionsnes = new Imagen5(R.drawable.descripcionmajoras, 400, 650, this);
        descripcionnes = new Imagen5(R.drawable.descripcionmetroid, 400, 650, this);




        metalg=new Imagen5(R.drawable.metalgearsolid4,500,50,this);
        contra2=new Imagen5(R.drawable.casetcontra2,500,200,this);
        mask2=new Imagen5(R.drawable.mask2,450,200,this);
        metroid2=new Imagen5(R.drawable.metroid2,500,250,this);

        descripcionmandocubo.hacerVisible(false);
        metalg.hacerVisible(false);
        descripcionn64.hacerVisible(false);
        contra2.hacerVisible(false);
        descripcionsnes.hacerVisible(false);
        descripcionnes.hacerVisible(false);
        mask2.hacerVisible(false);
        metroid2.hacerVisible(false);


        puntero = null;



    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        fondo.pintar(canvas, p);

        barra2.pintar(canvas, p);

        metal.pintar(canvas, p);
        contra.pintar(canvas, p);
        majoras.pintar(canvas, p);
        mask2.pintar(canvas, p);
        metroid.pintar(canvas, p);
        metroid2.pintar(canvas,p);
        descripcionmandocubo.pintar(canvas, p);
        metalg.pintar(canvas, p);
        descripcionn64.pintar(canvas, p);
        contra2.pintar(canvas, p);
        descripcionsnes.pintar(canvas, p);
        descripcionnes.pintar(canvas, p);

        logo.pintar(canvas, p);



    }

    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:
                //Entra si e.getAction esta presionado


                if (metal.estEnArea(xp, yp)) {

                    puntero = metal;
                    descripcionmandocubo.hacerVisible(true);
                    metalg.hacerVisible(true);
                    contra2.hacerVisible(false);
                    mask2.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    metroid2.hacerVisible(false);


                }
                if (contra.estEnArea(xp, yp)) {

                    puntero = contra;
                    descripcionmandocubo.hacerVisible(false);
                    contra2.hacerVisible(true);
                    metalg.hacerVisible(false);
                    mask2.hacerVisible(false);
                    descripcionn64.hacerVisible(true);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    metroid2.hacerVisible(false);

                }
                if (majoras.estEnArea(xp, yp)) {

                    puntero = majoras;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(true);
                    descripcionnes.hacerVisible(false);
                    mask2.hacerVisible(true);
                    contra2.hacerVisible(false);
                    metalg.hacerVisible(false);
                    metroid2.hacerVisible(false);

                }
                if (metroid.estEnArea(xp, yp)) {

                    puntero = metroid;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(true);
                    mask2.hacerVisible(false);
                    metroid2.hacerVisible(true);
                    contra2.hacerVisible(false);
                }

                break;

            case MotionEvent.ACTION_MOVE: //no es eficiente el if en mover


                if (puntero == metal) {

                    metal.mover(yp);
                    contra.mover(yp + 400);
                    majoras.mover(yp + 700);
                    metroid.mover(yp + 950);
                }
                if (puntero ==contra) {

                    metal.mover(yp - 400);
                    contra.mover(yp);
                    majoras.mover(yp + 300);
                    metroid.mover(yp + 550);
                }
                if (puntero == majoras) {
                    metal.mover(yp - 700);
                    contra.mover(yp - 300);
                    majoras.mover(yp);
                    metroid.mover(yp + 250);
                }
                if (puntero == metroid) {
                    metal.mover(yp - 950);
                    contra.mover(yp - 550);
                    majoras.mover(yp - 250);
                    metroid.mover(yp);
                }
                break;


        }
        invalidate();//manda llamar a onDraw
        return true;
    }


}





