package com.android.debasrito.tictactoemanualnoai;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button[] slots=new Button[9];
    Button reset, scores, name;
    String[] nameset = new String[2];
    int[] scoreset = new int[2];
int[] slotsvalue=new int[9];
    String p0sp = "com.android.debasrito.tictactoemanualnoai.player0";
    String p1sp = "com.android.debasrito.tictactoemanualnoai.player1";
int turn=0;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the game
        initialize();

        //Setting control buttons
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameset();
            }
        });

        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showscores();
            }
        });

        //Setting the grid buttons
        slots[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(0);
            }
        });

        slots[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(1);
            }
        });

        slots[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(2);
            }
        });

        slots[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(3);
            }
        });

        slots[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(4);
            }
        });

        slots[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(5);
            }
        });

        slots[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(6);
            }
        });

        slots[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(7);
            }
        });

        slots[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(8);
            }
        });
    }


    public void nameconfig() {
        SharedPreferences p0 = getSharedPreferences(p0sp, Context.MODE_PRIVATE);
        p0.edit().putString("Name", nameset[0]).apply();
        SharedPreferences p1 = getSharedPreferences(p1sp, Context.MODE_PRIVATE);
        p1.edit().putString("Name", nameset[1]).apply();
    }


    public void scoreconfig() {
        SharedPreferences p0 = getSharedPreferences(p0sp, Context.MODE_PRIVATE);
        p0.edit().putInt("Score", scoreset[0]).apply();
        SharedPreferences p1 = getSharedPreferences(p1sp, Context.MODE_PRIVATE);
        p1.edit().putInt("Score", scoreset[1]).apply();
    }


    public void nameset() {
        LayoutInflater li = LayoutInflater.from(MainActivity.this);
        @SuppressLint("InflateParams") View promptsView = li.inflate(R.layout.inputname, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setView(promptsView);
        final EditText Input1 = promptsView.findViewById(R.id.player1);
        final EditText Input2 = promptsView.findViewById(R.id.player2);
        Input1.setHint("John");
        Input2.setHint("Doe");
        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if (TextUtils.isEmpty(Input1.getText()) || TextUtils.isEmpty(Input2.getText())) {
                            Toast.makeText(MainActivity.this, "Names cannot be empty.", Toast.LENGTH_LONG).show();
                            nameset();
                        } else {
                            nameset[0] = String.valueOf(Input1.getText());
                            nameset[1] = String.valueOf(Input2.getText());
                            nameconfig();
                        }
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


    public void recreater() {
        scoreset[0] = 0;
        scoreset[1] = 0;
        scoreconfig();
        recreate();
    }


    public void win() {
        Toast.makeText(MainActivity.this, nameset[1 - turn] + " wins", Toast.LENGTH_LONG).show();
        scoreset[1 - turn] = scoreset[1 - turn] + 1;
        scoreconfig();
        recreate();
    }


    public void draw() {
        Toast.makeText(MainActivity.this, "It is a draw.", Toast.LENGTH_LONG).show();
        recreate();
    }


    public void buttonpressed(int bt) {
        slots[bt].setEnabled(false);
        counter++;
        slotsvalue[bt] = turn;
        if (turn == 0)
            slots[bt].setBackgroundColor(Color.CYAN);
        else
            slots[bt].setBackgroundColor(Color.RED);
        turn = 1 - turn;
        if ((slotsvalue[0] == slotsvalue[1] && slotsvalue[1] == slotsvalue[2] && slotsvalue[0] != -1) || (slotsvalue[0] == slotsvalue[3] && slotsvalue[3] == slotsvalue[6] && slotsvalue[0] != -1) || (slotsvalue[0] == slotsvalue[4] && slotsvalue[4] == slotsvalue[8] && slotsvalue[0] != -1) || (slotsvalue[1] == slotsvalue[4] && slotsvalue[4] == slotsvalue[7] && slotsvalue[1] != -1) || (slotsvalue[2] == slotsvalue[5] && slotsvalue[5] == slotsvalue[8] && slotsvalue[2] != -1) || (slotsvalue[2] == slotsvalue[4] && slotsvalue[4] == slotsvalue[6] && slotsvalue[2] != -1) || (slotsvalue[3] == slotsvalue[4] && slotsvalue[4] == slotsvalue[5] && slotsvalue[3] != -1) || (slotsvalue[6] == slotsvalue[7] && slotsvalue[7] == slotsvalue[8] && slotsvalue[6] != -1)) {
            win();
        } else
            checkdraw();
    }


    public void initialize() {
        slots[0] = findViewById(R.id.slot1);
        slots[1] = findViewById(R.id.slot2);
        slots[2] = findViewById(R.id.slot3);
        slots[3] = findViewById(R.id.slot4);
        slots[4] = findViewById(R.id.slot5);
        slots[5] = findViewById(R.id.slot6);
        slots[6] = findViewById(R.id.slot7);
        slots[7] = findViewById(R.id.slot8);
        slots[8] = findViewById(R.id.slot9);
        reset = findViewById(R.id.reset);
        scores = findViewById(R.id.scores);
        name = findViewById(R.id.nameedit);
        SharedPreferences p0 = getSharedPreferences(p0sp, Context.MODE_PRIVATE);
        nameset[0] = p0.getString("Name", "Player 1");
        scoreset[0] = p0.getInt("Score", 0);
        SharedPreferences p1 = getSharedPreferences(p1sp, Context.MODE_PRIVATE);
        nameset[1] = p1.getString("Name", "Player 2");
        scoreset[1] = p1.getInt("Score", 0);
        for (int i = 0; i < 9; i++)
            slotsvalue[i] = -1;
    }


    public void checkdraw() {
        if (counter == 9)
            draw();
    }


    public void showscores() {
        LayoutInflater li = LayoutInflater.from(MainActivity.this);
        @SuppressLint("InflateParams") View scoresView = li.inflate(R.layout.scoreboard, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setView(scoresView);
        final TextView scoren1 = scoresView.findViewById(R.id.p1n);
        final TextView scores1 = scoresView.findViewById(R.id.p1score);
        final TextView scoren2 = scoresView.findViewById(R.id.p2n);
        final TextView scores2 = scoresView.findViewById(R.id.p2score);
        scoren1.setText(nameset[0]);
        scores1.setText(String.valueOf(scoreset[0]));
        scoren2.setText(nameset[1]);
        scores2.setText(String.valueOf(scoreset[1]));
        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                .setNeutralButton("Reset Scores", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        recreater();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
