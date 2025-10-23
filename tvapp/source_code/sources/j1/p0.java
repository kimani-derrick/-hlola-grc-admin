package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class p0 extends o0 {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f11711z;

    /* renamed from: y  reason: collision with root package name */
    public long f11712y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11711z = sparseIntArray;
        sparseIntArray.put(R.id.viewHome, 1);
        sparseIntArray.put(R.id.viewMovies, 2);
        sparseIntArray.put(R.id.viewTvSeries, 3);
        sparseIntArray.put(R.id.viewMyList, 4);
        sparseIntArray.put(R.id.viewSearch, 5);
        sparseIntArray.put(R.id.viewSettings, 6);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11712y = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11712y != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.d
    public final void L0() {
        synchronized (this) {
            this.f11712y = 1L;
        }
        O0();
    }
}
