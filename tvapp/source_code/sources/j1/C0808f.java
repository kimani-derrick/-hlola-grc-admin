package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808f extends AbstractC0807e {

    /* renamed from: s  reason: collision with root package name */
    public static final SparseIntArray f11629s;

    /* renamed from: r  reason: collision with root package name */
    public long f11630r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11629s = sparseIntArray;
        sparseIntArray.put(R.id.imageIcon, 1);
        sparseIntArray.put(R.id.textTitle, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11630r = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11630r != 0) {
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
            this.f11630r = 1L;
        }
        O0();
    }
}
