package androidx.leanback.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes.dex */
public final class J0 extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f6403a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6404b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K0 f6405c;

    public J0(SearchEditText searchEditText, int i7, int i8) {
        this.f6405c = searchEditText;
        this.f6403a = i7;
        this.f6404b = i8;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f, int i9, int i10, int i11, Paint paint) {
        boolean z7;
        float f7;
        Bitmap bitmap;
        int measureText = (int) paint.measureText(charSequence, i7, i8);
        K0 k02 = this.f6405c;
        int width = k02.f6411r.getWidth();
        int i12 = width * 2;
        int i13 = measureText / i12;
        int i14 = (measureText % i12) / 2;
        if (1 == k02.getLayoutDirection()) {
            z7 = true;
        } else {
            z7 = false;
        }
        k02.f6410q.setSeed(this.f6403a);
        int alpha = paint.getAlpha();
        for (int i15 = 0; i15 < i13 && this.f6404b + i15 < k02.f6413t; i15++) {
            float f8 = (width / 2) + (i15 * i12) + i14;
            if (z7) {
                f7 = ((f + measureText) - f8) - width;
            } else {
                f7 = f + f8;
            }
            paint.setAlpha((k02.f6410q.nextInt(4) + 1) * 63);
            if (k02.f6410q.nextBoolean()) {
                bitmap = k02.f6412s;
            } else {
                bitmap = k02.f6411r;
            }
            canvas.drawBitmap(bitmap, f7, i10 - bitmap.getHeight(), paint);
        }
        paint.setAlpha(alpha);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i7, i8);
    }
}
