package nnk.com.oots3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;


public class NotificationActivity extends AppCompatActivity
{

    String[] status = {"pending","Pending","Received","Complete","In Process","Failed"};
    String narration[]={"Service at Place 1","Service at Place 2","Service at Place 3","Service at Place 4","Service at Place 5","Service at Place 6"};
    TextView tv,tv1;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        lv=(ListView)findViewById(R.id.lv_notification);

        tv=(TextView)findViewById(R.id.tv1_notification);
        tv1=(TextView)findViewById(R.id.tv1_notification);

        MyAdapter ma=new MyAdapter();
        lv.setAdapter(ma);
    }
    public class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount()
        {
            return narration.length;
        }

        @Override
        public Object getItem(int position)
        {
            return null;
        }

        @Override
        public long getItemId(int position)
        {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent)
        {
            LayoutInflater li=getLayoutInflater();
            View v1=li.inflate(R.layout.list_view_notification,null,false);


            tv=(TextView)v1.findViewById(R.id.tv1_notification);
            tv1=(TextView)v1.findViewById(R.id.tv2_notification);

            tv.setText(narration[position]);
            tv1.setText(status[position]);
            return v1;
        }
    }
}
