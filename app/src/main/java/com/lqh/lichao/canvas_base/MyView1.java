package com.lqh.lichao.canvas_base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2017-10-11.
 */

public class MyView1 extends View {

    private static final String TAG = "MyView1";
    private Paint mPaint = null;
    private Bitmap mBitmap = null;

    public MyView1(Context context) {
        this(context, null);
    }

    public MyView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.lsj);
        init();
    }

    public MyView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d(TAG, "Current SaveCount = " + canvas.getSaveCount());
        canvas.translate(400, 400);
        RectF rectF = new RectF(0,0,600,600);

        //canvas.drawBitmap(mBitmap, 0, 0, mPaint);
        canvas.drawBitmap(mBitmap, null, rectF, mPaint);

        canvas.save();
        Log.d(TAG, "Current SaveCount = " + canvas.getSaveCount());

        canvas.rotate(45);
        //canvas.drawBitmap(mBitmap, 0, 0, mPaint);
        canvas.drawBitmap(mBitmap, null, rectF, mPaint);

        canvas.save();
        Log.d(TAG, "Current SaveCount = " + canvas.getSaveCount());

        canvas.rotate(45);
        //canvas.drawBitmap(mBitmap, 0, 0, mPaint);
        canvas.drawBitmap(mBitmap, null, rectF, mPaint);

        canvas.save();
        Log.d(TAG, "Current SaveCount = " + canvas.getSaveCount());

        canvas.restoreToCount(1);
        Log.d(TAG, "Current SaveCount = " + canvas.getSaveCount());

        canvas.translate(0, 200);
        //canvas.drawBitmap(mBitmap, 0, 0, mPaint);
        //rectF = new RectF(0,0,600,600);
        canvas.drawBitmap(mBitmap, null, rectF, mPaint);

        canvas.restoreToCount(3);
        Log.d(TAG, "Current SaveCount = " + canvas.getSaveCount());
        canvas.drawBitmap(mBitmap, null, rectF, mPaint);
    }
}
