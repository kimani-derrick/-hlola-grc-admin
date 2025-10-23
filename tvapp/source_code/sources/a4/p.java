package a4;

import H2.C0002c;
import Z3.r;
import c4.C0392a;
import e4.r0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class p implements S3.j {

    /* renamed from: a  reason: collision with root package name */
    public final C0002c f5172a;

    /* renamed from: b  reason: collision with root package name */
    public final L4.f f5173b;

    /* renamed from: c  reason: collision with root package name */
    public final L4.f f5174c;

    public p(C0002c c0002c) {
        this.f5172a = c0002c;
        boolean z7 = !((C0392a) c0002c.f1019t).f7270a.isEmpty();
        L4.f fVar = r.f4729a;
        if (z7) {
            Z3.g gVar = (Z3.g) Z3.h.f4707b.f4709a.get();
            gVar = gVar == null ? Z3.h.f4708c : gVar;
            r.a(c0002c);
            gVar.getClass();
        }
        this.f5173b = fVar;
        this.f5174c = fVar;
    }

    @Override // S3.j
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        L4.f fVar = this.f5174c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            C0002c c0002c = this.f5172a;
            for (S3.k kVar : c0002c.B(copyOf)) {
                if (kVar.f3152e.equals(r0.f10138t)) {
                    bArr3 = AbstractC0958a.i(bArr2, q.f5176b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((S3.j) kVar.f3150b).a(copyOfRange, bArr3);
                    int length2 = bArr3.length;
                    fVar.getClass();
                    return;
                } catch (GeneralSecurityException e3) {
                    Logger logger = q.f5175a;
                    logger.info("tag prefix matches a key, but cannot verify: " + e3);
                }
            }
            for (S3.k kVar2 : c0002c.B(S3.b.f3138a)) {
                try {
                    ((S3.j) kVar2.f3150b).a(bArr, bArr2);
                    int length3 = bArr2.length;
                    fVar.getClass();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            fVar.getClass();
            throw new GeneralSecurityException("invalid MAC");
        }
        fVar.getClass();
        throw new GeneralSecurityException("tag too short");
    }

    @Override // S3.j
    public final byte[] b(byte[] bArr) {
        byte[] copyOf;
        L4.f fVar = this.f5173b;
        C0002c c0002c = this.f5172a;
        if (((S3.k) c0002c.f1018s).f3152e.equals(r0.f10138t)) {
            bArr = AbstractC0958a.i(bArr, q.f5176b);
        }
        try {
            byte[] bArr2 = ((S3.k) c0002c.f1018s).f3151c;
            if (bArr2 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr2, bArr2.length);
            }
            byte[] i7 = AbstractC0958a.i(copyOf, ((S3.j) ((S3.k) c0002c.f1018s).f3150b).b(bArr));
            int i8 = ((S3.k) c0002c.f1018s).f;
            int length = bArr.length;
            fVar.getClass();
            return i7;
        } catch (GeneralSecurityException e3) {
            fVar.getClass();
            throw e3;
        }
    }
}
