package N0;

import L5.p;
import W5.InterfaceC0116x;
import z5.C1530l;
/* loaded from: classes.dex */
public final class g extends F5.i implements p {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Q0.b f2365A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ k f2366B;

    /* renamed from: u  reason: collision with root package name */
    public int f2367u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f2368v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ S0.g f2369w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f2370x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ S0.k f2371y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ J0.c f2372z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, S0.g gVar, Object obj, S0.k kVar, J0.c cVar, Q0.b bVar, k kVar2, D5.d dVar) {
        super(2, dVar);
        this.f2368v = iVar;
        this.f2369w = gVar;
        this.f2370x = obj;
        this.f2371y = kVar;
        this.f2372z = cVar;
        this.f2365A = bVar;
        this.f2366B = kVar2;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new g(this.f2368v, this.f2369w, this.f2370x, this.f2371y, this.f2372z, this.f2365A, this.f2366B, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((g) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r15) {
        /*
            r14 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r14.f2367u
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            k3.AbstractC0958a.H(r15)
            goto L2c
        Ld:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L15:
            k3.AbstractC0958a.H(r15)
            r14.f2367u = r2
            S0.k r6 = r14.f2371y
            J0.c r7 = r14.f2372z
            N0.i r3 = r14.f2368v
            S0.g r4 = r14.f2369w
            java.lang.Object r5 = r14.f2370x
            r8 = r14
            java.lang.Object r15 = N0.i.b(r3, r4, r5, r6, r7, r8)
            if (r15 != r0) goto L2c
            return r0
        L2c:
            N0.a r15 = (N0.a) r15
            N0.i r0 = r14.f2368v
            com.google.android.gms.internal.measurement.K1 r0 = r0.f2386c
            r0.getClass()
            S0.g r1 = r14.f2369w
            int r1 = r1.f3013J
            boolean r1 = r0.AbstractC1111a.k(r1)
            r3 = 0
            r4 = 0
            Q0.b r5 = r14.f2365A
            if (r1 != 0) goto L45
        L43:
            r0 = r3
            goto L99
        L45:
            java.lang.Object r0 = r0.f8367r
            J0.j r0 = (J0.j) r0
            z5.d r0 = r0.f1299b
            java.lang.Object r0 = r0.getValue()
            Q0.d r0 = (Q0.d) r0
            if (r0 == 0) goto L43
            if (r5 != 0) goto L56
            goto L43
        L56:
            android.graphics.drawable.Drawable r1 = r15.f2317a
            boolean r6 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L5f
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            goto L60
        L5f:
            r1 = r4
        L60:
            if (r1 == 0) goto L43
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 != 0) goto L69
            goto L43
        L69:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            boolean r7 = r15.f2318b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "coil#is_sampled"
            r6.put(r8, r7)
            java.lang.String r7 = r15.d
            if (r7 == 0) goto L82
            java.lang.String r8 = "coil#disk_cache_key"
            r6.put(r8, r7)
        L82:
            java.util.Map r7 = r5.f2833r
            java.util.Map r7 = p6.l.S(r7)
            Q0.b r8 = new Q0.b
            java.lang.String r9 = r5.f2832q
            r8.<init>(r9, r7)
            java.util.Map r6 = p6.l.S(r6)
            Q0.h r0 = r0.f2836a
            r0.l(r8, r1, r6)
            r0 = r2
        L99:
            android.graphics.drawable.Drawable r7 = r15.f2317a
            if (r0 == 0) goto L9f
            r10 = r5
            goto La0
        L9f:
            r10 = r4
        La0:
            android.graphics.Bitmap$Config[] r0 = X0.e.f4059a
            N0.k r0 = r14.f2366B
            boolean r1 = r0 instanceof N0.k
            if (r1 == 0) goto Lae
            boolean r0 = r0.f2396g
            if (r0 == 0) goto Lae
            r13 = r2
            goto Laf
        Lae:
            r13 = r3
        Laf:
            S0.o r0 = new S0.o
            java.lang.String r11 = r15.d
            boolean r12 = r15.f2318b
            S0.g r8 = r14.f2369w
            int r9 = r15.f2319c
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.g.p(java.lang.Object):java.lang.Object");
    }
}
