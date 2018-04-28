package nnk.com.oots3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class EarningActivity extends AppCompatActivity
{
    String[] ID_order = {"Order Id:\n11111", "Order Id:\n22222","Order Id:\n33333","Order Id:\n44444","Order Id:\n55555","Order Id:\n66666"};
    String [] Money = {"456","1000","670","840","650","1200"};
    TextView tv, tv1;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earning);
        lv = (ListView)findViewById(R.id.lv_earning);
        tv = (TextView)findViewById(R.id.tv2_earning);
        tv1 = (TextView)findViewById(R.id.tv8_earning);
        MyAdapter ma=new MyAdapter();
        lv.setAdapter(ma);

    }
        public class MyAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return ID_order.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {
                LayoutInflater li = getLayoutInflater();
                View v1 = li.inflate(R.layout.list_view_earning, null, false);


                tv = (TextView) v1.findViewById(R.id.tv2_earning);
                tv1 = (TextView) v1.findViewById(R.id.tv8_earning);

                tv.setText(ID_order[position]);
                tv1.setText(Money[position]);
                return v1;
            }
        }
    }

