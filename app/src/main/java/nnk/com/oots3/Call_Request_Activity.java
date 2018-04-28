package nnk.com.oots3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Call_Request_Activity extends AppCompatActivity
{
     Spinner spin1,spin2,spin3,spin4,spin5;
    String Category[]={"Isurance Agent","Laudry","Mover","Painting","Pest Control","Pudit","Rest Of Services"};
     String Service[]={"Isurance Agent","Laudry","Mover","Painting","Pest Control","Pudit","Rest Of Services"};
     String Language[]={"English","Hindi","Bengali"};
    String Issue[]={"Not Completed","Serviceman Issue","Product Provided"};
    String Country[]={"INR"};





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call__request_);
        spin1=(Spinner)findViewById(R.id.spin1_call_request);
        spin2=(Spinner)findViewById(R.id.spin2_call_request);
        spin3=(Spinner)findViewById(R.id.spin3_call_request);
        spin4=(Spinner)findViewById(R.id.spin4_call_request);
        spin5=(Spinner)findViewById(R.id.spin5_call_request);


        ArrayAdapter<String> aa=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Category);
        spin1.setAdapter(aa);
        ArrayAdapter<String> aa1=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Service);
        spin1.setAdapter(aa1);
        ArrayAdapter<String> aa2=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Issue);
        spin1.setAdapter(aa2);
        ArrayAdapter<String> aa3=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Language);
        spin1.setAdapter(aa3);
        ArrayAdapter<String> aa4=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Country);
        spin1.setAdapter(aa4);




    }
}
