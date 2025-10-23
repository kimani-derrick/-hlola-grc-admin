package v4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: v4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330h {

    /* renamed from: c  reason: collision with root package name */
    public static final C1330h f15336c = new C1330h(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f15337a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15338b;

    public C1330h(int i7, int i8) {
        this.f15337a = i7;
        this.f15338b = i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1330h.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f15337a);
        sb.append(", length = ");
        return AbstractC0515y1.n(sb, this.f15338b, "]");
    }
}
