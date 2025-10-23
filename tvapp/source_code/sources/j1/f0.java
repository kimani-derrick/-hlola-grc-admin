package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class f0 extends e0 {

    /* renamed from: v  reason: collision with root package name */
    public static final SparseIntArray f11631v;

    /* renamed from: u  reason: collision with root package name */
    public long f11632u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11631v = sparseIntArray;
        sparseIntArray.put(R.id.textNoResult, 1);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11632u = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11632u != 0) {
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
            this.f11632u = 1L;
        }
        O0();
    }
}
