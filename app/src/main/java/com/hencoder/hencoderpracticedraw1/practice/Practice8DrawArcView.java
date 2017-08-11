package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        this(context, null);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private Paint mPaint;

    private void init(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setShadowLayer(2, 0, 0, Color.BLACK);
        mPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();


//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        canvas.drawArc(new RectF(width / 3, height / 2 - height / 10, width / 3 * 2, height / 2 + height / 10)
                , 30, 120, false, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(new RectF(width / 3, height / 2 - height / 10, width / 3 * 2, height / 2 + height / 10)
                , 180, 45, false, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(new RectF(width / 3, height / 2 - height / 10, width / 3 * 2, height / 2 + height / 10)
                , 240, 100, true, mPaint);
    }
}
