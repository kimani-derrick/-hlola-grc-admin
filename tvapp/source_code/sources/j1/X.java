package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class X extends W {

    /* renamed from: w  reason: collision with root package name */
    public static final SparseIntArray f11599w;

    /* renamed from: v  reason: collision with root package name */
    public long f11600v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11599w = sparseIntArray;
        sparseIntArray.put(R.id.textSeason, 1);
        sparseIntArray.put(R.id.textNumberEpisode, 2);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11600v = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11600v != 0) {
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
            this.f11600v = 1L;
        }
        O0();
    }
}
