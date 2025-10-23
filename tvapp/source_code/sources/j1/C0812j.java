package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812j extends AbstractC0811i {

    /* renamed from: v  reason: collision with root package name */
    public static final SparseIntArray f11653v;

    /* renamed from: u  reason: collision with root package name */
    public long f11654u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11653v = sparseIntArray;
        sparseIntArray.put(R.id.layoutSpeed, 1);
        sparseIntArray.put(R.id.textLabelSpeed, 2);
        sparseIntArray.put(R.id.groupSpeed, 3);
        sparseIntArray.put(R.id.radioSpeed0dot25, 4);
        sparseIntArray.put(R.id.radioSpeed0dot5, 5);
        sparseIntArray.put(R.id.radioSpeed0dot75, 6);
        sparseIntArray.put(R.id.radioSpeed1, 7);
        sparseIntArray.put(R.id.radioSpeed1dot25, 8);
        sparseIntArray.put(R.id.radioSpeed1dot5, 9);
        sparseIntArray.put(R.id.radioSpeed1dot75, 10);
        sparseIntArray.put(R.id.radioSpeed2, 11);
        sparseIntArray.put(R.id.imageCloseSpeed, 12);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11654u = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11654u != 0) {
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
            this.f11654u = 1L;
        }
        O0();
    }
}
