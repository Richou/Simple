package net.heanoria.droid.simple.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class SimpleLayout extends LinearLayout {

    public SimpleLayout(Context context) {
        this(context, null);
    }

    public SimpleLayout(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.SimpleStyle);
    }

    public SimpleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        LayoutInflater.from(context).inflate(R.layout.simple_layout, this, true);
    }
}
