package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* renamed from: androidx.datastore.preferences.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238q {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f5805c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final d0 f5806a = new d0(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f5807b;

    static {
        new C0238q(0);
    }

    public C0238q() {
    }

    public static void b(C0232k c0232k, A0 a02, int i7, Object obj) {
        if (a02 == A0.f5671t) {
            c0232k.i0(i7, 3);
            ((AbstractC0220a) obj).c(c0232k);
            c0232k.i0(i7, 4);
            return;
        }
        c0232k.i0(i7, a02.f5675r);
        switch (a02.ordinal()) {
            case 0:
                c0232k.b0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0232k.Z(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c0232k.m0(((Long) obj).longValue());
                return;
            case 3:
                c0232k.m0(((Long) obj).longValue());
                return;
            case 4:
                c0232k.d0(((Integer) obj).intValue());
                return;
            case 5:
                c0232k.b0(((Long) obj).longValue());
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                c0232k.Z(((Integer) obj).intValue());
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                c0232k.S(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof C0228g)) {
                    c0232k.h0((String) obj);
                    return;
                }
                break;
            case 9:
                ((AbstractC0220a) obj).c(c0232k);
                return;
            case 10:
                c0232k.f0((AbstractC0220a) obj);
                return;
            case 11:
                if (!(obj instanceof C0228g)) {
                    byte[] bArr = (byte[]) obj;
                    c0232k.V(bArr.length, bArr);
                    return;
                }
                break;
            case 12:
                c0232k.k0(((Integer) obj).intValue());
                return;
            case 13:
                c0232k.d0(((Integer) obj).intValue());
                return;
            case 14:
                c0232k.Z(((Integer) obj).intValue());
                return;
            case 15:
                c0232k.b0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0232k.k0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0232k.m0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        c0232k.X((C0228g) obj);
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f5807b) {
            return;
        }
        d0 d0Var = this.f5806a;
        if (!d0Var.f5752t) {
            if (d0Var.f5750r.size() <= 0) {
                Iterator it = d0Var.d().iterator();
                if (it.hasNext()) {
                    AbstractC0515y1.v(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                AbstractC0515y1.v(d0Var.c(0).getKey());
                throw null;
            }
        }
        if (!d0Var.f5752t) {
            if (d0Var.f5751s.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(d0Var.f5751s);
            }
            d0Var.f5751s = unmodifiableMap;
            if (d0Var.f5754v.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(d0Var.f5754v);
            }
            d0Var.f5754v = unmodifiableMap2;
            d0Var.f5752t = true;
        }
        this.f5807b = true;
    }

    public final Object clone() {
        C0238q c0238q = new C0238q();
        d0 d0Var = this.f5806a;
        if (d0Var.f5750r.size() <= 0) {
            Iterator it = d0Var.d().iterator();
            if (!it.hasNext()) {
                return c0238q;
            }
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC0515y1.v(entry.getKey());
            entry.getValue();
            throw null;
        }
        Map.Entry c5 = d0Var.c(0);
        AbstractC0515y1.v(c5.getKey());
        c5.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0238q) {
            return this.f5806a.equals(((C0238q) obj).f5806a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5806a.hashCode();
    }

    public C0238q(int i7) {
        a();
        a();
    }
}
