package com.example.provatrackdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipDescription;
import android.media.metrics.Event;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.DragEvent;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, View.OnDragListener {
    private TextView t;
    private Button b;
    private ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t = (TextView) findViewById(R.id.txt1);
         i = (ImageView) findViewById(R.id.image);
         b = (Button) findViewById(R.id.btnDrag);
         implementaEventi();
        //git hub
    }

    private void implementaEventi()
    {
        //oggetti che possono essere spostati con il cursore se premuti
        t.setOnLongClickListener(this);
        i.setOnLongClickListener(this);
        b.setOnLongClickListener(this);
        //setto i layout in modo che possano contenere gli oggetti spostati
        findViewById(R.id.layout1).setOnDragListener(this);
        findViewById(R.id.layout2).setOnDragListener(this);
        findViewById(R.id.layout3).setOnDragListener(this);

    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }

    @Override
    public boolean onDrag(View view, DragEvent dragEvent) {
        int action = dragEvent.getAction();
        switch (action){
            case DragEvent.ACTION_DRAG_STARTED:
                if(dragEvent.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)){
                    return true;
                }
                else
                {
                    return false;
                }

        }
        return false;
    }
}