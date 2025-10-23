package S3;

import H2.C0002c;
import Z3.w;
import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0533k;
import e4.W;
import e4.X;
import e4.Y;
import e4.Z;
import e4.b0;
import e4.d0;
import e4.e0;
import e4.f0;
import e4.g0;
import e4.r0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f3142c = new f(0, "ENABLED");
    public static final f d = new f(0, "DISABLED");

    /* renamed from: e  reason: collision with root package name */
    public static final f f3143e = new f(0, "DESTROYED");

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3144a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3145b;

    public /* synthetic */ f(int i7, Object obj) {
        this.f3144a = i7;
        this.f3145b = obj;
    }

    public synchronized void a(b0 b0Var) {
        f0 e3 = e(b0Var);
        d0 d0Var = (d0) this.f3145b;
        d0Var.i();
        g0.A((g0) d0Var.f9164r, e3);
    }

    public synchronized f0 b(Y y3, r0 r0Var) {
        e0 I6;
        int g7 = g();
        if (r0Var != r0.f10136r) {
            I6 = f0.I();
            I6.i();
            f0.z((f0) I6.f9164r, y3);
            I6.i();
            f0.C((f0) I6.f9164r, g7);
            I6.i();
            f0.B((f0) I6.f9164r);
            I6.i();
            f0.A((f0) I6.f9164r, r0Var);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (f0) I6.c();
    }

    public synchronized C0002c c() {
        return C0002c.w((g0) ((d0) this.f3145b).c());
    }

    public synchronized boolean d(int i7) {
        for (f0 f0Var : Collections.unmodifiableList(((g0) ((d0) this.f3145b).f9164r).D())) {
            if (f0Var.E() == i7) {
                return true;
            }
        }
        return false;
    }

    public synchronized f0 e(b0 b0Var) {
        return b(n.e(b0Var), b0Var.D());
    }

    public Y f(AbstractC0530h abstractC0530h) {
        Z3.e eVar = (Z3.e) this.f3145b;
        try {
            P1.c g7 = eVar.g();
            AbstractC0523a u7 = g7.u(abstractC0530h);
            g7.A(u7);
            AbstractC0523a j7 = g7.j(u7);
            W G6 = Y.G();
            String e3 = eVar.e();
            G6.i();
            Y.z((Y) G6.f9164r, e3);
            try {
                int a7 = ((AbstractC0543v) j7).a(null);
                byte[] bArr = new byte[a7];
                C0533k c0533k = new C0533k(a7, bArr);
                j7.f(c0533k);
                if (c0533k.f9141c - c0533k.d == 0) {
                    C0529g c0529g = new C0529g(bArr);
                    G6.i();
                    Y.A((Y) G6.f9164r, c0529g);
                    X h7 = eVar.h();
                    G6.i();
                    Y.B((Y) G6.f9164r, h7);
                    return (Y) G6.c();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e7) {
                throw new RuntimeException(j7.c("ByteString"), e7);
            }
        } catch (B e8) {
            throw new GeneralSecurityException("Unexpected proto", e8);
        }
    }

    public synchronized int g() {
        int a7;
        do {
            a7 = w.a();
        } while (d(a7));
        return a7;
    }

    public synchronized void h(int i7) {
        for (int i8 = 0; i8 < ((g0) ((d0) this.f3145b).f9164r).C(); i8++) {
            try {
                f0 B6 = ((g0) ((d0) this.f3145b).f9164r).B(i8);
                if (B6.E() == i7) {
                    if (B6.G().equals(Z.f10130s)) {
                        d0 d0Var = (d0) this.f3145b;
                        d0Var.i();
                        g0.z((g0) d0Var.f9164r, i7);
                    } else {
                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new GeneralSecurityException("key not found: " + i7);
    }

    public String toString() {
        switch (this.f3144a) {
            case 0:
                return (String) this.f3145b;
            default:
                return super.toString();
        }
    }

    public f(Z3.e eVar, Class cls) {
        this.f3144a = 2;
        if (((Map) eVar.f4706c).keySet().contains(cls) || Void.class.equals(cls)) {
            this.f3145b = eVar;
            return;
        }
        String obj = eVar.toString();
        String name = cls.getName();
        throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
    }
}
