package androidx.emoji2.text;

import android.text.TextPaint;
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f5831b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f5832a;

    public c() {
        TextPaint textPaint = new TextPaint();
        this.f5832a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
