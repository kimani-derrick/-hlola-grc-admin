package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822t extends AbstractC0821s {

    /* renamed from: t  reason: collision with root package name */
    public static final SparseIntArray f11718t;

    /* renamed from: s  reason: collision with root package name */
    public long f11719s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11718t = sparseIntArray;
        sparseIntArray.put(R.id.leftMenu, 1);
        sparseIntArray.put(R.id.nested_nav_host_fragment, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11719s = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11719s != 0) {
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
            this.f11719s = 1L;
        }
        O0();
    }
}
