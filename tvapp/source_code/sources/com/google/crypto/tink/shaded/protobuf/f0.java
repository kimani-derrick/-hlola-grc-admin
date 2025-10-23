package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0230i;
import java.io.IOException;
/* loaded from: classes.dex */
public final class f0 {
    public static e0 a(Object obj) {
        AbstractC0543v abstractC0543v = (AbstractC0543v) obj;
        e0 e0Var = abstractC0543v.unknownFields;
        if (e0Var == e0.f) {
            e0 c5 = e0.c();
            abstractC0543v.unknownFields = c5;
            return c5;
        }
        return e0Var;
    }

    public static void b(Object obj) {
        ((AbstractC0543v) obj).unknownFields.f9113e = false;
    }

    public static boolean c(Object obj, C0230i c0230i) {
        int i7 = c0230i.f5782b;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        B5.e eVar = (B5.e) c0230i.f5784e;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            return false;
                        }
                        if (i9 == 5) {
                            c0230i.f0(5);
                            ((e0) obj).d((i8 << 3) | 5, Integer.valueOf(eVar.s()));
                            return true;
                        }
                        throw B.c();
                    }
                    e0 c5 = e0.c();
                    int i10 = i8 << 3;
                    int i11 = i10 | 4;
                    while (c0230i.f() != Integer.MAX_VALUE && c(c5, c0230i)) {
                    }
                    if (i11 == c0230i.f5782b) {
                        c5.f9113e = false;
                        ((e0) obj).d(i10 | 3, c5);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((e0) obj).d((i8 << 3) | 2, c0230i.m());
                return true;
            }
            c0230i.f0(1);
            ((e0) obj).d((i8 << 3) | 1, Long.valueOf(eVar.t()));
            return true;
        }
        c0230i.f0(0);
        ((e0) obj).d(i8 << 3, Long.valueOf(eVar.w()));
        return true;
    }
}
