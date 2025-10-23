package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0226e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import r0.AbstractC1111a;
/* renamed from: com.google.android.gms.internal.measurement.c2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0407c2 implements Serializable, Iterable {

    /* renamed from: s  reason: collision with root package name */
    public static final C0407c2 f8526s = new C0407c2(AbstractC0467o2.f8632b);

    /* renamed from: t  reason: collision with root package name */
    public static final C0442j2 f8527t = new C0442j2(6);

    /* renamed from: q  reason: collision with root package name */
    public int f8528q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f8529r;

    public C0407c2(byte[] bArr) {
        bArr.getClass();
        this.f8529r = bArr;
    }

    public static int c(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) < 0) {
            if (i7 >= 0) {
                if (i8 < i7) {
                    throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(AbstractC1111a.m(i8, i9, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(AbstractC1111a.n(i7, "Beginning index: ", " < 0"));
        }
        return i10;
    }

    public static C0407c2 f(byte[] bArr, int i7, int i8) {
        c(i7, i7 + i8, bArr.length);
        f8527t.getClass();
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new C0407c2(bArr2);
    }

    public byte b(int i7) {
        return this.f8529r[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0407c2) || h() != ((C0407c2) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (obj instanceof C0407c2) {
            C0407c2 c0407c2 = (C0407c2) obj;
            int i7 = this.f8528q;
            int i8 = c0407c2.f8528q;
            if (i7 != 0 && i8 != 0 && i7 != i8) {
                return false;
            }
            int h7 = h();
            if (h7 <= c0407c2.h()) {
                if (h7 <= c0407c2.h()) {
                    int l7 = l() + h7;
                    int l8 = l();
                    int l9 = c0407c2.l();
                    while (l8 < l7) {
                        if (this.f8529r[l8] != c0407c2.f8529r[l9]) {
                            return false;
                        }
                        l8++;
                        l9++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(AbstractC1111a.m(h7, c0407c2.h(), "Ran off end of other: 0, ", ", "));
            }
            int h8 = h();
            throw new IllegalArgumentException("Length too large: " + h7 + h8);
        }
        return obj.equals(this);
    }

    public byte g(int i7) {
        return this.f8529r[i7];
    }

    public int h() {
        return this.f8529r.length;
    }

    public final int hashCode() {
        int i7 = this.f8528q;
        if (i7 == 0) {
            int h7 = h();
            int l7 = l();
            int i8 = h7;
            for (int i9 = l7; i9 < l7 + h7; i9++) {
                i8 = (i8 * 31) + this.f8529r[i9];
            }
            if (i8 == 0) {
                i7 = 1;
            } else {
                i7 = i8;
            }
            this.f8528q = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0226e(this);
    }

    public int l() {
        return 0;
    }

    public final String toString() {
        C0407c2 c0402b2;
        String m7;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int h7 = h();
        if (h() <= 50) {
            m7 = M1.l(this);
        } else {
            int c5 = c(0, 47, h());
            if (c5 == 0) {
                c0402b2 = f8526s;
            } else {
                c0402b2 = new C0402b2(this.f8529r, l(), c5);
            }
            m7 = AbstractC0515y1.m(M1.l(c0402b2), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(h7);
        sb.append(" contents=\"");
        return AbstractC1111a.t(sb, m7, "\">");
    }
}
