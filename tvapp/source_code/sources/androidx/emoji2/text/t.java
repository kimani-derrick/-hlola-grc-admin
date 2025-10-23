package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class t extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    public final m f5870b;

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f5869a = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    public float f5871c = 1.0f;

    public t(m mVar) {
        android.support.v4.media.session.b.j(mVar, "metadata cannot be null");
        this.f5870b = mVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f, int i9, int i10, int i11, Paint paint) {
        j.a().getClass();
        m mVar = this.f5870b;
        C4.b bVar = mVar.f5851b;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) bVar.f424u);
        int i12 = mVar.f5850a * 2;
        canvas.drawText((char[]) bVar.f422s, i12, 2, f, i10, paint);
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        short s6;
        Paint.FontMetricsInt fontMetricsInt2 = this.f5869a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        m mVar = this.f5870b;
        Z.a c5 = mVar.c();
        int a7 = c5.a(14);
        short s7 = 0;
        if (a7 != 0) {
            s6 = ((ByteBuffer) c5.f295t).getShort(a7 + c5.f292q);
        } else {
            s6 = 0;
        }
        this.f5871c = abs / s6;
        Z.a c6 = mVar.c();
        int a8 = c6.a(14);
        if (a8 != 0) {
            ((ByteBuffer) c6.f295t).getShort(a8 + c6.f292q);
        }
        Z.a c7 = mVar.c();
        int a9 = c7.a(12);
        if (a9 != 0) {
            s7 = ((ByteBuffer) c7.f295t).getShort(a9 + c7.f292q);
        }
        short s8 = (short) (s7 * this.f5871c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s8;
    }
}
