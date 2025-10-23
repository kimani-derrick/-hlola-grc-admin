package f2;

import H2.A;
import H2.C0023y;
import e2.C0619n;
import e2.H0;
import e2.I0;
import e2.J0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h  reason: collision with root package name */
    public static final C0619n f10362h = new C0619n(1);

    /* renamed from: i  reason: collision with root package name */
    public static final Random f10363i = new Random();
    public k d;
    public String f;

    /* renamed from: a  reason: collision with root package name */
    public final I0 f10364a = new I0();

    /* renamed from: b  reason: collision with root package name */
    public final H0 f10365b = new H0();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f10366c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public J0 f10367e = J0.f9620q;

    /* renamed from: g  reason: collision with root package name */
    public long f10368g = -1;

    public final void a(g gVar) {
        long j7 = gVar.f10359c;
        if (j7 != -1) {
            this.f10368g = j7;
        }
        this.f = null;
    }

    public final synchronized void b(C0695a c0695a) {
        k kVar;
        try {
            String str = this.f;
            if (str != null) {
                g gVar = (g) this.f10366c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f10366c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.f10360e && (kVar = this.d) != null) {
                    kVar.d(c0695a, gVar2.f10357a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r13 != (-1)) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f2.g c(int r16, H2.A r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f10366c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            f2.g r8 = (f2.g) r8
            long r9 = r8.f10359c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f10358b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            f2.h r9 = r8.f10361g
            java.util.HashMap r10 = r9.f10366c
            java.lang.String r13 = r9.f
            java.lang.Object r10 = r10.get(r13)
            f2.g r10 = (f2.g) r10
            if (r10 == 0) goto L44
            long r13 = r10.f10359c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f10368g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f10359c = r9
        L51:
            H2.A r9 = r8.d
            if (r2 != 0) goto L5a
            int r10 = r8.f10358b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.d
            if (r9 != 0) goto L6b
            boolean r10 = r17.a()
            if (r10 != 0) goto L15
            long r11 = r8.f10359c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f1181b
            int r11 = r9.f1181b
            if (r10 != r11) goto L15
            int r10 = r2.f1182c
            int r11 = r9.f1182c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.f10359c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = Z2.H.f4603a
            H2.A r10 = r5.d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L97:
            r5 = r8
            r6 = r10
            goto L15
        L9b:
            if (r5 != 0) goto Lad
            e2.n r4 = f2.h.f10362h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            f2.g r5 = new f2.g
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.c(int, H2.A):f2.g");
    }

    public final synchronized String d(J0 j02, A a7) {
        return c(j02.h(a7.f1180a, this.f10365b).f9554s, a7).f10357a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [H2.y, H2.A] */
    public final void e(C0695a c0695a) {
        A a7;
        boolean q5 = c0695a.f10335b.q();
        HashMap hashMap = this.f10366c;
        if (q5) {
            String str = this.f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f);
        int i7 = c0695a.f10336c;
        A a8 = c0695a.d;
        this.f = c(i7, a8).f10357a;
        f(c0695a);
        if (a8 != null && a8.a()) {
            long j7 = a8.d;
            if (gVar2 == null || gVar2.f10359c != j7 || (a7 = gVar2.d) == null || a7.f1181b != a8.f1181b || a7.f1182c != a8.f1182c) {
                c(i7, new C0023y(j7, a8.f1180a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b3, B:42:0x00b7, B:43:0x00be, B:45:0x00c8, B:47:0x00cc, B:49:0x00d9, B:52:0x00e0), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(f2.C0695a r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.f(f2.a):void");
    }

    public final synchronized void g(C0695a c0695a, int i7) {
        boolean z7;
        try {
            this.d.getClass();
            if (i7 == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            Iterator it = this.f10366c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(c0695a)) {
                    it.remove();
                    if (gVar.f10360e) {
                        boolean equals = gVar.f10357a.equals(this.f);
                        if (z7 && equals) {
                            boolean z8 = gVar.f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.d.d(c0695a, gVar.f10357a);
                    }
                }
            }
            e(c0695a);
        } catch (Throwable th) {
            throw th;
        }
    }
}
