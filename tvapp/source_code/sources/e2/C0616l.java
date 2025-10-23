package e2;

import H2.C0023y;
import Z2.AbstractC0156a;
/* renamed from: e2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616l extends o0 {

    /* renamed from: s  reason: collision with root package name */
    public final int f10004s;

    /* renamed from: t  reason: collision with root package name */
    public final String f10005t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10006u;

    /* renamed from: v  reason: collision with root package name */
    public final K f10007v;

    /* renamed from: w  reason: collision with root package name */
    public final int f10008w;

    /* renamed from: x  reason: collision with root package name */
    public final C0023y f10009x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f10010y;

    static {
        int i7 = Z2.H.f4603a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public C0616l(int i7, Throwable th, int i8) {
        this(i7, th, i8, null, -1, null, 4, false);
    }

    public final C0616l a(H2.A a7) {
        String message = getMessage();
        int i7 = Z2.H.f4603a;
        return new C0616l(message, getCause(), this.f10040q, this.f10004s, this.f10005t, this.f10006u, this.f10007v, this.f10008w, a7, this.f10041r, this.f10010y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0616l(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, e2.K r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto L14
            java.lang.String r0 = "Unexpected runtime error"
        Ld:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L14:
            java.lang.String r0 = "Remote error"
            goto Ld
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = Z2.H.f4603a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0515y1.m(r0, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0616l.<init>(int, java.lang.Throwable, int, java.lang.String, int, e2.K, int, boolean):void");
    }

    public C0616l(String str, Throwable th, int i7, int i8, String str2, int i9, K k5, int i10, H2.A a7, long j7, boolean z7) {
        super(str, th, i7, j7);
        boolean z8 = false;
        AbstractC0156a.f(!z7 || i8 == 1);
        AbstractC0156a.f((th != null || i8 == 3) ? true : z8);
        this.f10004s = i8;
        this.f10005t = str2;
        this.f10006u = i9;
        this.f10007v = k5;
        this.f10008w = i10;
        this.f10009x = a7;
        this.f10010y = z7;
    }
}
