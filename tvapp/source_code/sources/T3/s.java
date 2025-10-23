package T3;

import g4.C0736a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class s extends b {
    /* JADX WARN: Type inference failed for: r4v6, types: [T3.s, java.lang.Object] */
    public static s b(j jVar, Z5.n nVar, Integer num) {
        j jVar2 = j.n;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        } else if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            C0736a c0736a = (C0736a) nVar.f4918q;
            if (c0736a.f10837a.length == 32) {
                if (jVar == jVar2) {
                    C0736a.a(new byte[0]);
                } else if (jVar == j.f3344m) {
                    C0736a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (jVar == j.f3343l) {
                    C0736a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: " + jVar);
                }
                return new Object();
            }
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c0736a.f10837a.length);
        }
    }
}
