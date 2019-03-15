package com.prowid.owner.prowid;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Notificationsend extends AppCompatActivity {
    Button sendnotification;
    EditText staffname;
    EditText visitorname;
    String Staffname,Visitorname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificationsend);
        sendnotification = (Button) findViewById(R.id.button16);
        staffname = (EditText) findViewById(R.id.editText13);
        visitorname = (EditText) findViewById(R.id.editText14);

        sendnotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Staffname = staffname.getText().toString();
                Visitorname = visitorname.getText().toString();
                BackGround b = new BackGround();
                b.execute(Staffname, Visitorname);
                Toast.makeText(getApplicationContext(), "Notification Sending....", Toast.LENGTH_SHORT).show();
            }

        });
    }
        class BackGround extends AsyncTask<String, String, String> {

            @Override
            protected String doInBackground(String... params) {
                String staffname = params[0];
                String visitorname = params[1];
                String data = "";
                int tmp;

                try {
                    URL url = new URL("http://192.168.43.131/connecting/notifysend.php");
                    String urlParams = "&staffname=" + staffname + "&visitorname=" + visitorname;

                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setDoOutput(true);
                    OutputStream os = httpURLConnection.getOutputStream();
                    os.write(urlParams.getBytes());
                    os.flush();
                    os.close();
                    InputStream is = httpURLConnection.getInputStream();
                    while ((tmp = is.read()) != -1) {
                        data += (char) tmp;
                    }
                    is.close();
                    httpURLConnection.disconnect();

                    return data;

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return "Exception: " + e.getMessage();
                } catch (IOException e) {
                    e.printStackTrace();
                    return "Exception: " + e.getMessage();
                }
            }

            @Override
            protected void onPostExecute(String s) {
                if(s.equals("")){
                    s="Sent Successfully";
                }
                Toast.makeText(getApplicationContext(), "Sent Sucessfully", Toast.LENGTH_SHORT).show();

                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(Notificationsend.this).create();
                alertDialog.setTitle("Successful");
                //alertDialog.setMessage("Account was successfully created ");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK" , new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        staffname.setText("");
                        visitorname.setText("");


                        dialog.dismiss();
                    }
                });
                //alertDialog.setIcon(R.drawable.person);
                alertDialog.show();


                //startActivity(new Intent(SendNotify.this,adminlog.class));

            }
        }

        }



