package com.fachrudin.coding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FibonacciActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.listView = (ListView) this.findViewById(R.id.listview);

        this.createListView();
    }


    private void createListView() {

        List<MyItem> myItems = new ArrayList<MyItem>(); //Array

        int a=0,b=1;
        for (int i = 1; i <= 100; i++) {
            String indexNumber = String.valueOf(i);
            myItems.add(new MyItem(indexNumber, String.valueOf(a)));
            a=a+b; //the results of two previous numbers
            b=a-b;
        }

        ItemArrayAdapter arrayAdapter = new ItemArrayAdapter(this,
                R.layout.activity_list, myItems);
        this.listView.setAdapter(arrayAdapter);

    }

    /*
        Model
     */
    private static class MyItem {
        private String index;
        private String value;

        MyItem(String index, String value) {
            this.index = index;
            this.value = value;
        }

        String getIndex() {
            return this.index;
        }

        String getValue() {
            return this.value;
        }
    }

    /*
        ViewHolder
     */
    private static class ViewHolder {
        TextView indexTextView;
        TextView valueTextView;
    }

    private static class ItemArrayAdapter extends ArrayAdapter<MyItem> {

        private LayoutInflater layoutInflater;
        private int            textViewResourceId;

        ItemArrayAdapter(Context context, int resource, List<MyItem> objects) {
            super(context, resource, resource, objects);

            this.layoutInflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.textViewResourceId = resource;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final MyItem myItem = (MyItem) this.getItem(position);
            ViewHolder viewHolder;

            if (null == convertView) {
                convertView = this.layoutInflater.inflate(this.textViewResourceId, null);

                viewHolder = new ViewHolder();
                viewHolder.indexTextView = (TextView) convertView.findViewById(R.id.index);
                viewHolder.valueTextView = (TextView) convertView.findViewById(R.id.value);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            viewHolder.indexTextView.setText(myItem.getIndex());
            viewHolder.valueTextView.setText(myItem.getValue());

            return convertView;
        }

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
        if (id == R.id.factorial) {
            Intent intent = new Intent(this, FactorialActivity.class);
            startActivity(intent);
            this.finish();
        }
        else if (id == R.id.fibonacci) {
            Intent intent = new Intent(this, FibonacciActivity.class);
            startActivity(intent);
            this.finish();
        }
        else if (id == R.id.fizzbuzz){
            Intent intent = new Intent(this, FizzbuzzActivity.class);
            startActivity(intent);
            this.finish();
        }
        else if (id == R.id.reversechar){
            Intent intent = new Intent(this, ReverseCharActivity.class);
            startActivity(intent);
            this.finish();
        }
        else {
            // Bring user to the market or let them choose an app?
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse("market://search?q=pub:SandPaper"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}