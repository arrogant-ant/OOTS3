package nnk.com.oots3;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Help_and_Support_Activity extends AppCompatActivity {
    Button b1_help, b2_help, b3_help, b4_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_and__support_);
        b1_help = (Button) findViewById(R.id.b1_help_support);
        b1_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dial="tel:8809815360";
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
            }
        });
        b2_help=(Button)findViewById(R.id.b2_help_support);
        b2_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent i=new Intent(Help_and_Support_Activity.this,Call_Request_Activity.class);
                startActivity(i);
            }
        });
        b3_help=(Button)findViewById(R.id.b3_help_support);
        b3_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"romesh.manilall888@gmail.com"});
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Help_and_Support_Activity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();

                }
            }
        });
        b4_help=(Button)findViewById(R.id.b4_help_support);
        b4_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(Help_and_Support_Activity.this,Contact_Us.class);
                startActivity(i);

            }
        });

    }
}
