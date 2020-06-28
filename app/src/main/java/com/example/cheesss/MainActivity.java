package com.example.cheesss;







import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements View.OnTouchListener, View.OnDragListener {
String mohre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    private void init() {


        findViewById(R.id.king).setOnTouchListener(this);
        findViewById(R.id.qeen).setOnTouchListener(this);
        findViewById(R.id.bishop_w1).setOnTouchListener(this);
        findViewById(R.id.knite_w1).setOnTouchListener(this);
        findViewById(R.id.rook_w1).setOnTouchListener(this);
        findViewById(R.id.bishop_w2).setOnTouchListener(this);
        findViewById(R.id.knite_w2).setOnTouchListener(this);
        findViewById(R.id.rook_w2).setOnTouchListener(this);



        findViewById(R.id.lay1).setOnDragListener(this);
        findViewById(R.id.lay2).setOnDragListener(this);
        findViewById(R.id.lay3).setOnDragListener(this);
        findViewById(R.id.lay4).setOnDragListener(this);
        findViewById(R.id.lay5).setOnDragListener(this);
        findViewById(R.id.lay6).setOnDragListener(this);
        findViewById(R.id.lay7).setOnDragListener(this);
        findViewById(R.id.lay8).setOnDragListener(this);
        findViewById(R.id.lay9).setOnDragListener(this);
        findViewById(R.id.lay10).setOnDragListener(this);
        findViewById(R.id.lay11).setOnDragListener(this);
        findViewById(R.id.lay12).setOnDragListener(this);
        findViewById(R.id.lay13).setOnDragListener(this);
        findViewById(R.id.lay14).setOnDragListener(this);
        findViewById(R.id.lay15).setOnDragListener(this);
        findViewById(R.id.lay16).setOnDragListener(this);
        findViewById(R.id.lay17).setOnDragListener(this);
        findViewById(R.id.lay18).setOnDragListener(this);
        findViewById(R.id.lay19).setOnDragListener(this);
        findViewById(R.id.lay20).setOnDragListener(this);
        findViewById(R.id.lay21).setOnDragListener(this);
        findViewById(R.id.lay22).setOnDragListener(this);
        findViewById(R.id.lay23).setOnDragListener(this);
        findViewById(R.id.lay24).setOnDragListener(this);
        findViewById(R.id.lay25).setOnDragListener(this);
        findViewById(R.id.lay26).setOnDragListener(this);
        findViewById(R.id.lay27).setOnDragListener(this);
        findViewById(R.id.lay28).setOnDragListener(this);
        findViewById(R.id.lay29).setOnDragListener(this);
        findViewById(R.id.lay30).setOnDragListener(this);
        findViewById(R.id.lay31).setOnDragListener(this);
        findViewById(R.id.lay32).setOnDragListener(this);
        findViewById(R.id.lay33).setOnDragListener(this);
        findViewById(R.id.lay34).setOnDragListener(this);
        findViewById(R.id.lay35).setOnDragListener(this);
        findViewById(R.id.lay36).setOnDragListener(this);
        findViewById(R.id.lay37).setOnDragListener(this);
        findViewById(R.id.lay38).setOnDragListener(this);
        findViewById(R.id.lay39).setOnDragListener(this);
        findViewById(R.id.lay40).setOnDragListener(this);
        findViewById(R.id.lay41).setOnDragListener(this);
        findViewById(R.id.lay42).setOnDragListener(this);
        findViewById(R.id.lay43).setOnDragListener(this);
        findViewById(R.id.lay44).setOnDragListener(this);
        findViewById(R.id.lay45).setOnDragListener(this);
        findViewById(R.id.lay46).setOnDragListener(this);
        findViewById(R.id.lay47).setOnDragListener(this);
        findViewById(R.id.lay48).setOnDragListener(this);
        findViewById(R.id.lay49).setOnDragListener(this);
        findViewById(R.id.lay50).setOnDragListener(this);
        findViewById(R.id.lay51).setOnDragListener(this);
        findViewById(R.id.lay52).setOnDragListener(this);
        findViewById(R.id.lay53).setOnDragListener(this);
        findViewById(R.id.lay54).setOnDragListener(this);
        findViewById(R.id.lay55).setOnDragListener(this);
        findViewById(R.id.lay56).setOnDragListener(this);
        findViewById(R.id.lay57).setOnDragListener(this);
        findViewById(R.id.lay58).setOnDragListener(this);
        findViewById(R.id.lay59).setOnDragListener(this);
        findViewById(R.id.lay60).setOnDragListener(this);
        findViewById(R.id.lay61).setOnDragListener(this);
        findViewById(R.id.lay62).setOnDragListener(this);
        findViewById(R.id.lay63).setOnDragListener(this);
        findViewById(R.id.lay64).setOnDragListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            mohre=v.getTag().toString();
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);

            v.startDrag(null, shadowBuilder, v, 0);

            v.setVisibility(View.INVISIBLE);

            return true;

        }

        if (event.getAction() == MotionEvent.ACTION_UP) {

        mohre="";
            return true;

        }

        else {

            return false;

        }
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {

        boolean valid;

        if (event.getAction() == DragEvent.ACTION_DROP) {

            View view = (View) event.getLocalState();
            ViewGroup from = (ViewGroup) view.getParent();
            LinearLayout to = (LinearLayout) v;

switch (mohre){
    case  "king"   :{valid=validKing  (from, to); break;}
    case  "qeen"   :{valid=validQeen  (from, to); break;}
    case  "bishop" :{valid=validBishop(from, to); break;}
    case  "knite"  :{valid=validKnite (from, to); break;}
    case  "rook"   :{valid=validRook  (from, to); break;}
    default        :{valid=false;                 break;}

            }

            if (valid) {
                from.removeView(view);
                to.addView(view);
                view.setVisibility(View.VISIBLE);

            } else {

                view.setVisibility(View.VISIBLE);
            }
        }


        return true;
    }






    private boolean validBishop(ViewGroup from, LinearLayout to) {
        String fromTag=from.getTag().toString();
        String toTag=to.getTag().toString();

            char fRo    = fromTag.charAt(0);
            char fColum = fromTag.charAt(2);
            char tRo    = toTag.charAt(0);
            char tColum = toTag.charAt(2);

        int fRow    = Integer.valueOf(fRo) ;
        int tRow    = Integer.valueOf (tRo) ;
        int fColumn = Integer.valueOf(fColum) ;
        int tColumn = Integer.valueOf ( tColum) ;

int a=fRow-tRow;
int b=fColumn-tColumn;


        if (Math.abs(a)==Math.abs(b)) {
            return true;
        } else {
            return false;
        }
    }


    private boolean validKnite(ViewGroup from, LinearLayout to) {
        String fromTag=from.getTag().toString();
        String toTag=to.getTag().toString();

        char fRo    = fromTag.charAt(0);
        char fColum = fromTag.charAt(2);

        char tRo    = toTag.charAt(0);
        char tColum = toTag.charAt(2);

        int fRow    = Integer.valueOf(fRo) ;
        int tRow    = Integer.valueOf (tRo) ;
        int fColumn = Integer.valueOf(fColum) ;
        int tColumn = Integer.valueOf ( tColum) ;

        int a=fRow-tRow;
        int b=fColumn-tColumn;


        if (Math.abs(a)==1 && Math.abs(b)==2) {
            return true;
        }
        else if (Math.abs(a)==2&&Math.abs(b)==1){
            return true;
        }
        else {
            return false;
        }
    }


    private boolean validRook (ViewGroup from, LinearLayout to) {
        String fromTag=from.getTag().toString();
        String toTag=to.getTag().toString();

        char fRo    = fromTag.charAt(0);
        char fColum = fromTag.charAt(2);

        char tRo    = toTag.charAt(0);
        char tColum = toTag.charAt(2);

        int fRow    = Integer.valueOf(fRo) ;
        int tRow    = Integer.valueOf (tRo) ;
        int fColumn = Integer.valueOf(fColum) ;
        int tColumn = Integer.valueOf ( tColum) ;

        int a=fRow-tRow;
        int b=fColumn-tColumn;


        if (a==0 || b==0) {
            return true;
        }

        else {
            return false;
        }
    }


    private boolean validQeen (ViewGroup from, LinearLayout to) {
        String fromTag=from.getTag().toString();
        String toTag=to.getTag().toString();

        char fRo    = fromTag.charAt(0);
        char fColum = fromTag.charAt(2);

        char tRo    = toTag.charAt(0);
        char tColum = toTag.charAt(2);

        int fRow    = Integer.valueOf(fRo) ;
        int tRow    = Integer.valueOf (tRo) ;
        int fColumn = Integer.valueOf(fColum) ;
        int tColumn = Integer.valueOf ( tColum) ;

        int a=fRow-tRow;
        int b=fColumn-tColumn;


        if (a==0 || b==0) {
            return true;
        }
       else if (Math.abs(a)==Math.abs(b)) {
            return true;
        }
        else {
            return false;
        }
    }


    private boolean validKing (ViewGroup from, LinearLayout to) {
        String fromTag=from.getTag().toString();
        String toTag=to.getTag().toString();

        char fRo    = fromTag.charAt(0);
        char fColum = fromTag.charAt(2);

        char tRo    = toTag.charAt(0);
        char tColum = toTag.charAt(2);

        int fRow    = Integer.valueOf(fRo) ;
        int tRow    = Integer.valueOf (tRo) ;
        int fColumn = Integer.valueOf(fColum) ;
        int tColumn = Integer.valueOf ( tColum) ;

        int a=fRow-tRow;
        int b=fColumn-tColumn;


        if (a==0 && Math.abs(b)==1) {
            return true;
        }
        else if (Math.abs(a)==1&&Math.abs(b)==1) {
            return true;
        }
        else if (b==0 && Math.abs(a)==1) {
            return true;
        }
        else {
            return false;
        }
    }

}

