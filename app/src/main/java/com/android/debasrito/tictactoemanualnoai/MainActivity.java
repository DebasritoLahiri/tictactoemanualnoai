package com.android.debasrito.tictactoemanualnoai;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button[] slots=new Button[9];
int[] slotsvalue=new int[9];
int turn=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slots[0]=findViewById(R.id.slot1);
        slots[1]=findViewById(R.id.slot2);
        slots[2]=findViewById(R.id.slot3);
        slots[3]=findViewById(R.id.slot4);
        slots[4]=findViewById(R.id.slot5);
        slots[5]=findViewById(R.id.slot6);
        slots[6]=findViewById(R.id.slot7);
        slots[7]=findViewById(R.id.slot8);
        slots[8]=findViewById(R.id.slot9);
        for(int i=0;i<9;i++)
            slotsvalue[i]=-1;
        slots[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[0].setEnabled(false);
                slotsvalue[0]=turn;
                //slots[0].setText(turn);
                if(turn==0)
                 slots[0].setBackgroundColor(Color.CYAN);
                else
                    slots[0].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[1].setEnabled(false);
                slotsvalue[1]=turn;
                //slots[1].setText(turn);
                if(turn==0)
                 slots[1].setBackgroundColor(Color.CYAN);
                else
                    slots[1].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[2].setEnabled(false);
                slotsvalue[2]=turn;
                //slots[2].setText(turn);
                if(turn==0)
                 slots[2].setBackgroundColor(Color.CYAN);
                else
                    slots[2].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[3].setEnabled(false);
                slotsvalue[3]=turn;
                //slots[3].setText(turn);
                if(turn==0)
                 slots[3].setBackgroundColor(Color.CYAN);
                else
                    slots[3].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[4].setEnabled(false);
                slotsvalue[4]=turn;
                //slots[4].setText(turn);
                if(turn==0)
                 slots[4].setBackgroundColor(Color.CYAN);
                else
                    slots[4].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[5].setEnabled(false);
                slotsvalue[5]=turn;
                //slots[5].setText(turn);
                if(turn==0)
                 slots[5].setBackgroundColor(Color.CYAN);
                else
                    slots[5].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[6].setEnabled(false);
                slotsvalue[6]=turn;
                //slots[6].setText(turn);
                if(turn==0)
                 slots[6].setBackgroundColor(Color.CYAN);
                else
                    slots[6].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[7].setEnabled(false);
                slotsvalue[7]=turn;
                //slots[7].setText(turn);
                if(turn==0)
                 slots[7].setBackgroundColor(Color.CYAN);
                else
                    slots[7].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        slots[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slots[8].setEnabled(false);
                slotsvalue[8]=turn;
                //slots[8].setText(turn);
                if(turn==0)
                 slots[8].setBackgroundColor(Color.CYAN);
                else
                    slots[8].setBackgroundColor(Color.RED);
                turn=1-turn;
                if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
                {
                    Toast.makeText(MainActivity.this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
                    recreate();
                }
            }
        });
        /*if((slotsvalue[0]==slotsvalue[1]&&slotsvalue[1]==slotsvalue[2]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[3]&&slotsvalue[3]==slotsvalue[6]&&slotsvalue[0]!=-1)||(slotsvalue[0]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[8]&&slotsvalue[0]!=-1)||(slotsvalue[1]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[7]&&slotsvalue[1]!=-1)||(slotsvalue[2]==slotsvalue[5]&&slotsvalue[5]==slotsvalue[8]&&slotsvalue[2]!=-1)||(slotsvalue[2]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[6]&&slotsvalue[2]!=-1)||(slotsvalue[3]==slotsvalue[4]&&slotsvalue[4]==slotsvalue[5]&&slotsvalue[3]!=-1)||(slotsvalue[6]==slotsvalue[7]&&slotsvalue[7]==slotsvalue[8]&&slotsvalue[6]!=-1))
        {
            Toast.makeText(this,"Player "+(1-turn)+" wins",Toast.LENGTH_LONG).show();
            recreate();
        }*/
    }
}
