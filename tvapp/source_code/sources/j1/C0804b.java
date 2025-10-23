package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804b extends AbstractC0803a {

    /* renamed from: t  reason: collision with root package name */
    public static final SparseIntArray f11609t;

    /* renamed from: s  reason: collision with root package name */
    public long f11610s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11609t = sparseIntArray;
        sparseIntArray.put(R.id.playerView, 1);
        sparseIntArray.put(R.id.container, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11610s = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11610s != 0) {
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
            this.f11610s = 1L;
        }
        O0();
    }
}
