package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.Q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799Q extends AbstractC0798P {

    /* renamed from: u  reason: collision with root package name */
    public static final SparseIntArray f11584u;

    /* renamed from: t  reason: collision with root package name */
    public long f11585t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11584u = sparseIntArray;
        sparseIntArray.put(R.id.imageNetwork, 1);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11585t = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11585t != 0) {
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
            this.f11585t = 1L;
        }
        O0();
    }
}
