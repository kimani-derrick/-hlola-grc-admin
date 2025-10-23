package e4;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0545x;
/* loaded from: classes.dex */
public enum O implements InterfaceC0545x {
    f10112r("UNKNOWN_HASH"),
    f10113s("SHA1"),
    f10114t("SHA384"),
    f10115u("SHA256"),
    f10116v("SHA512"),
    f10117w("SHA224"),
    f10118x("UNRECOGNIZED");
    

    /* renamed from: q  reason: collision with root package name */
    public final int f10120q;

    O(String str) {
        this.f10120q = r2;
    }

    public static O a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                return null;
                            }
                            return f10117w;
                        }
                        return f10116v;
                    }
                    return f10115u;
                }
                return f10114t;
            }
            return f10113s;
        }
        return f10112r;
    }

    public final int b() {
        if (this != f10118x) {
            return this.f10120q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
