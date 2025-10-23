package J1;

import c1.C0387a;
import com.boxhdo.domain.model.ContinueWatch;
/* loaded from: classes.dex */
public final class d implements l {
    @Override // J1.l
    public final Object s(Object obj) {
        String str;
        String str2;
        float f;
        long j7;
        long j8;
        long j9;
        int i7;
        C0387a c0387a = (C0387a) obj;
        M5.g.f(c0387a, "dto");
        String str3 = c0387a.f7226b;
        if (str3 == null) {
            str = "";
        } else {
            str = str3;
        }
        String str4 = c0387a.f;
        if (str4 == null) {
            str2 = "";
        } else {
            str2 = str4;
        }
        Float f7 = c0387a.f7229g;
        if (f7 != null) {
            f = f7.floatValue();
        } else {
            f = 0.0f;
        }
        float f8 = f;
        Long valueOf = Long.valueOf(c0387a.f7230h);
        long j10 = 0;
        Long l7 = c0387a.f7231i;
        if (l7 != null) {
            j7 = l7.longValue();
        } else {
            j7 = 0;
        }
        Long valueOf2 = Long.valueOf(j7);
        Long l8 = c0387a.f7232j;
        if (l8 != null) {
            j8 = l8.longValue();
        } else {
            j8 = 0;
        }
        Long valueOf3 = Long.valueOf(j8);
        Long l9 = c0387a.f7233k;
        if (l9 != null) {
            j9 = l9.longValue();
        } else {
            j9 = 0;
        }
        Long valueOf4 = Long.valueOf(j9);
        Float f9 = c0387a.f7234l;
        if (f9 != null) {
            float floatValue = f9.floatValue();
            if (!Float.isNaN(floatValue)) {
                i7 = Math.round(floatValue);
            } else {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
        } else {
            i7 = 0;
        }
        Integer valueOf5 = Integer.valueOf(i7);
        Long l10 = c0387a.f7235m;
        if (l10 != null) {
            j10 = l10.longValue();
        }
        return new ContinueWatch(c0387a.f7225a, str, c0387a.f7228e, c0387a.d, str2, f8, c0387a.f7227c, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, j10);
    }
}
