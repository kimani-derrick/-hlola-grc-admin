package k;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
/* renamed from: k.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922x extends C.b {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12109e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ WeakReference f12110g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0848D f12111h;

    public C0922x(C0848D c0848d, int i7, int i8, WeakReference weakReference) {
        this.f12111h = c0848d;
        this.f12109e = i7;
        this.f = i8;
        this.f12110g = weakReference;
    }

    @Override // C.b
    public final void i(Typeface typeface) {
        int i7;
        boolean z7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f12109e) != -1) {
            if ((this.f & 2) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            typeface = AbstractC0846C.a(typeface, i7, z7);
        }
        C0848D c0848d = this.f12111h;
        if (c0848d.f11867m) {
            c0848d.f11866l = typeface;
            TextView textView = (TextView) this.f12110g.get();
            if (textView != null) {
                Field field = K.O.f1447a;
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i8 = c0848d.f11864j;
                if (isAttachedToWindow) {
                    textView.post(new androidx.activity.g(textView, typeface, i8));
                } else {
                    textView.setTypeface(typeface, i8);
                }
            }
        }
    }

    @Override // C.b
    public final void h(int i7) {
    }
}
