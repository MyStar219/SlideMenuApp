package com.example.star.sidemenuexam.Activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import com.example.star.sidemenuexam.R;

/**
 * Created by STAR on 1/10/2017.
 */

public class SignUpActivity extends Activity {
    final Context context = this;
    EditText etNickName, etFirstName, etSurName, etEmailAddress, etPassword, etCompany, etAddressStreet, etAddressStreet2, etAddressSuburb, etAddressState, etAddressPostCode, etCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_signup);
        findViewById(R.id.btnCreate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNickName = (EditText)findViewById(R.id.etNickName);
                etSurName = (EditText)findViewById(R.id.etSurName);
                etFirstName = (EditText)findViewById(R.id.etFirstName);
                etEmailAddress = (EditText)findViewById(R.id.etEmail);
                etPassword = (EditText)findViewById(R.id.etPassword);
                etCompany = (EditText)findViewById(R.id.etCompany);
                etAddressStreet = (EditText)findViewById(R.id.etAddressStreet);
                etAddressStreet2 = (EditText)findViewById(R.id.etAddressStreet2);
                etAddressSuburb = (EditText)findViewById(R.id.etAddressSuburb);
                etAddressState = (EditText)findViewById(R.id.etAddressState);
                etAddressPostCode = (EditText)findViewById(R.id.etAddressPostCode);
                etCountry = (EditText)findViewById(R.id.etCountry);
                if(etFirstName.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("FirstName should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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

                }

                if(etSurName.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("SurName should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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

                }

                if(etEmailAddress.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("EmailAddress should not be empty!")
                            .setCancelable(false)
                        .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            // if this button is clicked, close
                            // current activity
                            startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                            finish();
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

                }
                if(etPassword.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Password should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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

                }

                if(etAddressStreet.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("AddressStreet should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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

                }

                if(etAddressSuburb.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("AddressSuburb should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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
                }

                if(etAddressState.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("AddressState should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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

                }

                if(etAddressPostCode.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("AddressPostcode should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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

                }
                if(etCountry.length() < 1) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set title
                    alertDialogBuilder.setTitle("Error");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Country should not be empty!")
                            .setCancelable(false)
                            .setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                                    finish();
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

                }

            }
        });
        findViewById(R.id.etCountry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, CountryActivity.class));
                finish();
            }
        });
    }
}
