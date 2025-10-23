package L3;

import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2122q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f2123r;

    public /* synthetic */ v(TextInputLayout textInputLayout, int i7) {
        this.f2122q = i7;
        this.f2123r = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2122q) {
            case 0:
                TextInputLayout textInputLayout = this.f2123r;
                textInputLayout.f9011x0.performClick();
                textInputLayout.f9011x0.jumpDrawablesToCurrentState();
                return;
            default:
                this.f2123r.f9004u.requestLayout();
                return;
        }
    }
}
