package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790H extends AbstractC0789G {

    /* renamed from: v  reason: collision with root package name */
    public static final SparseIntArray f11562v;

    /* renamed from: u  reason: collision with root package name */
    public long f11563u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11562v = sparseIntArray;
        sparseIntArray.put(R.id.shimmerLayout, 1);
        sparseIntArray.put(R.id.imageMovie, 2);
        sparseIntArray.put(R.id.progressBar, 3);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11563u = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11563u != 0) {
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
            this.f11563u = 1L;
        }
        O0();
    }
}
