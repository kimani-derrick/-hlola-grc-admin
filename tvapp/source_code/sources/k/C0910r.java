package k;

import a0.C0196g;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import e.AbstractC0565a;
/* renamed from: k.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910r {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12086a;

    /* renamed from: b  reason: collision with root package name */
    public final Z5.n f12087b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z5.n, java.lang.Object] */
    public C0910r(TextView textView) {
        this.f12086a = textView;
        ?? obj = new Object();
        android.support.v4.media.session.b.j(textView, "textView cannot be null");
        obj.f4918q = new C0196g(textView);
        this.f12087b = obj;
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f12086a.getContext().obtainStyledAttributes(attributeSet, AbstractC0565a.f9345g, i7, 0);
        try {
            boolean z7 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z7 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((p6.l) this.f12087b.f4918q).H(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
