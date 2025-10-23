package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818p extends AbstractC0817o {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f11709x;

    /* renamed from: w  reason: collision with root package name */
    public long f11710w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11709x = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 1);
        sparseIntArray.put(R.id.textMovieName, 2);
        sparseIntArray.put(R.id.layoutMovieInfo, 3);
        sparseIntArray.put(R.id.textYear, 4);
        sparseIntArray.put(R.id.textNumberSeason, 5);
        sparseIntArray.put(R.id.recyclerSeason, 6);
        sparseIntArray.put(R.id.recyclerEpisode, 7);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11710w = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11710w != 0) {
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
            this.f11710w = 1L;
        }
        O0();
    }
}
