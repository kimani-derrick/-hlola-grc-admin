package i2;

import Z2.AbstractC0156a;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.K;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f11358a;

    /* renamed from: b  reason: collision with root package name */
    public final K f11359b;

    /* renamed from: c  reason: collision with root package name */
    public final K f11360c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11361e;

    public i(String str, K k5, K k7, int i7, int i8) {
        boolean z7;
        if (i7 != 0 && i8 != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.f(z7);
        if (!TextUtils.isEmpty(str)) {
            this.f11358a = str;
            k5.getClass();
            this.f11359b = k5;
            k7.getClass();
            this.f11360c = k7;
            this.d = i7;
            this.f11361e = i8;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.d == iVar.d && this.f11361e == iVar.f11361e && this.f11358a.equals(iVar.f11358a) && this.f11359b.equals(iVar.f11359b) && this.f11360c.equals(iVar.f11360c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = AbstractC0515y1.i((((527 + this.d) * 31) + this.f11361e) * 31, 31, this.f11358a);
        return this.f11360c.hashCode() + ((this.f11359b.hashCode() + i7) * 31);
    }
}
