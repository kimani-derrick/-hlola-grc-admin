package w0;

import android.util.SparseArray;
import java.util.Set;
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f15496a;

    /* renamed from: b  reason: collision with root package name */
    public int f15497b;

    /* renamed from: c  reason: collision with root package name */
    public Set f15498c;

    public final Y a(int i7) {
        SparseArray sparseArray = this.f15496a;
        Y y3 = (Y) sparseArray.get(i7);
        if (y3 == null) {
            Y y4 = new Y();
            sparseArray.put(i7, y4);
            return y4;
        }
        return y3;
    }
}
