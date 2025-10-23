package K;

import android.text.TextUtils;
import android.view.View;
/* renamed from: K.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049z extends B5.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f1514u;

    public C0049z(int i7, Class cls, int i8, int i9, int i10) {
        this.f1514u = i10;
        this.f292q = i7;
        this.f295t = cls;
        this.f294s = i8;
        this.f293r = i9;
    }

    @Override // B5.e
    public final boolean H(Object obj, Object obj2) {
        boolean z7;
        boolean z8;
        switch (this.f1514u) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z9 = false;
                if (bool != null && bool.booleanValue()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z7 == z8) {
                    z9 = true;
                }
                return !z9;
        }
    }

    @Override // B5.e
    public final Object f(View view) {
        switch (this.f1514u) {
            case 0:
                return H.b(view);
            default:
                return Boolean.valueOf(H.c(view));
        }
    }

    @Override // B5.e
    public final void g(View view, Object obj) {
        switch (this.f1514u) {
            case 0:
                H.h(view, (CharSequence) obj);
                return;
            default:
                H.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }
}
