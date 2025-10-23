package Z2;

import android.util.SparseBooleanArray;
/* renamed from: Z2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162g {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f4633a;

    public C0162g(SparseBooleanArray sparseBooleanArray) {
        this.f4633a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f4633a;
        AbstractC0156a.i(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0162g)) {
            return false;
        }
        C0162g c0162g = (C0162g) obj;
        int i7 = H.f4603a;
        SparseBooleanArray sparseBooleanArray = this.f4633a;
        if (i7 < 24) {
            if (sparseBooleanArray.size() != c0162g.f4633a.size()) {
                return false;
            }
            for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
                if (a(i8) != c0162g.a(i8)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray.equals(c0162g.f4633a);
    }

    public final int hashCode() {
        int i7 = H.f4603a;
        SparseBooleanArray sparseBooleanArray = this.f4633a;
        if (i7 < 24) {
            int size = sparseBooleanArray.size();
            for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
                size = (size * 31) + a(i8);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
