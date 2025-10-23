package j1;

import android.view.View;
/* renamed from: j1.O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797O extends androidx.databinding.d {

    /* renamed from: r  reason: collision with root package name */
    public final View f11580r;

    /* renamed from: s  reason: collision with root package name */
    public long f11581s;

    public C0797O(Object obj, View view, View view2) {
        super(obj, view, 0);
        this.f11580r = view2;
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11581s = 0L;
        }
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11581s != 0) {
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
            this.f11581s = 1L;
        }
        O0();
    }
}
