package d5;

import android.util.SparseIntArray;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: e  reason: collision with root package name */
    public static final k f9263e = new l();

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f9264a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public final SparseIntArray f9265b = new SparseIntArray();

    /* renamed from: c  reason: collision with root package name */
    public boolean f9266c;
    public boolean d;

    public final int a(int i7, int i8) {
        if (!this.f9266c) {
            return i7 % i8;
        }
        SparseIntArray sparseIntArray = this.f9264a;
        int i9 = sparseIntArray.get(i7, -1);
        if (i9 != -1) {
            return i9;
        }
        int i10 = i7 % i8;
        sparseIntArray.put(i7, i10);
        return i10;
    }
}
