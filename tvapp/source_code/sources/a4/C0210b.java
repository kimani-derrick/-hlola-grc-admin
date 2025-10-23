package a4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import e4.C0631a;
import e4.C0632b;
import e4.C0633c;
import e4.C0634d;
import e4.C0635e;
import e4.C0636f;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: a4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210b extends P1.c {
    @Override // P1.c
    public final void A(AbstractC0523a abstractC0523a) {
        C0634d c0634d = (C0634d) abstractC0523a;
        C0211c.m(c0634d.C());
        if (c0634d.B() == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // P1.c
    public final AbstractC0523a j(AbstractC0523a abstractC0523a) {
        C0634d c0634d = (C0634d) abstractC0523a;
        C0631a F = C0632b.F();
        F.i();
        C0632b.z((C0632b) F.f9164r);
        byte[] a7 = f4.n.a(c0634d.B());
        C0529g f = AbstractC0530h.f(a7, 0, a7.length);
        F.i();
        C0632b.A((C0632b) F.f9164r, f);
        C0636f C3 = c0634d.C();
        F.i();
        C0632b.B((C0632b) F.f9164r, C3);
        return (C0632b) F.c();
    }

    @Override // P1.c
    public final Map t() {
        HashMap hashMap = new HashMap();
        C0633c D6 = C0634d.D();
        D6.i();
        C0634d.z((C0634d) D6.f9164r);
        C0635e C3 = C0636f.C();
        C3.i();
        C0636f.z((C0636f) C3.f9164r);
        D6.i();
        C0634d.A((C0634d) D6.f9164r, (C0636f) C3.c());
        hashMap.put("AES_CMAC", new Z3.d((C0634d) D6.c(), 1));
        C0633c D7 = C0634d.D();
        D7.i();
        C0634d.z((C0634d) D7.f9164r);
        C0635e C6 = C0636f.C();
        C6.i();
        C0636f.z((C0636f) C6.f9164r);
        D7.i();
        C0634d.A((C0634d) D7.f9164r, (C0636f) C6.c());
        hashMap.put("AES256_CMAC", new Z3.d((C0634d) D7.c(), 1));
        C0633c D8 = C0634d.D();
        D8.i();
        C0634d.z((C0634d) D8.f9164r);
        C0635e C7 = C0636f.C();
        C7.i();
        C0636f.z((C0636f) C7.f9164r);
        D8.i();
        C0634d.A((C0634d) D8.f9164r, (C0636f) C7.c());
        hashMap.put("AES256_CMAC_RAW", new Z3.d((C0634d) D8.c(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // P1.c
    public final AbstractC0523a u(AbstractC0530h abstractC0530h) {
        return C0634d.E(abstractC0530h, C0536n.a());
    }
}
