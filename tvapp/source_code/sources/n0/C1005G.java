package n0;

import r0.AbstractC1111a;
/* renamed from: n0.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005G extends C1009K {
    public final Class n;

    public C1005G(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.n = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // n0.C1009K, n0.L
    public final String b() {
        return this.n.getName();
    }

    @Override // n0.C1009K
    /* renamed from: f */
    public final Enum e(String str) {
        Enum r42;
        M5.g.f(str, "value");
        Class cls = this.n;
        Object[] enumConstants = cls.getEnumConstants();
        M5.g.e(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i7 = 0;
        while (true) {
            if (i7 < length) {
                r42 = enumConstants[i7];
                if (U5.n.W(((Enum) r42).name(), str)) {
                    break;
                }
                i7++;
            } else {
                r42 = null;
                break;
            }
        }
        Enum r43 = r42;
        if (r43 != null) {
            return r43;
        }
        StringBuilder u7 = AbstractC1111a.u("Enum value ", str, " not found for type ");
        u7.append(cls.getName());
        u7.append('.');
        throw new IllegalArgumentException(u7.toString());
    }
}
