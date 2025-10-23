package com.google.android.material.timepicker;

import K.O;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import u3.AbstractC1272a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f9031q;

    /* renamed from: r  reason: collision with root package name */
    public final int f9032r;

    /* renamed from: s  reason: collision with root package name */
    public final float f9033s;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f9034t;

    /* renamed from: u  reason: collision with root package name */
    public final RectF f9035u;

    /* renamed from: v  reason: collision with root package name */
    public final int f9036v;

    /* renamed from: w  reason: collision with root package name */
    public float f9037w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f9038x;

    /* renamed from: y  reason: collision with root package name */
    public double f9039y;

    /* renamed from: z  reason: collision with root package name */
    public int f9040z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f9031q = new ArrayList();
        Paint paint = new Paint();
        this.f9034t = paint;
        this.f9035u = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.f14951e, R.attr.materialClockStyle, 2132018021);
        this.f9040z = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9032r = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f9036v = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f9033s = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = O.f1447a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        b(f);
    }

    public final void b(float f) {
        float f7 = f % 360.0f;
        this.f9037w = f7;
        this.f9039y = Math.toRadians(f7 - 90.0f);
        float cos = (this.f9040z * ((float) Math.cos(this.f9039y))) + (getWidth() / 2);
        float sin = (this.f9040z * ((float) Math.sin(this.f9039y))) + (getHeight() / 2);
        float f8 = this.f9032r;
        this.f9035u.set(cos - f8, sin - f8, cos + f8, sin + f8);
        Iterator it = this.f9031q.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f9029U - f7) > 0.001f) {
                clockFaceView.f9029U = f7;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i7;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        Paint paint = this.f9034t;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f9040z * ((float) Math.cos(this.f9039y))) + width2, (this.f9040z * ((float) Math.sin(this.f9039y))) + f, this.f9032r, paint);
        double sin = Math.sin(this.f9039y);
        double cos = Math.cos(this.f9039y);
        paint.setStrokeWidth(this.f9036v);
        canvas.drawLine(width2, f, width + ((int) (cos * r11)), height + ((int) (r11 * sin)), paint);
        canvas.drawCircle(width2, f, this.f9033s, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        a(this.f9037w);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x7 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean z10 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z8 = false;
                z7 = false;
            } else {
                z8 = this.f9038x;
                z7 = false;
            }
        } else {
            this.f9038x = false;
            z7 = true;
            z8 = false;
        }
        boolean z11 = this.f9038x;
        int degrees = (int) Math.toDegrees(Math.atan2(y3 - (getHeight() / 2), x7 - (getWidth() / 2)));
        int i7 = degrees + 90;
        if (i7 < 0) {
            i7 = degrees + 450;
        }
        float f = i7;
        if (this.f9037w != f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z7 || !z9) {
            if (z9 || z8) {
                a(f);
            }
            this.f9038x = z11 | z10;
            return true;
        }
        z10 = true;
        this.f9038x = z11 | z10;
        return true;
    }
}
