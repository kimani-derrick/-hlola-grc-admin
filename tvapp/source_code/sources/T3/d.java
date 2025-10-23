package T3;

import H2.C0002c;
import c4.C0392a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class d implements S3.a {

    /* renamed from: a  reason: collision with root package name */
    public final C0002c f3327a;

    /* renamed from: b  reason: collision with root package name */
    public final L4.f f3328b;

    /* renamed from: c  reason: collision with root package name */
    public final L4.f f3329c;

    public d(C0002c c0002c) {
        this.f3327a = c0002c;
        boolean z7 = !((C0392a) c0002c.f1019t).f7270a.isEmpty();
        L4.f fVar = Z3.r.f4729a;
        if (z7) {
            Z3.g gVar = (Z3.g) Z3.h.f4707b.f4709a.get();
            gVar = gVar == null ? Z3.h.f4708c : gVar;
            Z3.r.a(c0002c);
            gVar.getClass();
        }
        this.f3328b = fVar;
        this.f3329c = fVar;
    }

    @Override // S3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] copyOf;
        L4.f fVar = this.f3328b;
        C0002c c0002c = this.f3327a;
        try {
            byte[] bArr3 = ((S3.k) c0002c.f1018s).f3151c;
            if (bArr3 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr3, bArr3.length);
            }
            byte[] i7 = AbstractC0958a.i(copyOf, ((S3.a) ((S3.k) c0002c.f1018s).f3150b).a(bArr, bArr2));
            int i8 = ((S3.k) c0002c.f1018s).f;
            int length = bArr.length;
            fVar.getClass();
            return i7;
        } catch (GeneralSecurityException e3) {
            fVar.getClass();
            throw e3;
        }
    }

    @Override // S3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C0002c c0002c = this.f3327a;
        L4.f fVar = this.f3329c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (S3.k kVar : c0002c.B(copyOf)) {
                try {
                    byte[] b7 = ((S3.a) kVar.f3150b).b(copyOfRange, bArr2);
                    fVar.getClass();
                    return b7;
                } catch (GeneralSecurityException e3) {
                    Logger logger = e.f3330a;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e3);
                }
            }
        }
        for (S3.k kVar2 : c0002c.B(S3.b.f3138a)) {
            try {
                byte[] b8 = ((S3.a) kVar2.f3150b).b(bArr, bArr2);
                fVar.getClass();
                return b8;
            } catch (GeneralSecurityException unused) {
            }
        }
        fVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
