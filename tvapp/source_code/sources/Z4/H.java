package Z4;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public static final H f4758a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final T4.c f4759b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z4.H] */
    static {
        I4.d dVar = new I4.d();
        dVar.a(G.class, C0170g.f4828a);
        dVar.a(O.class, C0171h.f4831a);
        dVar.a(C0173j.class, C0168e.f4821a);
        dVar.a(C0165b.class, C0167d.f4816a);
        dVar.a(C0164a.class, C0166c.f4811a);
        dVar.a(C0181s.class, C0169f.f4824a);
        dVar.d = true;
        f4759b = new T4.c(8, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
        r3 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z4.C0165b a(h4.f r16) {
        /*
            r0 = r16
            r16.a()
            java.lang.String r1 = "firebaseApp.applicationContext"
            android.content.Context r2 = r0.f10987a
            M5.g.e(r2, r1)
            java.lang.String r4 = r2.getPackageName()
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L29
            long r7 = I.d.c(r1)
            java.lang.String r5 = java.lang.String.valueOf(r7)
        L27:
            r7 = r5
            goto L30
        L29:
            int r5 = r1.versionCode
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L27
        L30:
            Z4.b r10 = new Z4.b
            r16.a()
            h4.i r5 = r0.f10989c
            java.lang.String r11 = r5.f11001b
            java.lang.String r5 = "firebaseApp.options.applicationId"
            M5.g.e(r11, r5)
            java.lang.String r12 = android.os.Build.MODEL
            java.lang.String r5 = "MODEL"
            M5.g.e(r12, r5)
            java.lang.String r13 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "RELEASE"
            M5.g.e(r13, r5)
            Z4.a r14 = new Z4.a
            java.lang.String r5 = "packageName"
            M5.g.e(r4, r5)
            java.lang.String r1 = r1.versionName
            if (r1 != 0) goto L59
            r5 = r7
            goto L5a
        L59:
            r5 = r1
        L5a:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r8 = "MANUFACTURER"
            M5.g.e(r1, r8)
            r16.a()
            int r8 = android.os.Process.myPid()
            java.util.ArrayList r9 = Z4.AbstractC0187y.a(r2)
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L84
            java.lang.Object r15 = r9.next()
            r3 = r15
            Z4.s r3 = (Z4.C0181s) r3
            int r3 = r3.f4866b
            if (r3 != r8) goto L82
            goto L85
        L82:
            r3 = 0
            goto L70
        L84:
            r15 = 0
        L85:
            Z4.s r15 = (Z4.C0181s) r15
            if (r15 != 0) goto Lb3
            int r3 = android.os.Build.VERSION.SDK_INT
            r9 = 33
            if (r3 < r9) goto L99
            java.lang.String r3 = L.c.d()
            java.lang.String r6 = "myProcessName()"
            M5.g.e(r3, r6)
            goto Lab
        L99:
            if (r3 < r6) goto La2
            java.lang.String r3 = I.d.n()
            if (r3 == 0) goto La2
            goto Lab
        La2:
            java.lang.String r3 = j3.AbstractC0838b.b()
            if (r3 == 0) goto La9
            goto Lab
        La9:
            java.lang.String r3 = ""
        Lab:
            Z4.s r6 = new Z4.s
            r9 = 0
            r6.<init>(r8, r9, r3, r9)
            r8 = r6
            goto Lb4
        Lb3:
            r8 = r15
        Lb4:
            r16.a()
            java.util.ArrayList r9 = Z4.AbstractC0187y.a(r2)
            r3 = r14
            r6 = r7
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.<init>(r11, r12, r13, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.H.a(h4.f):Z4.b");
    }
}
