package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public final class k0 {
    public static boolean a(Object obj, C0230i c0230i) {
        int g7 = c0230i.g();
        int i7 = g7 >>> 3;
        int i8 = g7 & 7;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            return false;
                        }
                        if (i8 == 5) {
                            ((j0) obj).c((i7 << 3) | 5, Integer.valueOf(c0230i.t()));
                            return true;
                        }
                        throw B.b();
                    }
                    j0 b7 = j0.b();
                    int i9 = i7 << 3;
                    int i10 = i9 | 4;
                    while (c0230i.f() != Integer.MAX_VALUE && a(b7, c0230i)) {
                    }
                    if (i10 == c0230i.g()) {
                        b7.f5790e = false;
                        ((j0) obj).c(i9 | 3, b7);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((j0) obj).c((i7 << 3) | 2, c0230i.l());
                return true;
            }
            ((j0) obj).c((i7 << 3) | 1, Long.valueOf(c0230i.v()));
            return true;
        }
        ((j0) obj).c(i7 << 3, Long.valueOf(c0230i.E()));
        return true;
    }
}
