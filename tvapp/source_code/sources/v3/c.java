package v3;

import android.animation.TimeInterpolator;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f15317a;

    /* renamed from: b  reason: collision with root package name */
    public long f15318b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f15319c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f15320e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f15319c;
        if (timeInterpolator == null) {
            return AbstractC1322a.f15313b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15317a != cVar.f15317a || this.f15318b != cVar.f15318b || this.d != cVar.d || this.f15320e != cVar.f15320e) {
            return false;
        }
        return a().getClass().equals(cVar.a().getClass());
    }

    public final int hashCode() {
        long j7 = this.f15317a;
        long j8 = this.f15318b;
        return ((((a().getClass().hashCode() + (((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31)) * 31) + this.d) * 31) + this.f15320e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f15317a);
        sb.append(" duration: ");
        sb.append(this.f15318b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return AbstractC0515y1.n(sb, this.f15320e, "}\n");
    }
}
