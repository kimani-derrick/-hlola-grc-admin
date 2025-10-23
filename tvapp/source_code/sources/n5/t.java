package n5;

import java.util.AbstractSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class t extends AbstractSet {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12733q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ v f12734r;

    public /* synthetic */ t(v vVar, int i7) {
        this.f12733q = i7;
        this.f12734r = vVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f12733q) {
            case 0:
                this.f12734r.clear();
                return;
            default:
                this.f12734r.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f12733q
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            n5.v r0 = r4.f12734r
            boolean r5 = r0.containsKey(r5)
            return r5
        Lc:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            n5.v r0 = r4.f12734r
            r0.getClass()
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L24
            n5.u r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L24
            goto L25
        L24:
            r0 = r3
        L25:
            if (r0 == 0) goto L38
            java.lang.Object r2 = r0.f12742x
            java.lang.Object r5 = r5.getValue()
            if (r2 == r5) goto L37
            if (r2 == 0) goto L38
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L38
        L37:
            r3 = r0
        L38:
            if (r3 == 0) goto L3b
            r1 = 1
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.t.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f12733q) {
            case 0:
                return new s(this.f12734r, 0);
            default:
                return new s(this.f12734r, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f12733q
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            n5.v r0 = r5.f12734r
            r0.getClass()
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L12
            n5.u r2 = r0.a(r6, r1)     // Catch: java.lang.ClassCastException -> L12
        L12:
            r6 = 1
            if (r2 == 0) goto L18
            r0.c(r2, r6)
        L18:
            if (r2 == 0) goto L1b
            r1 = r6
        L1b:
            return r1
        L1c:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L22
            goto L50
        L22:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            n5.v r0 = r5.f12734r
            r0.getClass()
            java.lang.Object r2 = r6.getKey()
            r3 = 0
            if (r2 == 0) goto L35
            n5.u r2 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L35
            goto L36
        L35:
            r2 = r3
        L36:
            if (r2 == 0) goto L49
            java.lang.Object r4 = r2.f12742x
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L48
            if (r4 == 0) goto L49
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L49
        L48:
            r3 = r2
        L49:
            if (r3 != 0) goto L4c
            goto L50
        L4c:
            r1 = 1
            r0.c(r3, r1)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.t.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f12733q) {
            case 0:
                return this.f12734r.f12748t;
            default:
                return this.f12734r.f12748t;
        }
    }
}
