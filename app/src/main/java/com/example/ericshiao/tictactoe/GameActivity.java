package com.example.ericshiao.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GameActivity extends ActionBarActivity {
    boolean xTurn = true;
    boolean s1, s2, s3, s4, s5, s6, s7, s8, s9;
    int column1, column2, column3, row1, row2, row3, diag1, diag2, turnCount = 0;
    String winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.same_device_activity);
        final TextView announcer = (TextView) findViewById(R.id.announcer);
        final String xString = getString(R.string.xTurn);
        final String oString = getString(R.string.oTurn);
        final String xWins = getString(R.string.xWinner);
        final String oWins = getString(R.string.oWinner);

        final Button square1 = (Button) findViewById(R.id.square1); //top left square
        final Button square2 = (Button) findViewById(R.id.square2);
        final Button square3 = (Button) findViewById(R.id.square3);
        final Button square4 = (Button) findViewById(R.id.square4);
        final Button square5 = (Button) findViewById(R.id.square5);
        final Button square6 = (Button) findViewById(R.id.square6);
        final Button square7 = (Button) findViewById(R.id.square7);
        final Button square8 = (Button) findViewById(R.id.square8);
        final Button square9 = (Button) findViewById(R.id.square9);

        setTitle("Tic tac toe");

        square1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s1) {
                    turnCount++;
                    if (xTurn) {
                        square1.setText("X");
                        xTurn = false;
                        row1++;
                        column1++;
                        diag1++;
                        announcer.setText(oString);
                        s1 = true;
                        if ((row1 == 3) || (column1 == 3) || (diag1 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    } else {
                        square1.setText("O");
                        xTurn = true;
                        row1--; //row1
                        column1--; //column1
                        diag1--; //diag1
                        announcer.setText(xString);
                        s1 = true;
                        if ((row1 == -3) || (column1 == -3) || (diag1 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    }
                }
            }
        });

        square2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s2) {
                    turnCount++;
                    if (xTurn) {
                        square2.setText("X");
                        xTurn = false;
                        row1++; //row1
                        column2++; //column2
                        announcer.setText(oString);
                        s2 = true;
                        if ((row1 == 3) || (column2 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    } else {
                        square2.setText("O");
                        xTurn = true;
                        row1--; //row1
                        column2--; //column2
                        announcer.setText(xString);
                        s2 = true;
                        if ((row1 == -3) || (column2 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    }
                }
            }
        });

        square3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s3) {
                    turnCount++;
                    if (xTurn) {
                        square3.setText("X");
                        xTurn = false;
                        row1++; //row1
                        column3++; //column3
                        diag2++; //diag2
                        announcer.setText(oString);
                        s3 = true;
                        if ((row1 == 3) || (column3 == 3) || (diag2 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    } else {
                        square3.setText("O");
                        xTurn = true;
                        row1--; //row1
                        column3--; //column3
                        diag2--; //diag2
                        announcer.setText(xString);
                        s3 = true;
                        if ((row1 == -3) || (column3 == -3) || (diag2 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    }
                }
            }
        });

        square4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s4) {
                    turnCount++;
                    if (xTurn) {
                        square4.setText("X");
                        xTurn = false;
                        row2++; //row2
                        column1++; //column1
                        announcer.setText(oString);
                        s4 = true;
                        if ((row2 == 3) || (column1 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    } else {
                        square4.setText("O");
                        xTurn = true;
                        row2--; //row2
                        column1--; //column1
                        announcer.setText(xString);
                        s4 = true;
                        if ((row2 == -3) || (column1 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    }
                }
            }
        });

        square5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s5) {
                    turnCount++;
                    if (xTurn) {
                        square5.setText("X");
                        xTurn = false;
                        row2++; //row2
                        column2++; //column2
                        diag1++; //diag1
                        diag2++; //diag2
                        announcer.setText(oString);
                        s5 = true;
                        if ((row2 == 3) || (column2 == 3) || (diag1 == 3) || (diag2 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    } else {
                        square5.setText("O");
                        xTurn = true;
                        row2--; //row2
                        column2--; //column2
                        diag1--; //diag1
                        diag2--; //diag2
                        announcer.setText(xString);
                        s5 = true;
                        if ((row2 == -3) || (column2 == -3) || (diag1 == -3) || (diag2 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    }
                }
            }
        });

        square6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s6) {
                    turnCount++;
                    if (xTurn) {
                        square6.setText("X");
                        xTurn = false;
                        row2++; //row2
                        column3++;
                        announcer.setText(oString);
                        s6 = true;
                        if ((row2 == 3) || (column3 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    } else {
                        square6.setText("O");
                        xTurn = true;
                        row2--; //row2
                        column3--;
                        announcer.setText(xString);
                        s6 = true;
                        if ((row2 == -3) || (column3 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                    }
                }
            }
        });

        square7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s7) {
                    turnCount++;
                    if (xTurn) {
                        square7.setText("X");
                        xTurn = false;
                        row3++; //row3
                        column1++; //column1
                        diag2++; //diag2;
                        announcer.setText(oString);
                        if ((row3 == 3) || (column1 == 3) || (diag2 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                        s7 = true;
                    } else {
                        square7.setText("O");
                        xTurn = true;
                        row3--; //row3
                        column1--; //column1
                        diag2--; //diag2;
                        announcer.setText(xString);
                        if ((row3 == -3) || (column1 == -3) || (diag2 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                        s7 = true;
                    }
                }
            }
        });

        square8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s8) {
                    turnCount++;
                    if (xTurn) {
                        square8.setText("X");
                        xTurn = false;
                        announcer.setText(oString);
                        row3++; //row3
                        column2++;
                        if ((row3 == 3) || (column2 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                        s8 = true;
                    } else {
                        square8.setText("O");
                        xTurn = true;
                        row3--; //row3
                        column2--;
                        announcer.setText(xString);
                        if ((row3 == -3) || (column2 == -3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                        s8 = true;
                    }
                }
            }
        });

        square9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s9) {
                    turnCount++;
                    if (xTurn) {
                        square9.setText("X");
                        xTurn = false;
                        announcer.setText(oString);
                        row3++; //row3
                        column3++;
                        diag1++;
                        if ((row3 == 3) || (column3 == 3) || (diag1 == 3)) {
                            announcer.setText(xWins);
                            winner = xWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                        s9 = true;
                    } else {
                        square9.setText("O");
                        xTurn = true;
                        row3--;
                        column3--;
                        diag1--;
                        announcer.setText(xString);
                        if ((row3 == -3) || (column3 == -3) || (diag1 == -3)) {
                            announcer.setText(oWins);
                            winner = oWins;
                            playAgain();
                        } else if (turnCount == 9) {
                            announcer.setText("Draw");
                            playAgain();
                        }
                        s9 = true;
                    }
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void playAgain() {
        AlertDialog.Builder playConfirm = new AlertDialog.Builder(this);
        if (turnCount == 9) {
            playConfirm.setTitle("Draw");
        } else {
            playConfirm.setTitle(winner);
        }
        playConfirm
                .setMessage("Play Again?")
                .setCancelable(true)
                .setNegativeButton("Play Again!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                recreate();
            }
        })
                .setPositiveButton("Back to Main Menu", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(GameActivity.this, MainActivity.class);
                        GameActivity.this.startActivity(intent);
                    }
                });
        AlertDialog playAgainDialog = playConfirm.create();
        playAgainDialog.show();
    }
}

