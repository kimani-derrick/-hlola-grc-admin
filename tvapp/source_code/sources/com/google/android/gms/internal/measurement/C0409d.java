package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import r0.AbstractC1111a;
/* renamed from: com.google.android.gms.internal.measurement.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409d {
    public static final O3.H d = O3.H.r(3, "_syn", "_err", "_el");

    /* renamed from: a  reason: collision with root package name */
    public String f8532a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8533b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8534c;

    public C0409d(String str, long j7, HashMap hashMap) {
        this.f8532a = str;
        this.f8533b = j7;
        HashMap hashMap2 = new HashMap();
        this.f8534c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object a(Object obj, Object obj2, String str) {
        if (!d.contains(str) || !(obj2 instanceof Double)) {
            if (str.startsWith("_")) {
                if (obj instanceof String) {
                    return obj2;
                }
                if (obj != null) {
                    return obj;
                }
                return obj2;
            } else if (obj instanceof Double) {
                return obj2;
            } else {
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        return obj2.toString();
                    }
                    return obj2;
                }
            }
        }
        return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final /* synthetic */ Object clone() {
        return new C0409d(this.f8532a, this.f8533b, new HashMap(this.f8534c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0409d) {
            C0409d c0409d = (C0409d) obj;
            if (this.f8533b == c0409d.f8533b && this.f8532a.equals(c0409d.f8532a)) {
                return this.f8534c.equals(c0409d.f8534c);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f8533b;
        return this.f8534c.hashCode() + (((this.f8532a.hashCode() * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f8532a;
        String valueOf = String.valueOf(this.f8534c);
        StringBuilder u7 = AbstractC1111a.u("Event{name='", str, "', timestamp=");
        u7.append(this.f8533b);
        u7.append(", params=");
        u7.append(valueOf);
        u7.append("}");
        return u7.toString();
    }
}
