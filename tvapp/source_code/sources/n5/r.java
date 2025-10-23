package n5;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class r implements Comparator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12727q;

    public /* synthetic */ r(int i7) {
        this.f12727q = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r3 = r6.f12727q
            switch(r3) {
                case 0: goto L93;
                case 1: goto L89;
                case 2: goto L78;
                case 3: goto L6e;
                case 4: goto L3a;
                case 5: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.lang.reflect.Field r3 = K.O.f1447a
            float r7 = K.D.m(r7)
            float r8 = K.D.m(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L1c
            r0 = r2
            goto L21
        L1c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            w6.d r7 = (w6.d) r7
            v6.w r7 = r7.f16106a
            w6.d r8 = (w6.d) r8
            v6.w r8 = r8.f16106a
            if (r7 != r8) goto L2d
            goto L39
        L2d:
            if (r7 != 0) goto L31
            r0 = r2
            goto L39
        L31:
            if (r8 != 0) goto L35
            r0 = r1
            goto L39
        L35:
            int r0 = r7.compareTo(r8)
        L39:
            return r0
        L3a:
            w0.u r7 = (w0.C1366u) r7
            w0.u r8 = (w0.C1366u) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.d
            if (r3 != 0) goto L44
            r4 = r1
            goto L45
        L44:
            r4 = r0
        L45:
            androidx.recyclerview.widget.RecyclerView r5 = r8.d
            if (r5 != 0) goto L4b
            r5 = r1
            goto L4c
        L4b:
            r5 = r0
        L4c:
            if (r4 == r5) goto L53
            if (r3 != 0) goto L51
            goto L63
        L51:
            r0 = r2
            goto L6d
        L53:
            boolean r3 = r7.f15682a
            boolean r4 = r8.f15682a
            if (r3 == r4) goto L5c
            if (r3 == 0) goto L63
            goto L51
        L5c:
            int r1 = r8.f15683b
            int r2 = r7.f15683b
            int r1 = r1 - r2
            if (r1 == 0) goto L65
        L63:
            r0 = r1
            goto L6d
        L65:
            int r7 = r7.f15684c
            int r8 = r8.f15684c
            int r7 = r7 - r8
            if (r7 == 0) goto L6d
            r0 = r7
        L6d:
            return r0
        L6e:
            w0.n r7 = (w0.C1360n) r7
            w0.n r8 = (w0.C1360n) r8
            int r7 = r7.f15610a
            int r8 = r8.f15610a
            int r7 = r7 - r8
            return r7
        L78:
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r7.longValue()
            long r7 = r8.longValue()
            int r7 = java.lang.Long.compare(r0, r7)
            return r7
        L89:
            s.i r7 = (s.i) r7
            s.i r8 = (s.i) r8
            int r7 = r7.f13514b
            int r8 = r8.f13514b
            int r7 = r7 - r8
            return r7
        L93:
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r7 = r7.compareTo(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.r.compare(java.lang.Object, java.lang.Object):int");
    }
}
