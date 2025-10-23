package e4;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0545x;
/* loaded from: classes.dex */
public enum X implements InterfaceC0545x {
    f10121r("UNKNOWN_KEYMATERIAL"),
    f10122s("SYMMETRIC"),
    f10123t("ASYMMETRIC_PRIVATE"),
    f10124u("ASYMMETRIC_PUBLIC"),
    f10125v("REMOTE"),
    f10126w("UNRECOGNIZED");
    

    /* renamed from: q  reason: collision with root package name */
    public final int f10128q;

    X(String str) {
        this.f10128q = r2;
    }

    public static X a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            return null;
                        }
                        return f10125v;
                    }
                    return f10124u;
                }
                return f10123t;
            }
            return f10122s;
        }
        return f10121r;
    }

    public final int b() {
        if (this != f10126w) {
            return this.f10128q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
