package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;


public class Lienzo extends View {
    String mensaje;
    Imagen fondo, logo, nombre, nes, snes, n64, gamecube, barra, puntero, ness; //consolas
    Imagen cubemando; //mandos
    Imagen memoriacubo;//accesorios
    Imagen metal;//juegos
    Imagen boton;
    Imagen descola, desmandos, desaccesorio, desvideojuego; //descripccciones
    Principal puntero2;
    int numero=0;

    public Lienzo(Context context) {
        super(context);

        fondo = new Imagen(R.drawable.fondo, 0, 0, this);
        logo = new Imagen(R.drawable.logo, 50, 20, this);
        nombre = new Imagen(R.drawable.nombre, 500, 50, this);
        barra = new Imagen(R.drawable.barra, 1, 350, this);

        boton = new Imagen(R.drawable.boton, 780, 1200, this);

        gamecube = new Imagen(R.drawable.gamecube, -60, 350, this);
        cubemando = new Imagen(R.drawable.gamecubemando, 300, 350, this);
        memoriacubo = new Imagen(R.drawable.memoriacubo, 800, 350, this);
        metal = new Imagen(R.drawable.metalgearsolid, 1100, 350, this);

        descola = new Imagen(R.drawable.desconsola, -40, 838, this);
        desmandos = new Imagen(R.drawable.desmandos, -40, 838, this);
        desaccesorio = new Imagen(R.drawable.desaccesorio, -40, 838, this);
        desvideojuego = new Imagen(R.drawable.desvideojuego, -40, 838, this);


        puntero = null;

        puntero2 = (Principal) context;
        // snes.hacerVisible(false);
        //   ness.hacerVisible(false);
        descola.hacerVisible(false);
        desmandos.hacerVisible(false);
        desaccesorio.hacerVisible(false);
        desvideojuego.hacerVisible(false);
        boton.hacerVisible(false);


    }


    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();

        //canvas.drawColor(Color.CYAN);
        //canvas.draw
        fondo.pintar(canvas, p);
        logo.pintar(canvas, p);
        nombre.pintar(canvas, p);
        barra.pintar(canvas, p);

        gamecube.pintar(canvas, p);
        cubemando.pintar(canvas, p);
        memoriacubo.pintar(canvas, p);
        metal.pintar(canvas, p);
        boton.pintar(canvas, p);

        //  nes.pintar(canvas, p);
        //snes.pintar(canvas, p);
        //ness.pintar(canvas, p);
        descola.pintar(canvas, p);
        desmandos.pintar(canvas, p);
        desaccesorio.pintar(canvas, p);
        desvideojuego.pintar(canvas, p);

    }


    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:
                //Entra si e.getAction esta presionado
                if (boton.estEnArea(xp, yp)) {

                    //puntero=boton;

                    if (numero==1) {

                        Intent nuevo = new Intent(puntero2, Principal3.class);
                        puntero2.startActivity(nuevo);
                    }
                    if (numero==2) {

                        Intent nuevo2 = new Intent(puntero2, Principal2.class);
                        puntero2.startActivity(nuevo2);
                    }
                    if(numero==3)
                    {
                        Intent nuevo2s = new Intent(puntero2, Principal4.class);
                        puntero2.startActivity(nuevo2s);
                    }
                    if(numero==4)
                    {
                        Intent nuevo2s = new Intent(puntero2, Principal5.class);
                        puntero2.startActivity(nuevo2s);
                    }

                }

                if (gamecube.estEnArea(xp, yp)) {

                    puntero = gamecube;
                    numero=1;
                    descola.hacerVisible(true);
                    desmandos.hacerVisible(false);
                    desaccesorio.hacerVisible(false);
                    desvideojuego.hacerVisible(false);
                    boton.hacerVisible(true);


                }
                if (cubemando.estEnArea(xp, yp)) {

                    puntero = cubemando;
                    numero=2;
                    descola.hacerVisible(false);
                    desmandos.hacerVisible(true);
                    desaccesorio.hacerVisible(false);
                    desvideojuego.hacerVisible(false);
                    boton.hacerVisible(true);

                }
                if (memoriacubo.estEnArea(xp, yp)) {

                    puntero = memoriacubo;
                    numero=3;
                    descola.hacerVisible(false);
                    desmandos.hacerVisible(false);
                    desaccesorio.hacerVisible(true);
                    desvideojuego.hacerVisible(false);
                    boton.hacerVisible(true);
                }
                if (metal.estEnArea(xp, yp)) {

                    puntero = metal;
                    numero=4;
                    descola.hacerVisible(false);
                    desmandos.hacerVisible(false);
                    desaccesorio.hacerVisible(false);
                    desvideojuego.hacerVisible(true);
                    boton.hacerVisible(true);

                }

                break;

            case MotionEvent.ACTION_MOVE: //no es eficiente el if en mover


                if (puntero == gamecube) {
                    gamecube.mover(xp + 20);
                    cubemando.mover(xp + 420);
                    memoriacubo.mover(xp + 850);
                    //  metal.mover(xp + 1200);

                }
                if (puntero == cubemando) {
                    gamecube.mover(xp - 420);
                    cubemando.mover(xp - 20);
                    memoriacubo.mover(xp + 450);
                    metal.mover(xp + 800);
                }
                if (puntero == memoriacubo) {
                    gamecube.mover(xp - 850);
                    cubemando.mover(xp - 450);
                    memoriacubo.mover(xp + 20);
                    metal.mover(xp + 400);
                }
                if (puntero == metal) {
                    gamecube.mover(xp - 1200);
                    cubemando.mover(xp - 800);
                    memoriacubo.mover(xp - 350);
                    metal.mover(xp + 10);
                }
                break;

            case MotionEvent.ACTION_UP:
                puntero=null;
                break;


        }
        invalidate();//manda llamar a onDraw
        return true;
    }


}