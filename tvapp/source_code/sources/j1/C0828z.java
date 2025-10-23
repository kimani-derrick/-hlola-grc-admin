package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828z extends AbstractC0827y {

    /* renamed from: v  reason: collision with root package name */
    public static final SparseIntArray f11757v;

    /* renamed from: u  reason: collision with root package name */
    public long f11758u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11757v = sparseIntArray;
        sparseIntArray.put(R.id.textLabel, 1);
        sparseIntArray.put(R.id.imageClose, 2);
        sparseIntArray.put(R.id.listSettings, 3);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11758u = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11758u != 0) {
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
            this.f11758u = 1L;
        }
        O0();
    }
}
