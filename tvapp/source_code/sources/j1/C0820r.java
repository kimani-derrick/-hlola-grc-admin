package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820r extends AbstractC0819q {

    /* renamed from: u  reason: collision with root package name */
    public static final SparseIntArray f11715u;

    /* renamed from: t  reason: collision with root package name */
    public long f11716t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11715u = sparseIntArray;
        sparseIntArray.put(R.id.textview1, 1);
        sparseIntArray.put(R.id.textview2, 2);
        sparseIntArray.put(R.id.textview3, 3);
        sparseIntArray.put(R.id.textview4, 4);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11716t = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11716t != 0) {
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
            this.f11716t = 1L;
        }
        O0();
    }
}
