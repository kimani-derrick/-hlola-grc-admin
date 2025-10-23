package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784B extends AbstractC0783A {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f11541x;

    /* renamed from: w  reason: collision with root package name */
    public long f11542w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11541x = sparseIntArray;
        sparseIntArray.put(R.id.layoutLogin, 1);
        sparseIntArray.put(R.id.buttonLoginTrakt, 2);
        sparseIntArray.put(R.id.textUsername, 3);
        sparseIntArray.put(R.id.layoutChooseSubtitle, 4);
        sparseIntArray.put(R.id.buttonChooseSubtitle, 5);
        sparseIntArray.put(R.id.textSubtitle, 6);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11542w = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11542w != 0) {
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
            this.f11542w = 1L;
        }
        O0();
    }
}
