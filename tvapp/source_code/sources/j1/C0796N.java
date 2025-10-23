package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796N extends AbstractC0795M {

    /* renamed from: u  reason: collision with root package name */
    public static final SparseIntArray f11578u;

    /* renamed from: t  reason: collision with root package name */
    public long f11579t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11578u = sparseIntArray;
        sparseIntArray.put(R.id.shimmerLayout, 1);
        sparseIntArray.put(R.id.imageMovie, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11579t = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11579t != 0) {
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
            this.f11579t = 1L;
        }
        O0();
    }
}
