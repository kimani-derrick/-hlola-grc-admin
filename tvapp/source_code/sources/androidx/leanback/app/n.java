package androidx.leanback.app;

import android.util.Log;
import androidx.fragment.app.C0247a;
import androidx.fragment.app.M;
import androidx.fragment.app.S;
import androidx.leanback.widget.P;
/* loaded from: classes.dex */
public final class n implements M {

    /* renamed from: a  reason: collision with root package name */
    public int f6240a;

    /* renamed from: b  reason: collision with root package name */
    public int f6241b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f6242c;

    public n(s sVar) {
        this.f6242c = sVar;
        this.f6240a = sVar.f6106J.I();
    }

    @Override // androidx.fragment.app.M
    public final void a() {
        boolean z7;
        C0247a c0247a;
        s sVar = this.f6242c;
        S s6 = sVar.f6106J;
        if (s6 == null) {
            Log.w("BrowseSupportFragment", "getFragmentManager() is null, stack:", new Exception());
            return;
        }
        int I6 = s6.I();
        int i7 = this.f6240a;
        if (I6 > i7) {
            S s7 = sVar.f6106J;
            int i8 = I6 - 1;
            if (i8 == s7.d.size()) {
                c0247a = s7.f5928h;
                if (c0247a == null) {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                c0247a = (C0247a) s7.d.get(i8);
            }
            if (sVar.f6271Z0.equals(c0247a.f5986i)) {
                this.f6241b = i8;
            }
        } else if (I6 < i7 && this.f6241b >= I6) {
            P p3 = sVar.f6266T0;
            if (p3 != null && p3.d() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                S s8 = sVar.f6106J;
                s8.getClass();
                C0247a c0247a2 = new C0247a(s8);
                c0247a2.c(sVar.f6271Z0);
                c0247a2.e(false);
                return;
            }
            this.f6241b = -1;
            if (!sVar.f6272a1) {
                sVar.E0(true);
            }
        }
        this.f6240a = I6;
    }
}
