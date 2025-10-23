package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class M extends Fragment {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f6766r = 0;

    /* renamed from: q  reason: collision with root package name */
    public Z5.n f6767q;

    public final void a(EnumC0336n enumC0336n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            M5.g.e(activity, "activity");
            P.e(activity, enumC0336n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0336n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0336n.ON_DESTROY);
        this.f6767q = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0336n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Z5.n nVar = this.f6767q;
        if (nVar != null) {
            ((F) nVar.f4918q).a();
        }
        a(EnumC0336n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Z5.n nVar = this.f6767q;
        if (nVar != null) {
            F f = (F) nVar.f4918q;
            int i7 = f.f6734q + 1;
            f.f6734q = i7;
            if (i7 == 1 && f.f6737t) {
                f.f6739v.G(EnumC0336n.ON_START);
                f.f6737t = false;
            }
        }
        a(EnumC0336n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0336n.ON_STOP);
    }
}
