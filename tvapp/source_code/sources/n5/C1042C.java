package n5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import java.util.Map;
/* renamed from: n5.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042C extends k {

    /* renamed from: a  reason: collision with root package name */
    public final y f12668a;

    /* renamed from: b  reason: collision with root package name */
    public final k f12669b;

    /* renamed from: c  reason: collision with root package name */
    public final k f12670c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f12671e;
    public final k f;

    public C1042C(y yVar) {
        this.f12668a = yVar;
        this.f12669b = yVar.a(List.class);
        this.f12670c = yVar.a(Map.class);
        this.d = yVar.a(String.class);
        this.f12671e = yVar.a(Double.class);
        this.f = yVar.a(Boolean.class);
    }

    @Override // n5.k
    public final Object b(n nVar) {
        int b7 = s.h.b(nVar.V());
        if (b7 != 0) {
            if (b7 != 2) {
                if (b7 != 5) {
                    if (b7 != 6) {
                        if (b7 != 7) {
                            if (b7 == 8) {
                                nVar.y();
                                return null;
                            }
                            throw new IllegalStateException("Expected a value but was " + AbstractC0515y1.z(nVar.V()) + " at path " + nVar.j());
                        }
                        return this.f.b(nVar);
                    }
                    return this.f12671e.b(nVar);
                }
                return this.d.b(nVar);
            }
            return this.f12670c.b(nVar);
        }
        return this.f12669b.b(nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1.isAssignableFrom(r0) != false) goto L8;
     */
    @Override // n5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(n5.q r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.b()
            r5.f()
            goto L2e
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = o5.e.f12957a
            r2 = 0
            n5.y r3 = r4.f12668a
            n5.k r0 = r3.c(r0, r1, r2)
            r0.f(r5, r6)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C1042C.f(n5.q, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
