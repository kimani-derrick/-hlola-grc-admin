package j1;

import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788F extends AbstractC0787E {

    /* renamed from: B  reason: collision with root package name */
    public static final SparseIntArray f11557B;

    /* renamed from: A  reason: collision with root package name */
    public long f11558A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11557B = sparseIntArray;
        sparseIntArray.put(R.id.imageLogo, 1);
        sparseIntArray.put(R.id.textTitle, 2);
        sparseIntArray.put(R.id.textChangelog, 3);
        sparseIntArray.put(R.id.buttonUpdateNow, 4);
        sparseIntArray.put(R.id.buttonUpdateLater, 5);
        sparseIntArray.put(R.id.buttonSkipVer, 6);
        sparseIntArray.put(R.id.imageMask, 7);
        sparseIntArray.put(R.id.layoutDownloading, 8);
        sparseIntArray.put(R.id.imageDialogLogo, 9);
        sparseIntArray.put(R.id.textTitleVersion, 10);
        sparseIntArray.put(R.id.textView2, 11);
        sparseIntArray.put(R.id.progressDownload, 12);
        sparseIntArray.put(R.id.textPercent, 13);
        sparseIntArray.put(R.id.buttonCancel, 14);
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11558A = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11558A != 0) {
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
            this.f11558A = 1L;
        }
        O0();
    }
}
