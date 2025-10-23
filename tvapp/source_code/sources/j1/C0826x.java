package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826x extends AbstractC0825w {
    public static final SparseIntArray F;

    /* renamed from: E  reason: collision with root package name */
    public long f11753E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 1);
        sparseIntArray.put(R.id.textMovieName, 2);
        sparseIntArray.put(R.id.buttonQuality, 3);
        sparseIntArray.put(R.id.buttonSubtitle, 4);
        sparseIntArray.put(R.id.buttonSpeed, 5);
        sparseIntArray.put(R.id.buttonPlayPause, 6);
        sparseIntArray.put(R.id.exoProgressCustom, 7);
        sparseIntArray.put(R.id.textPosition, 8);
        sparseIntArray.put(R.id.exo_duration, 9);
        sparseIntArray.put(R.id.layoutSeek, 10);
        sparseIntArray.put(R.id.textTime, 11);
        sparseIntArray.put(R.id.textSeekTime, 12);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11753E = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11753E != 0) {
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
            this.f11753E = 1L;
        }
        O0();
    }
}
