package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792J extends AbstractC0791I {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f11569x;

    /* renamed from: w  reason: collision with root package name */
    public long f11570w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11569x = sparseIntArray;
        sparseIntArray.put(R.id.imageEpisode, 1);
        sparseIntArray.put(R.id.viewFocus, 2);
        sparseIntArray.put(R.id.imagePlayEpisode, 3);
        sparseIntArray.put(R.id.textEpisodeName, 4);
        sparseIntArray.put(R.id.textReleaseDate, 5);
        sparseIntArray.put(R.id.textEpisodeOverView, 6);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11570w = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11570w != 0) {
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
            this.f11570w = 1L;
        }
        O0();
    }
}
