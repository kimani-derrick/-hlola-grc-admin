package w2;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: w2.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399u {

    /* renamed from: a  reason: collision with root package name */
    public final String f15861a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15862b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15863c;

    public C1399u(String str, boolean z7, boolean z8) {
        this.f15861a = str;
        this.f15862b = z7;
        this.f15863c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C1399u.class) {
            return false;
        }
        C1399u c1399u = (C1399u) obj;
        if (TextUtils.equals(this.f15861a, c1399u.f15861a) && this.f15862b == c1399u.f15862b && this.f15863c == c1399u.f15863c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = AbstractC0515y1.i(31, 31, this.f15861a);
        int i9 = 1237;
        if (this.f15862b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i10 = (i8 + i7) * 31;
        if (this.f15863c) {
            i9 = 1231;
        }
        return i10 + i9;
    }
}
