package mx.edu.ittepic.dadm_u3_proyectotienda;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo3  extends View {
    String mensaje;
    Imagen3  fondo, barra2, puntero;
    Imagen3 gamecube,n64,snes,nes,game,logo;
    Imagen3 descripcionmandocubo,descripcionmandocubo2,
            descripcionn64,descripcionn642, descripcionsnes,descripcionsnes2,
            descripcionnes,descripcionnes2,sticksnes,sticksnes2,retorno;
    Principal3 puntero4;


    public Lienzo3(Context context) {
        super(context);



        fondo = new Imagen3(R.drawable.fondo, 0, 0, this);
        logo = new Imagen3(R.drawable.logoconsolas,-10,-10,this);
        barra2 = new Imagen3(R.drawable.barra3, -10, 1, this);

        gamecube = new Imagen3(R.drawable.cubo, -50, 10, this);
        n64 = new Imagen3(R.drawable.consola64, -150, 300, this);
        snes= new Imagen3(R.drawable.consolasnes, -20, 600, this);
        nes = new Imagen3(R.drawable.ness, -20, 900, this);
        game = new Imagen3(R.drawable.gameandwact, -20, 1200, this);

        descripcionmandocubo = new Imagen3(R.drawable.mejoracubo, 400, 10, this);
        descripcionmandocubo2 = new Imagen3(R.drawable.mejoracubo2, 400, 600, this);

        descripcionn64 = new Imagen3(R.drawable.mejora64, 400, 10, this);
        descripcionn642 = new Imagen3(R.drawable.mejora642, 400, 600, this);

        descripcionsnes = new Imagen3(R.drawable.mejorasnes, 400, 10, this);
        descripcionsnes2 = new Imagen3(R.drawable.mejorasnes2, 400, 600, this);


        descripcionnes=new Imagen3(R.drawable.nesdescripcion3,400,10,this);
        descripcionnes2=new Imagen3(R.drawable.nesdescripcion4,400,600,this);

        sticksnes=new Imagen3(R.drawable.mejoragame,400,10,this);
        sticksnes2=new Imagen3(R.drawable.mejoragame2,400,600,this);

       // retorno=new Imagen3(R.drawable.retorno2,800,1235,this);

        descripcionmandocubo.hacerVisible(false);
        descripcionmandocubo2.hacerVisible(false);
        descripcionn64.hacerVisible(false);
        descripcionn642.hacerVisible(false);
        descripcionsnes.hacerVisible(false);
        descripcionsnes2.hacerVisible(false);
        descripcionnes.hacerVisible(false);
        descripcionnes2.hacerVisible(false);
        sticksnes.hacerVisible(false);
        sticksnes2.hacerVisible(false);
        puntero = null;
        puntero4=(Principal3)  context;


    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        fondo.pintar(canvas, p);
        barra2.pintar(canvas, p);
        gamecube.pintar(canvas, p);
        n64.pintar(canvas, p);
        snes.pintar(canvas, p);
        nes.pintar(canvas, p);
        game.pintar(canvas, p);
        descripcionmandocubo.pintar(canvas, p);
        descripcionn64.pintar(canvas, p);
        descripcionsnes.pintar(canvas, p);
        descripcionnes.pintar(canvas,p);
        sticksnes.pintar(canvas,p);
        descripcionmandocubo2.pintar(canvas, p);
        descripcionn642.pintar(canvas, p);
        descripcionsnes2.pintar(canvas, p);
        descripcionnes2.pintar(canvas,p);
        sticksnes2.pintar(canvas,p);
       // retorno.pintar(canvas,p);
        logo.pintar(canvas,p);




    }

    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:
                //Entra si e.getAction esta presionado
             //   if(retorno.estEnArea(xp,yp))
               // {

                 //   Intent nuev = new Intent(puntero4, Principal.class);
                   // puntero4.startActivity(nuev);

                //}

                if (gamecube.estEnArea(xp, yp)) {

                    puntero = gamecube;
                    descripcionmandocubo.hacerVisible(true);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(false);
                    descripcionmandocubo2.hacerVisible(true);
                    descripcionn642.hacerVisible(false);
                    descripcionsnes2.hacerVisible(false);
                    descripcionnes2.hacerVisible(false);
                    sticksnes2.hacerVisible(false);
                }

                if (n64.estEnArea(xp, yp)) {

                    puntero = n64;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(true);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(false);
                    descripcionmandocubo2.hacerVisible(false);
                    descripcionn642.hacerVisible(true);
                    descripcionsnes2.hacerVisible(false);
                    descripcionnes2.hacerVisible(false);
                    sticksnes2.hacerVisible(false);

                }
                if (snes.estEnArea(xp, yp)) {

                    puntero = snes;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(true);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(false);
                    descripcionmandocubo2.hacerVisible(false);
                    descripcionn642.hacerVisible(false);
                    descripcionsnes2.hacerVisible(true);
                    descripcionnes2.hacerVisible(false);
                    sticksnes2.hacerVisible(false);

                }
                if (nes.estEnArea(xp, yp)) {

                    puntero = nes;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(true);
                    sticksnes.hacerVisible(false);
                    descripcionmandocubo2.hacerVisible(false);
                    descripcionn642.hacerVisible(false);
                    descripcionsnes2.hacerVisible(false);
                    descripcionnes2.hacerVisible(true);
                    sticksnes2.hacerVisible(false);

                }
                if (game.estEnArea(xp, yp)) {

                    puntero = game;
                    descripcionmandocubo.hacerVisible(false);
                    descripcionn64.hacerVisible(false);
                    descripcionsnes.hacerVisible(false);
                    descripcionnes.hacerVisible(false);
                    sticksnes.hacerVisible(true);
                    descripcionmandocubo2.hacerVisible(false);
                    descripcionn642.hacerVisible(false);
                    descripcionsnes2.hacerVisible(false);
                    descripcionnes2.hacerVisible(false);
                    sticksnes2.hacerVisible(true);

                }

                break;

            case MotionEvent.ACTION_MOVE: //no es eficiente el if en mover

                if (puntero ==gamecube) {
                    gamecube.mover(yp  );
                    n64.mover(yp + 300);
                    snes.mover(yp + 600);
                    nes.mover(yp + 900);
                    game.mover(yp + 1200);
                }
                if (puntero == n64) {
                    gamecube.mover(yp - 300);
                    n64.mover(yp);
                    snes.mover(yp + 300);
                    nes.mover(yp + 600);
                    game.mover(yp + 900);
                }
                if (puntero == snes) {
                    gamecube.mover(yp - 600);
                    n64.mover(yp - 300);
                    snes.mover(yp);
                    nes.mover(yp + 300);
                    game.mover(yp + 600);
                }
                if (puntero == nes) {
                    gamecube.mover(yp - 900);
                    n64.mover(yp - 600);
                    snes.mover(yp - 300);
                    nes.mover(yp);
                    game.mover(yp + 300);
                }
                if (puntero == game) {
                    gamecube.mover(yp - 1200);
                    n64.mover(yp - 900);
                    snes.mover(yp - 600);
                    nes.mover(yp - 300);
                    game.mover(yp);
                }
                break;



        }
        invalidate();//manda llamar a onDraw
        return true;
    }


}


