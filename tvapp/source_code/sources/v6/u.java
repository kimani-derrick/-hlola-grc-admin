package v6;

import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class u extends A5.e implements RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    public final C1344i[] f15414q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f15415r;

    public u(C1344i[] c1344iArr, int[] iArr) {
        this.f15414q = c1344iArr;
        this.f15415r = iArr;
    }

    @Override // A5.e
    public final int b() {
        return this.f15414q.length;
    }

    @Override // A5.e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C1344i)) {
            return false;
        }
        return super.contains((C1344i) obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f15414q[i7];
    }

    @Override // A5.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C1344i)) {
            return -1;
        }
        return super.indexOf((C1344i) obj);
    }

    @Override // A5.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C1344i)) {
            return -1;
        }
        return super.lastIndexOf((C1344i) obj);
    }
}
