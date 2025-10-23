package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class D extends AbstractC0524b implements E, RandomAccess {

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f9064r;

    static {
        new D(10).f9103q = false;
    }

    public D(int i7) {
        this(new ArrayList(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        b();
        this.f9064r.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0524b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        b();
        if (collection instanceof E) {
            collection = ((E) collection).k();
        }
        boolean addAll = this.f9064r.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0524b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f9064r.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final E e() {
        if (this.f9103q) {
            return new i0(this);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (com.google.crypto.tink.shaded.protobuf.q0.f9160a.z(r1.f9116t, r3, r1.size() + r3) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        r0.set(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (com.google.crypto.tink.shaded.protobuf.q0.f9160a.z(r1, 0, r1.length) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        return r2;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(int r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f9064r
            java.lang.Object r1 = r0.get(r8)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            goto L64
        Ld:
            boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC0530h
            if (r2 == 0) goto L4e
            com.google.crypto.tink.shaded.protobuf.h r1 = (com.google.crypto.tink.shaded.protobuf.AbstractC0530h) r1
            r1.getClass()
            java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.AbstractC0547z.f9165a
            int r3 = r1.size()
            if (r3 != 0) goto L21
            java.lang.String r2 = ""
            goto L34
        L21:
            r3 = r1
            com.google.crypto.tink.shaded.protobuf.g r3 = (com.google.crypto.tink.shaded.protobuf.C0529g) r3
            java.lang.String r4 = new java.lang.String
            int r5 = r3.n()
            int r6 = r3.size()
            byte[] r3 = r3.f9116t
            r4.<init>(r3, r5, r6, r2)
            r2 = r4
        L34:
            com.google.crypto.tink.shaded.protobuf.g r1 = (com.google.crypto.tink.shaded.protobuf.C0529g) r1
            int r3 = r1.n()
            int r4 = r1.size()
            int r4 = r4 + r3
            p6.d r5 = com.google.crypto.tink.shaded.protobuf.q0.f9160a
            byte[] r1 = r1.f9116t
            int r1 = r5.z(r1, r3, r4)
            if (r1 != 0) goto L4c
        L49:
            r0.set(r8, r2)
        L4c:
            r1 = r2
            goto L64
        L4e:
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.AbstractC0547z.f9165a
            r2.<init>(r1, r3)
            p6.d r3 = com.google.crypto.tink.shaded.protobuf.q0.f9160a
            int r3 = r1.length
            p6.d r4 = com.google.crypto.tink.shaded.protobuf.q0.f9160a
            r5 = 0
            int r1 = r4.z(r1, r5, r3)
            if (r1 != 0) goto L4c
            goto L49
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.D.get(int):java.lang.Object");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final Object i(int i7) {
        return this.f9064r.get(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0546y
    public final InterfaceC0546y j(int i7) {
        ArrayList arrayList = this.f9064r;
        if (i7 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i7);
            arrayList2.addAll(arrayList);
            return new D(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final List k() {
        return Collections.unmodifiableList(this.f9064r);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final void q(AbstractC0530h abstractC0530h) {
        b();
        this.f9064r.add(abstractC0530h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0524b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        b();
        Object remove = this.f9064r.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC0530h) {
            AbstractC0530h abstractC0530h = (AbstractC0530h) remove;
            abstractC0530h.getClass();
            Charset charset = AbstractC0547z.f9165a;
            if (abstractC0530h.size() == 0) {
                return "";
            }
            C0529g c0529g = (C0529g) abstractC0530h;
            return new String(c0529g.f9116t, c0529g.n(), c0529g.size(), charset);
        }
        return new String((byte[]) remove, AbstractC0547z.f9165a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        Object obj2 = this.f9064r.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0530h) {
            AbstractC0530h abstractC0530h = (AbstractC0530h) obj2;
            abstractC0530h.getClass();
            Charset charset = AbstractC0547z.f9165a;
            if (abstractC0530h.size() == 0) {
                return "";
            }
            C0529g c0529g = (C0529g) abstractC0530h;
            return new String(c0529g.f9116t, c0529g.n(), c0529g.size(), charset);
        }
        return new String((byte[]) obj2, AbstractC0547z.f9165a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9064r.size();
    }

    public D(ArrayList arrayList) {
        this.f9064r = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0524b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f9064r.size(), collection);
    }
}
