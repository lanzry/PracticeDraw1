package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.*;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        this(context, null);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

//        练习内容：使用 canvas.drawPath() 方法画心形
        int mRadius = 80;
        Path path = new Path();
        path.addArc(new RectF(width / 2 - mRadius * 2, height / 2 - mRadius, width / 2, height / 2 + mRadius), -225, 225);
        path.arcTo(new RectF(width / 2, height / 2 - mRadius, width / 2 + mRadius * 2, height / 2 + mRadius), -180, 225);
        path.lineTo(width / 2, (float) (height / 2 + mRadius * Math.sin(67.5 / 180 * Math.PI) * 2 * Math.sqrt(2)));
        canvas.drawPath(path, mPaint);
    }
}
