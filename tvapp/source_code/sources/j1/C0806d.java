package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806d extends AbstractC0805c {

    /* renamed from: u  reason: collision with root package name */
    public static final SparseIntArray f11622u;

    /* renamed from: t  reason: collision with root package name */
    public long f11623t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11622u = sparseIntArray;
        sparseIntArray.put(R.id.nav_host_fragment, 1);
        sparseIntArray.put(R.id.progressBar, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11623t = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11623t != 0) {
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
            this.f11623t = 1L;
        }
        O0();
    }
}
