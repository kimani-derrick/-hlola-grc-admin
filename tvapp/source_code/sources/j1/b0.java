package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class b0 extends a0 {

    /* renamed from: t  reason: collision with root package name */
    public static final SparseIntArray f11611t;

    /* renamed from: s  reason: collision with root package name */
    public long f11612s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11611t = sparseIntArray;
        sparseIntArray.put(R.id.textTitle, 1);
        sparseIntArray.put(R.id.textMessage, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11612s = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11612s != 0) {
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
            this.f11612s = 1L;
        }
        O0();
    }
}
