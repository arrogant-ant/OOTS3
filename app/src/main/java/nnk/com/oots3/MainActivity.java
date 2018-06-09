package nnk.com.oots3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    private DrawerLayout dl;
    private ActionBarDrawerToggle toggle;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener()
    {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {

            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            switch (item.getItemId())
            {
                case R.id.navigation_profile:
                  transaction.replace(R.id.content,new Profile_Fragment()).commit();
                    return true;
                case R.id.navigation_transaction:
                    transaction.replace(R.id.content,new Transaction_Fragment()).commit();
                    return true;

                case R.id.navigation_more:
                  transaction.replace(R.id.content,new More_Fragment()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl=(DrawerLayout)findViewById(R.id.container);
        toggle=new ActionBarDrawerToggle(MainActivity.this,dl,R.string.open,R.string.close);
        dl.addDrawerListener(toggle);
        toggle.syncState();
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.content,new Profile_Fragment()).commit();


        NavigationView navigationView=(NavigationView)findViewById(R.id.nav_side);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)

    {
        if(toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        int id=item.getItemId();

         if(id==R.id.myprofile)
         {
             Toast.makeText(this,"My profile Activity",Toast.LENGTH_SHORT).show();

         }
        if(id==R.id.Refill)
        {
            Intent i=new Intent(MainActivity.this,RefillActivity.class);
            startActivity(i);

        }
        if(id==R.id.yourservice)
        {
            Toast.makeText(MainActivity.this,"yourservice  Activity",Toast.LENGTH_SHORT).show();

        }
        if(id==R.id.Notification)
        {
            Intent i=new Intent(MainActivity.this,NotificationActivity.class);
            startActivity(i);

        }
        if(id==R.id.earning)
        {
            Intent i=new Intent(MainActivity.this,EarningActivity.class);
            startActivity(i);
        }
        if(id==R.id.Unpaidrecords)
        {
            Toast.makeText(this,"Unpaid Records  Activity",Toast.LENGTH_SHORT).show();

        }
        if(id==R.id.term)
        {
            Toast.makeText(this,"terms & conditions  Activity",Toast.LENGTH_SHORT).show();

        }
        if(id==R.id.help_support)
        {
            Intent i=new Intent(MainActivity.this,Help_and_Support_Activity.class);
            startActivity(i);
        }
        if(id==R.id.Logout)
        {
            Toast.makeText(this,"Logout  Activity",Toast.LENGTH_SHORT).show();

        }
        return true;
    }
}
