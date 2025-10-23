package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786D extends AbstractC0785C {

    /* renamed from: v  reason: collision with root package name */
    public static final SparseIntArray f11546v;

    /* renamed from: u  reason: collision with root package name */
    public long f11547u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11546v = sparseIntArray;
        sparseIntArray.put(R.id.imageLogo, 1);
        sparseIntArray.put(R.id.loading, 2);
        sparseIntArray.put(R.id.buttonRetry, 3);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11547u = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11547u != 0) {
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
            this.f11547u = 1L;
        }
        O0();
    }
}
