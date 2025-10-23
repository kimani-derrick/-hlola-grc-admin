package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class d0 extends c0 {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f11624z;

    /* renamed from: y  reason: collision with root package name */
    public long f11625y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11624z = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 1);
        sparseIntArray.put(R.id.imageBackdropMovie, 2);
        sparseIntArray.put(R.id.imageMask, 3);
        sparseIntArray.put(R.id.guideLine, 4);
        sparseIntArray.put(R.id.textMovieName, 5);
        sparseIntArray.put(R.id.layoutMovieInfo, 6);
        sparseIntArray.put(R.id.textRating, 7);
        sparseIntArray.put(R.id.imageDot, 8);
        sparseIntArray.put(R.id.textYear, 9);
        sparseIntArray.put(R.id.textOverview, 10);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11625y = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11625y != 0) {
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
            this.f11625y = 1L;
        }
        O0();
    }
}
