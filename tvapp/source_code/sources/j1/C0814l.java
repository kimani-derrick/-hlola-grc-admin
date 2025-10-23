package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814l extends AbstractC0813k {

    /* renamed from: t  reason: collision with root package name */
    public static final SparseIntArray f11670t;

    /* renamed from: s  reason: collision with root package name */
    public long f11671s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11670t = sparseIntArray;
        sparseIntArray.put(R.id.view, 1);
        sparseIntArray.put(R.id.progressBar, 2);
        sparseIntArray.put(R.id.textTitle, 3);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11671s = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11671s != 0) {
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
            this.f11671s = 1L;
        }
        O0();
    }
}
