package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class D extends AbstractC0222b implements E, RandomAccess {

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f5699r;

    static {
        new D(10).f5742q = false;
    }

    public D(int i7) {
        this(new ArrayList(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        b();
        this.f5699r.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0222b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        b();
        if (collection instanceof E) {
            collection = ((E) collection).k();
        }
        boolean addAll = this.f5699r.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0222b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f5699r.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final E e() {
        if (this.f5742q) {
            return new n0(this);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (androidx.datastore.preferences.protobuf.v0.f5826a.j(r1.f5763r, r3, r1.size() + r3) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        r0.set(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (androidx.datastore.preferences.protobuf.v0.f5826a.j(r1, 0, r1.length) == 0) goto L13;
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
            java.util.ArrayList r0 = r7.f5699r
            java.lang.Object r1 = r0.get(r8)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            goto L5f
        Ld:
            boolean r2 = r1 instanceof androidx.datastore.preferences.protobuf.C0228g
            if (r2 == 0) goto L49
            androidx.datastore.preferences.protobuf.g r1 = (androidx.datastore.preferences.protobuf.C0228g) r1
            r1.getClass()
            java.nio.charset.Charset r2 = androidx.datastore.preferences.protobuf.AbstractC0246z.f5827a
            int r3 = r1.size()
            if (r3 != 0) goto L21
            java.lang.String r2 = ""
            goto L31
        L21:
            java.lang.String r3 = new java.lang.String
            int r4 = r1.g()
            int r5 = r1.size()
            byte[] r6 = r1.f5763r
            r3.<init>(r6, r4, r5, r2)
            r2 = r3
        L31:
            int r3 = r1.g()
            int r4 = r1.size()
            int r4 = r4 + r3
            androidx.datastore.preferences.protobuf.Q r5 = androidx.datastore.preferences.protobuf.v0.f5826a
            byte[] r1 = r1.f5763r
            int r1 = r5.j(r1, r3, r4)
            if (r1 != 0) goto L47
        L44:
            r0.set(r8, r2)
        L47:
            r1 = r2
            goto L5f
        L49:
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.AbstractC0246z.f5827a
            r2.<init>(r1, r3)
            androidx.datastore.preferences.protobuf.Q r3 = androidx.datastore.preferences.protobuf.v0.f5826a
            int r3 = r1.length
            androidx.datastore.preferences.protobuf.Q r4 = androidx.datastore.preferences.protobuf.v0.f5826a
            r5 = 0
            int r1 = r4.j(r1, r5, r3)
            if (r1 != 0) goto L47
            goto L44
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.D.get(int):java.lang.Object");
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final Object i(int i7) {
        return this.f5699r.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0245y
    public final InterfaceC0245y j(int i7) {
        ArrayList arrayList = this.f5699r;
        if (i7 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i7);
            arrayList2.addAll(arrayList);
            return new D(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final List k() {
        return Collections.unmodifiableList(this.f5699r);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final void p(C0228g c0228g) {
        b();
        this.f5699r.add(c0228g);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        b();
        Object remove = this.f5699r.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof C0228g) {
            C0228g c0228g = (C0228g) remove;
            c0228g.getClass();
            Charset charset = AbstractC0246z.f5827a;
            if (c0228g.size() == 0) {
                return "";
            }
            return new String(c0228g.f5763r, c0228g.g(), c0228g.size(), charset);
        }
        return new String((byte[]) remove, AbstractC0246z.f5827a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        Object obj2 = this.f5699r.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof C0228g) {
            C0228g c0228g = (C0228g) obj2;
            c0228g.getClass();
            Charset charset = AbstractC0246z.f5827a;
            if (c0228g.size() == 0) {
                return "";
            }
            return new String(c0228g.f5763r, c0228g.g(), c0228g.size(), charset);
        }
        return new String((byte[]) obj2, AbstractC0246z.f5827a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5699r.size();
    }

    public D(ArrayList arrayList) {
        this.f5699r = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0222b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f5699r.size(), collection);
    }
}
