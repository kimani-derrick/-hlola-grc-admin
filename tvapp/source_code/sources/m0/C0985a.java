package m0;

import androidx.fragment.app.U;
import androidx.lifecycle.V;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import o.k;
/* renamed from: m0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985a extends V {

    /* renamed from: e  reason: collision with root package name */
    public static final U f12380e = new U(1);
    public final k d = new k();

    @Override // androidx.lifecycle.V
    public final void b() {
        k kVar = this.d;
        if (kVar.k() <= 0) {
            int i7 = kVar.f12813t;
            Object[] objArr = kVar.f12812s;
            for (int i8 = 0; i8 < i7; i8++) {
                objArr[i8] = null;
            }
            kVar.f12813t = 0;
            kVar.f12810q = false;
            return;
        }
        AbstractC0515y1.v(kVar.l(0));
        throw null;
    }
}
