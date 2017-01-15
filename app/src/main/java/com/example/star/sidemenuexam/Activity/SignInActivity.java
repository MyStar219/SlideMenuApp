package com.example.star.sidemenuexam.Activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import com.example.star.sidemenuexam.R;
import com.example.star.sidemenuexam.Utils.Constant;

import static android.R.attr.handle;

/**
 * Created by STAR on 1/9/2017.
 */

public class SignInActivity extends Activity {
    final Context context = this;
    EditText eT_email, eT_passwrord;
    ProgressDialog progressDoalog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_signin);

        findViewById(R.id.button_signin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT_email=(EditText)findViewById(R.id.editText_email);
                eT_passwrord=(EditText)findViewById(R.id.editText_password);
                if(eT_email.length()<1) {
//                    Toast.makeText(getApplicationContext(), "Email address should not be empty",
//                            Toast.LENGTH_LONG).show();
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Email address should not be empty. Please insert your email again!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    SignInActivity.this.finish();
                                }
                            })
                            .setNegativeButton("Ok",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    dialog.cancel();
                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();
                }else if(!eT_email.getText().toString().equals(Constant.Join_Email)) {
//                    Toast.makeText(getApplicationContext(), "Email address is not valid",
//                            Toast.LENGTH_LONG).show();
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Email address is not valid. Please insert your email again!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    SignInActivity.this.finish();
                                }
                            })
                            .setNegativeButton("Ok",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    dialog.cancel();
                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();
                } else {
                    if(!eT_passwrord.getText().toString().equals(Constant.Join_Password)) {
//                        Toast.makeText(getApplicationContext(), "Password is not valid",
//                                Toast.LENGTH_LONG).show();
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                                context);

                        // set title
                        alertDialogBuilder.setTitle("Error");

                        // set dialog message
                        alertDialogBuilder
                                .setMessage("Password is not valid. Please insert your password again!")
                                .setCancelable(false)
                                .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, close
                                        // current activity
                                        SignInActivity.this.finish();
                                    }
                                })
                                .setNegativeButton("Ok",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, just close
                                        // the dialog box and do nothing
                                        dialog.cancel();
                                    }
                                });

                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();
                        } else {
                        progressDialog();
                        Thread m_Thread1 = new Thread(new SignInActivity.Timer1());
                        m_Thread1.start();

                        }
                    }

                }

        });
        findViewById(R.id.button_signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog();
                Thread m_Thread2 = new Thread(new SignInActivity.Timer2());
                m_Thread2.start();
            }
        });
    }
    void progressDialog(){
        progressDoalog = new ProgressDialog(SignInActivity.this);
        progressDoalog.setMax(1000);
        progressDoalog.setMessage("Authenticating...");
//                        progressDoalog.setTitle("ProgressDialog bar example");
        progressDoalog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDoalog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (progressDoalog.getProgress() <= progressDoalog
                            .getMax()) {
                        Thread.sleep(3000);
                        if (progressDoalog.getProgress() == progressDoalog
                                .getMax()) {
                            progressDoalog.dismiss();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private class Timer1 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startActivity(new Intent(SignInActivity.this, MainActivity.class));
            overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
            finish();
        }
    }
    private class Timer2 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
            overridePendingTransition(R.anim.abc_slide_in_left, R.anim.abc_slide_in_right);
            finish();
        }
    }
}
