package X3;

import H2.C0002c;
import L4.f;
import S3.k;
import Z3.g;
import Z3.h;
import Z3.r;
import c4.C0392a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class b implements S3.c {

    /* renamed from: a  reason: collision with root package name */
    public final C0002c f4282a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4283b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4284c;

    public b(C0002c c0002c) {
        this.f4282a = c0002c;
        boolean z7 = !((C0392a) c0002c.f1019t).f7270a.isEmpty();
        f fVar = r.f4729a;
        if (z7) {
            g gVar = (g) h.f4707b.f4709a.get();
            gVar = gVar == null ? h.f4708c : gVar;
            r.a(c0002c);
            gVar.getClass();
        }
        this.f4283b = fVar;
        this.f4284c = fVar;
    }

    @Override // S3.c
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] copyOf;
        f fVar = this.f4283b;
        C0002c c0002c = this.f4282a;
        try {
            byte[] bArr3 = ((k) c0002c.f1018s).f3151c;
            if (bArr3 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr3, bArr3.length);
            }
            byte[] i7 = AbstractC0958a.i(copyOf, ((S3.c) ((k) c0002c.f1018s).f3150b).a(bArr, bArr2));
            int i8 = ((k) c0002c.f1018s).f;
            fVar.getClass();
            return i7;
        } catch (GeneralSecurityException e3) {
            fVar.getClass();
            throw e3;
        }
    }

    @Override // S3.c
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C0002c c0002c = this.f4282a;
        f fVar = this.f4284c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (k kVar : c0002c.B(copyOf)) {
                try {
                    byte[] b7 = ((S3.c) kVar.f3150b).b(copyOfRange, bArr2);
                    fVar.getClass();
                    return b7;
                } catch (GeneralSecurityException e3) {
                    Logger logger = c.f4285a;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e3);
                }
            }
        }
        for (k kVar2 : c0002c.B(S3.b.f3138a)) {
            try {
                byte[] b8 = ((S3.c) kVar2.f3150b).b(bArr, bArr2);
                fVar.getClass();
                return b8;
            } catch (GeneralSecurityException unused) {
            }
        }
        fVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
