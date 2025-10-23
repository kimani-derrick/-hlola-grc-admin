package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Locale;
import k3.AbstractC0958a;
import r0.AbstractC1111a;
/* renamed from: com.google.crypto.tink.shaded.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0530h implements Iterable, Serializable {

    /* renamed from: r  reason: collision with root package name */
    public static final C0529g f9118r = new C0529g(AbstractC0547z.f9166b);

    /* renamed from: s  reason: collision with root package name */
    public static final C0527e f9119s;

    /* renamed from: q  reason: collision with root package name */
    public int f9120q;

    static {
        C0527e c0527e;
        if (AbstractC0525c.a()) {
            c0527e = new C0527e(1);
        } else {
            c0527e = new C0527e(0);
        }
        f9119s = c0527e;
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

    public static C0529g f(byte[] bArr, int i7, int i8) {
        c(i7, i7 + i8, bArr.length);
        return new C0529g(f9119s.a(bArr, i7, i8));
    }

    public abstract byte b(int i7);

    public abstract void g(int i7, byte[] bArr);

    public abstract byte h(int i7);

    public final int hashCode() {
        int i7 = this.f9120q;
        if (i7 == 0) {
            int size = size();
            C0529g c0529g = (C0529g) this;
            int n = c0529g.n();
            int i8 = size;
            for (int i9 = n; i9 < n + size; i9++) {
                i8 = (i8 * 31) + c0529g.f9116t[i9];
            }
            if (i8 == 0) {
                i7 = 1;
            } else {
                i7 = i8;
            }
            this.f9120q = i7;
        }
        return i7;
    }

    public final byte[] l() {
        int size = size();
        if (size == 0) {
            return AbstractC0547z.f9166b;
        }
        byte[] bArr = new byte[size];
        g(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        C0529g c0528f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0958a.p(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C0529g c0529g = (C0529g) this;
            int c5 = c(0, 47, c0529g.size());
            if (c5 == 0) {
                c0528f = f9118r;
            } else {
                c0528f = new C0528f(c0529g.f9116t, c0529g.n(), c5);
            }
            sb2.append(AbstractC0958a.p(c0528f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC1111a.t(sb3, sb, "\">");
    }
}
