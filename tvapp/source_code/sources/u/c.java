package u;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Iterator;
import t.C1218d;
import t.C1219e;
/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f14610k;

    /* renamed from: l  reason: collision with root package name */
    public int f14611l;

    public c(C1218d c1218d, int i7) {
        super(c1218d);
        C1218d c1218d2;
        m mVar;
        int i8;
        m mVar2;
        this.f14610k = new ArrayList();
        this.f = i7;
        C1218d c1218d3 = this.f14636b;
        while (true) {
            C1218d i9 = c1218d3.i(i7);
            c1218d2 = c1218d3;
            c1218d3 = i9;
            if (c1218d3 == null) {
                break;
            }
            i7 = this.f;
        }
        this.f14636b = c1218d2;
        int i10 = this.f;
        if (i10 == 0) {
            mVar = c1218d2.d;
        } else if (i10 == 1) {
            mVar = c1218d2.f14476e;
        } else {
            mVar = null;
        }
        ArrayList arrayList = this.f14610k;
        arrayList.add(mVar);
        C1218d h7 = c1218d2.h(this.f);
        while (h7 != null) {
            int i11 = this.f;
            if (i11 == 0) {
                mVar2 = h7.d;
            } else if (i11 == 1) {
                mVar2 = h7.f14476e;
            } else {
                mVar2 = null;
            }
            arrayList.add(mVar2);
            h7 = h7.h(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar3 = (m) it.next();
            int i12 = this.f;
            if (i12 == 0) {
                mVar3.f14636b.f14472b = this;
            } else if (i12 == 1) {
                mVar3.f14636b.f14474c = this;
            }
        }
        if (this.f == 0 && ((C1219e) this.f14636b.f14453I).f14500h0 && arrayList.size() > 1) {
            this.f14636b = ((m) arrayList.get(arrayList.size() - 1)).f14636b;
        }
        if (this.f == 0) {
            i8 = this.f14636b.f14467X;
        } else {
            i8 = this.f14636b.f14468Y;
        }
        this.f14611l = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:
        if (r2 != r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ba, code lost:
        if (r2 != r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01bc, code lost:
        r13 = r13 + 1;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01bf, code lost:
        r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x03b6, code lost:
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    @Override // u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(u.d r27) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.a(u.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
        u.m.b(r5, r1, -r0);
     */
    @Override // u.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f14610k
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            u.m r2 = (u.m) r2
            r2.d()
            goto L6
        L16:
            int r1 = r0.size()
            r2 = 1
            if (r1 >= r2) goto L1e
            return
        L1e:
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            u.m r4 = (u.m) r4
            t.d r4 = r4.f14636b
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            u.m r0 = (u.m) r0
            t.d r0 = r0.f14636b
            int r1 = r7.f
            u.f r5 = r7.f14641i
            u.f r6 = r7.f14640h
            if (r1 != 0) goto L6c
            t.c r1 = r4.f14493x
            t.c r0 = r0.f14495z
            u.f r2 = u.m.i(r1, r3)
            int r1 = r1.b()
            t.d r4 = r7.m()
            if (r4 == 0) goto L50
            t.c r1 = r4.f14493x
            int r1 = r1.b()
        L50:
            if (r2 == 0) goto L55
            u.m.b(r6, r2, r1)
        L55:
            u.f r1 = u.m.i(r0, r3)
            int r0 = r0.b()
            t.d r2 = r7.n()
            if (r2 == 0) goto L69
            t.c r0 = r2.f14495z
            int r0 = r0.b()
        L69:
            if (r1 == 0) goto La3
            goto L9f
        L6c:
            t.c r1 = r4.f14494y
            t.c r0 = r0.f14446A
            u.f r3 = u.m.i(r1, r2)
            int r1 = r1.b()
            t.d r4 = r7.m()
            if (r4 == 0) goto L84
            t.c r1 = r4.f14494y
            int r1 = r1.b()
        L84:
            if (r3 == 0) goto L89
            u.m.b(r6, r3, r1)
        L89:
            u.f r1 = u.m.i(r0, r2)
            int r0 = r0.b()
            t.d r2 = r7.n()
            if (r2 == 0) goto L9d
            t.c r0 = r2.f14446A
            int r0 = r0.b()
        L9d:
            if (r1 == 0) goto La3
        L9f:
            int r0 = -r0
            u.m.b(r5, r1, r0)
        La3:
            r6.f14619a = r7
            r5.f14619a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.d():void");
    }

    @Override // u.m
    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14610k;
            if (i7 < arrayList.size()) {
                ((m) arrayList.get(i7)).e();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // u.m
    public final void f() {
        this.f14637c = null;
        Iterator it = this.f14610k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // u.m
    public final long j() {
        ArrayList arrayList = this.f14610k;
        int size = arrayList.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) arrayList.get(i7);
            j7 = mVar.f14641i.f + mVar.j() + j7 + mVar.f14640h.f;
        }
        return j7;
    }

    @Override // u.m
    public final boolean k() {
        ArrayList arrayList = this.f14610k;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((m) arrayList.get(i7)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C1218d m() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14610k;
            if (i7 < arrayList.size()) {
                C1218d c1218d = ((m) arrayList.get(i7)).f14636b;
                if (c1218d.f14466V != 8) {
                    return c1218d;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final C1218d n() {
        ArrayList arrayList = this.f14610k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1218d c1218d = ((m) arrayList.get(size)).f14636b;
            if (c1218d.f14466V != 8) {
                return c1218d;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String concat = "ChainRun ".concat(str);
        Iterator it = this.f14610k.iterator();
        while (it.hasNext()) {
            String m7 = AbstractC0515y1.m(concat, "<");
            concat = AbstractC0515y1.m(m7 + ((m) it.next()), "> ");
        }
        return concat;
    }
}
