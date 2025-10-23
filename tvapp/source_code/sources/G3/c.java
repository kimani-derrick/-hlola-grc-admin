package G3;

import android.graphics.Typeface;
import android.text.TextPaint;
/* loaded from: classes.dex */
public final class c extends p6.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextPaint f752a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p6.d f753b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f754c;

    public c(d dVar, TextPaint textPaint, p6.d dVar2) {
        this.f754c = dVar;
        this.f752a = textPaint;
        this.f753b = dVar2;
    }

    @Override // p6.d
    public final void v(int i7) {
        this.f753b.v(i7);
    }

    @Override // p6.d
    public final void w(Typeface typeface, boolean z7) {
        this.f754c.g(this.f752a, typeface);
        this.f753b.w(typeface, z7);
    }
}
