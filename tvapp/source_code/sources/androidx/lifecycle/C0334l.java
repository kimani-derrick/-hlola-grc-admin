package androidx.lifecycle;
/* renamed from: androidx.lifecycle.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334l {
    public static EnumC0336n a(EnumC0337o enumC0337o) {
        M5.g.f(enumC0337o, "state");
        int ordinal = enumC0337o.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return EnumC0336n.ON_PAUSE;
            }
            return EnumC0336n.ON_STOP;
        }
        return EnumC0336n.ON_DESTROY;
    }

    public static EnumC0336n b(EnumC0337o enumC0337o) {
        M5.g.f(enumC0337o, "state");
        int ordinal = enumC0337o.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return EnumC0336n.ON_RESUME;
            }
            return EnumC0336n.ON_START;
        }
        return EnumC0336n.ON_CREATE;
    }

    public static EnumC0336n c(EnumC0337o enumC0337o) {
        M5.g.f(enumC0337o, "state");
        int ordinal = enumC0337o.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return EnumC0336n.ON_RESUME;
            }
            return EnumC0336n.ON_START;
        }
        return EnumC0336n.ON_CREATE;
    }
}
