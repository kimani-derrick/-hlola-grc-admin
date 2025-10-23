package k2;

import O3.C;
import O3.E;
import O3.U;
import androidx.fragment.app.D;
import java.util.ArrayList;
import java.util.Collections;
import l2.C0969a;
import m2.C0988b;
import n2.C1031b;
import o2.C1064b;
import p2.C1085a;
import q2.C1108d;
import r2.C1117d;
import u2.C1265a;
import u2.C1267c;
import u2.C1268d;
import u2.y;
/* renamed from: k2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944i implements InterfaceC0949n {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12170b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: c  reason: collision with root package name */
    public static final D f12171c = new D(new f2.d(22));
    public static final D d = new D(new f2.d(23));

    /* renamed from: a  reason: collision with root package name */
    public U f12172a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:18:0x003b, B:21:0x0041, B:22:0x0044, B:25:0x0049), top: B:30:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:18:0x003b, B:21:0x0041, B:22:0x0044, B:25:0x0049), top: B:30:0x0001 }] */
    @Override // k2.InterfaceC0949n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized k2.InterfaceC0946k[] a(android.net.Uri r6, java.util.Map r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47
            int[] r1 = k2.C0944i.f12170b     // Catch: java.lang.Throwable -> L47
            r2 = 16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "Content-Type"
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L47
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L47
            r3 = 0
            if (r7 == 0) goto L23
            boolean r4 = r7.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L47
            goto L24
        L23:
            r7 = 0
        L24:
            int r7 = Z2.AbstractC0156a.y(r7)     // Catch: java.lang.Throwable -> L47
            r4 = -1
            if (r7 == r4) goto L2e
            r5.b(r7, r0)     // Catch: java.lang.Throwable -> L47
        L2e:
            int r6 = Z2.AbstractC0156a.z(r6)     // Catch: java.lang.Throwable -> L47
            if (r6 == r4) goto L39
            if (r6 == r7) goto L39
            r5.b(r6, r0)     // Catch: java.lang.Throwable -> L47
        L39:
            if (r3 >= r2) goto L49
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L47
            if (r4 == r7) goto L44
            if (r4 == r6) goto L44
            r5.b(r4, r0)     // Catch: java.lang.Throwable -> L47
        L44:
            int r3 = r3 + 1
            goto L39
        L47:
            r6 = move-exception
            goto L57
        L49:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L47
            k2.k[] r6 = new k2.InterfaceC0946k[r6]     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch: java.lang.Throwable -> L47
            k2.k[] r6 = (k2.InterfaceC0946k[]) r6     // Catch: java.lang.Throwable -> L47
            monitor-exit(r5)
            return r6
        L57:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C0944i.a(android.net.Uri, java.util.Map):k2.k[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v21, types: [v2.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [m2.b] */
    public final void b(int i7, ArrayList arrayList) {
        Object c1265a;
        C1085a c1085a;
        switch (i7) {
            case 0:
                c1265a = new C1265a();
                arrayList.add(c1265a);
                return;
            case 1:
                c1265a = new C1267c();
                arrayList.add(c1265a);
                return;
            case 2:
                c1265a = new C1268d();
                arrayList.add(c1265a);
                return;
            case 3:
                c1265a = new C0969a();
                arrayList.add(c1265a);
                return;
            case 4:
                c1265a = f12171c.B(0);
                if (c1265a == null) {
                    c1265a = new C1031b();
                }
                arrayList.add(c1265a);
                return;
            case 5:
                c1265a = new C1064b();
                arrayList.add(c1265a);
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                c1265a = new C1108d();
                arrayList.add(c1265a);
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                c1265a = new C1117d();
                arrayList.add(c1265a);
                return;
            case 8:
                arrayList.add(new s2.j(0, null, Collections.emptyList()));
                c1265a = new s2.n();
                arrayList.add(c1265a);
                return;
            case 9:
                c1265a = new Object();
                arrayList.add(c1265a);
                return;
            case 10:
                c1265a = new y();
                arrayList.add(c1265a);
                return;
            case 11:
                if (this.f12172a == null) {
                    C c5 = E.f2597r;
                    this.f12172a = U.f2621u;
                }
                c1265a = new u2.D(1, new Z2.E(0L), new l6.n(0, this.f12172a));
                arrayList.add(c1265a);
                return;
            case 12:
                ?? obj = new Object();
                obj.f15305c = 0;
                obj.d = -1L;
                obj.f = -1;
                obj.f15307g = -1L;
                c1085a = obj;
                arrayList.add(c1085a);
                return;
            case 13:
            default:
                return;
            case 14:
                c1085a = new C1085a();
                arrayList.add(c1085a);
                return;
            case 15:
                InterfaceC0946k B6 = d.B(new Object[0]);
                c1085a = B6;
                if (B6 == null) {
                    return;
                }
                arrayList.add(c1085a);
                return;
            case 16:
                c1085a = new C0988b();
                arrayList.add(c1085a);
                return;
        }
    }
}
