package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810h extends AbstractC0809g {

    /* renamed from: A  reason: collision with root package name */
    public static final SparseIntArray f11643A;

    /* renamed from: z  reason: collision with root package name */
    public long f11644z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11643A = sparseIntArray;
        sparseIntArray.put(R.id.layoutSpeed, 1);
        sparseIntArray.put(R.id.textLabelSpeed, 2);
        sparseIntArray.put(R.id.chipGroupQuality, 3);
        sparseIntArray.put(R.id.chipAuto, 4);
        sparseIntArray.put(R.id.chipFHD, 5);
        sparseIntArray.put(R.id.chipHD, 6);
        sparseIntArray.put(R.id.chipSDP, 7);
        sparseIntArray.put(R.id.chipSD, 8);
        sparseIntArray.put(R.id.imageCloseSpeed, 9);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11644z = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11644z != 0) {
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
            this.f11644z = 1L;
        }
        O0();
    }
}
