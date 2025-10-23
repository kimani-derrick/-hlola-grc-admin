package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.T  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801T extends AbstractC0800S {

    /* renamed from: v  reason: collision with root package name */
    public static final SparseIntArray f11589v;

    /* renamed from: u  reason: collision with root package name */
    public long f11590u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11589v = sparseIntArray;
        sparseIntArray.put(R.id.textView, 1);
        sparseIntArray.put(R.id.imageTick, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11590u = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11590u != 0) {
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
            this.f11590u = 1L;
        }
        O0();
    }
}
