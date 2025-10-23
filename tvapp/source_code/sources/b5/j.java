package b5;

import H2.C0002c;
import Z4.AbstractC0182t;
import Z4.C0165b;
import Z4.H;
import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final C0383h f7158c = new Object();
    public static final X.b d = m3.g.C(AbstractC0182t.f4869b, new T4.c(23, C0382g.f7152r));

    /* renamed from: a  reason: collision with root package name */
    public final o f7159a;

    /* renamed from: b  reason: collision with root package name */
    public final o f7160b;

    /* JADX WARN: Type inference failed for: r9v1, types: [Z5.n, b5.o, java.lang.Object] */
    public j(h4.f fVar, D5.i iVar, D5.i iVar2, N4.e eVar) {
        fVar.a();
        Context context = fVar.f10987a;
        M5.g.e(context, "firebaseApp.applicationContext");
        H h7 = H.f4758a;
        C0165b a7 = H.a(fVar);
        ?? obj = new Object();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        obj.f4918q = bundle == null ? Bundle.EMPTY : bundle;
        C0002c c0002c = new C0002c(a7, iVar);
        f7158c.getClass();
        C0379d c0379d = new C0379d(iVar2, eVar, a7, c0002c, d.a(context, C0383h.f7153a[0]));
        this.f7159a = obj;
        this.f7160b = c0379d;
    }

    public final double a() {
        Double j7 = this.f7159a.j();
        if (j7 != null) {
            double doubleValue = j7.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double j8 = this.f7160b.j();
        if (j8 != null) {
            double doubleValue2 = j8.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(D5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b5.C0384i
            if (r0 == 0) goto L13
            r0 = r6
            b5.i r0 = (b5.C0384i) r0
            int r1 = r0.f7157w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7157w = r1
            goto L18
        L13:
            b5.i r0 = new b5.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7155u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f7157w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            k3.AbstractC0958a.H(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            b5.j r2 = r0.f7154t
            k3.AbstractC0958a.H(r6)
            goto L49
        L38:
            k3.AbstractC0958a.H(r6)
            r0.f7154t = r5
            r0.f7157w = r4
            b5.o r6 = r5.f7159a
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            b5.o r6 = r2.f7160b
            r2 = 0
            r0.f7154t = r2
            r0.f7157w = r3
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            z5.l r6 = z5.C1530l.f16479a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.j.b(D5.d):java.lang.Object");
    }
}
